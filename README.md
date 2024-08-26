# Calculadora en ANTLR

Lo primero que vamos a hacer es descargar e instalar ANTLR aquí un resumen de los pasos que se deben de hacer

# Guía de Instalación de ANTLR

ANTLR es una herramienta potente para el análisis de lenguajes y la generación de parsers. A continuación, se detalla cómo descargar, instalar y configurar ANTLR en un sistema Linux.

## Requisitos Previos

Antes de comenzar, asegúrate de tener Java instalado en tu sistema. Puedes instalar OpenJDK con el siguiente comando:

```bash
sudo apt update
sudo apt install openjdk-17-jdk

```bash
java -version
jar --version

# Configuración de ANTLR

## Descargar ANTLR

### Descargar el Archivo JAR de ANTLR

Crea un directorio para ANTLR y descarga el archivo JAR:

```bash
mkdir -p ~/apps/ANTLR
cd ~/apps/ANTLR
wget https://www.antlr.org/download/antlr-4.13.2-complete.jar
