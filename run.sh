#!/usr/bin/env bash

# Directorio actual del script
DIR="$(cd "$(dirname "$0")" && pwd)"

# Ruta al jar
JAR="$DIR/dist/PROYECTO.jar"

# Ejecutar el jar
java -jar "$JAR"

