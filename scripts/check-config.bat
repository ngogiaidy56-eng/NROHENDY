@echo off
setlocal
if not exist "data\config\server.properties" (
  echo Missing data\config\server.properties - copy the .example file first.
  exit /b 1
)
if not exist "data\config\database.json" (
  echo Missing data\config\database.json - copy the .example file first.
  exit /b 1
)
echo Basic config presence check passed. This does not validate DB connectivity or Java compatibility.