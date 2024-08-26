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

