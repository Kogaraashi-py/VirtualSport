@echo off
set DIR=%~dp0
set JAR=%DIR%dist\PROYECTO.jar

echo Iniciando aplicacion...
java -jar "%JAR%"
pause

