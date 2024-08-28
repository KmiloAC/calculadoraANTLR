# Calculadora en ANTLR

Lo primero que vamos a hacer es descargar e instalar ANTLR aquí un resumen de los pasos que se deben de hacer

# Guía de Instalación de ANTLR

ANTLR es una herramienta potente para el análisis de lenguajes y la generación de parsers. A continuación, se detalla cómo descargar, instalar y configurar ANTLR en un sistema Linux.

## Requisitos Previos

Antes de comenzar, asegúrate de tener Java instalado en tu sistema. Puedes instalar OpenJDK con el siguiente comando:

```bash
sudo apt update
sudo apt install openjdk-17-jdk
```

```bash
java -version
jar --version
```

# Configuración de ANTLR

## Descargar ANTLR

### Descargar el Archivo JAR de ANTLR

Crea un directorio para ANTLR y descarga el archivo JAR:

```bash
mkdir -p ~/apps/ANTLR
cd ~/apps/ANTLR
wget https://www.antlr.org/download/antlr-4.13.2-complete.jar
```

Esto lo puedes hacer con el comando wget o de lo contrario puedes ir directamente a la pagina web de ANTLR y descargar su última versión, que en nuestro caso es la 4.13.2 y si el caso es que lo descargaste lleva el archivo a la carpeta creada con:


```bash
mv antlr-4.7-complete.jar ~/apps/ANTLR/
```

## Agregar ANTLR al CLASSPATH

Añade ANTLR al CLASSPATH editando tu archivo de configuración de shell (~/.bashrc o ~/.zshrc):

Donde añadiremos la siguiente linea al final del codigo, donde lo guardaremos con Control + O y luego cerramos el archivo con Control + X

```bash
export CLASSPATH=".:~/apps/ANTLR/antlr-4.13.2-complete.jar:$CLASSPATH"
```
Y guardaremos el archivo de la siguiente manera para guardar la configuración, como tambien verificar su instalación.

```bash
source ~/.bashrc
# o
source ~/.zshrc
java -cp ~/apps/ANTLR/antlr-4.13.2-complete.jar org.antlr.v4.Tool
```

# Implementación de la calculadora en ANTLR

### 0. Como ejecutar el archivo?
Es posible que al ejecutar el programa presentes problemas con las versiones del compilado del programa, para eso se recomienda que primero verifiques el entorno de ejecución. Asegúrate de que la versión correcta de Java esté siendo utilizada para ejecutar tu programa. Puede haber múltiples versiones de Java instaladas, y es posible que la ejecución esté utilizando una versión diferente a la que muestra java -version. El programa esta compilado para Java 18 o superior.

#### Verifica la compilación
Asegúrate de que la clase `Calc` (Calc es el nombre del programa ejecutable) está compilada recientemente con la misma versión de Java
```bash
javac Calc.java
```
#### Eliminar clases antiguas
Si hay archivos .class que fueron compilados con versiones anteriores de Java, esto podría causar conflictos. Puedes eliminar todos los archivos .class y recompilar:
```bash
rm *.class
javac *.java
```
Ahora, intenta ejecutar el programa:
```bash
java Calc
```

Vamos a crear distintos casos de prueba para comprobar la funcionalidad de nuestra calculadora haciendo testeos de Suma, Resta, Multiplicación y División. Estos casos de prueba nos permitirán asegurarnos de que la calculadora funciona correctamente bajo diferentes condiciones y con una variedad de datos de entrada. Nos vamos a enfocar en algunos de los siguientes ejemplos.


### 1. Operaciones Básicas

    Suma de enteros positivos: 5 + 7 = 12
    Suma de enteros negativos: -3 + (-8) = -11
    Resta de enteros positivos: 10 - 4 = 6
    Resta de enteros negativos: -6 - (-2) = -4
    Multiplicación de enteros positivos: 9 * 3 = 27
    Multiplicación de un número positivo y un número negativo: -4 * 5 = -20
    División de enteros positivos: 15 / 3 = 5
    División que no da un número entero: 7 / 2 = 3.5
    División de un número negativo por un número positivo: -12 / 4 = -3
    
Para probar el funcionamiento de las operaciones básicas podemos hacerlo de dos formas:

Podemos utilizar el archivo `operacionesbasicas.expr` alojado en la carpeta `casos-de-estudio` que nos permite cargar un conjunto de expresiones para que la calculadora resuelva simultáneamente:
```bash
java Calc casos-de-estudio/operacionesbasicas.expr
```
O simplemente ejecutamos el archivo:
```bash
java Calc
```
escribimos la expresión o secuencia de expresiones, dando un salto de línea con enter y al finalizar la escritura de expresiones dar enter:
```bash
5 + 7
-3 + (-8)

```
y al dar `Ctrl+d`, obtendremos el resultado:
```bash
12.0
-11.0
```

Podremos realizar el mismo proceso como lo hicimos con el caso anterior con los siguientes para poder verificar con los diferentes casos de estudio que la calculadora funciona correctamente

### 2. Casos de Borde (Boundary Cases)

    Suma de cero con otro número: 0 + 8 = 8
    Multiplicación por cero: 0 * 7 = 0
    División por uno: 9 / 1 = 9
    División por cero: 9 / 0 (esperar un error o mensaje de advertencia)

### 3. Operaciones Combinadas

    Suma de números decimales: 2.5 + 3.7 = 6.2
    Resta de números decimales: 5.6 - 2.1 = 3.5
    Multiplicación de números decimales: 2.3 * 1.5 = 3.45
    División de números decimales: 7.5 / 2.5 = 3.0
    Operación mixta con varios operadores: 5 + 3 * 2 - 12 = -1 (comprueba el orden de operaciones)
    Operaciones con paréntesis: (5 + (3 / 3)) * 2 = 12 (comprueba el uso de paréntesis)
    
### 4. Casos de Errores

    División por cero: Verifica que la calculadora maneje este caso correctamente.
    Entrada no numérica: Intenta realizar operaciones con entradas no numéricas, como letras o símbolos, y verifica que la calculadora las rechace correctamente. EN ESTE CASO NOS DIRA QUE HAY UNA LETRA DESCONOCIDA DENTRO DE NUESTRO ARCHIVO Y TENEMOS QUE MODIFICARLO

### 5. Operaciones Combinadas

    Operación mixta con varios operadores: 5 + 3 * 2 = 11 (comprueba el orden de operaciones)
    Operaciones con paréntesis: (5 + 3) * 2 = 16 (comprueba el uso de paréntesis)
