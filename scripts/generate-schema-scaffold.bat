@echo off
setlocal
cd /d "%~dp0\.."
where python >nul 2>&1
if errorlevel 1 (
  echo Python 3 was not found. Install Python 3 and add it to PATH.
  exit /b 1
)
python tools\sql-scaffold\generate.py --prune
if errorlevel 1 exit /b 1
python tools\sql-scaffold\generate.py --check
if errorlevel 1 exit /b 1
echo NROHENDY schema files are generated and verified.
