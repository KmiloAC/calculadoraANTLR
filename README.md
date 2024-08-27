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

Vamos a crear distintos casos de prueba para comprobar la funcionalidad de nuestra calculadora haciendo testeos de Suma, Resta, Multiplicación y División. Estos casos de prueba nos permitirán asegurarnos de que la calculadora funciona correctamente bajo diferentes condiciones y con una variedad de datos de entrada. Nos vamos a enfocar en algunos de los siguientes ejemplos.

# ESTO ES PARA LOS QUE SIGUEN, TIENEN QUE EXPLICAR COMO HACER QUE EL ARCHIVO SEA EJECUTADO, DAR EL PASO A PASO DE COMO CADA CASO DE PRUEBA DEBE DE SER GUARDADO, EJECUTADO, ETC...


### 1. Operaciones Básicas

    Suma de enteros positivos: 5 + 7 = 12
    Resta de enteros positivos: 10 - 4 = 6
    Multiplicación de enteros positivos: 9 * 3 = 27
    División de enteros positivos: 15 / 3 = 5

### 2. Casos de Borde (Boundary Cases)

    Suma de cero con otro número: 0 + 8 = 8
    Multiplicación por cero: 0 * 7 = 0
    División por uno: 9 / 1 = 9
    División por cero: 9 / 0 (esperar un error o mensaje de advertencia)

### 3. Operaciones Combinadas

    Operación mixta con varios operadores: 5 + 3 * 2 - 12 = -1 (comprueba el orden de operaciones)
    Operaciones con paréntesis: (5 + (3 / 3)) * 2 = 12 (comprueba el uso de paréntesis)
    

### 4. Casos de Errores

    División por cero: Verifica que la calculadora maneje este caso correctamente.
    Entrada no numérica: Intenta realizar operaciones con entradas no numéricas, como letras o símbolos, y verifica que       la calculadora las rechace correctamente.


### 5. Verificación de Estado

    Encadenamiento de operaciones: 5 + 3 = 8, luego * 2 = 16 (verifica que el resultado anterior se utilice correctamente)
    Reinicio del cálculo: Después de una operación, asegúrate de que un nuevo cálculo comience correctamente.
