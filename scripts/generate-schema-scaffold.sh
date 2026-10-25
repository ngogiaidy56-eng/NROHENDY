#!/usr/bin/env sh
set -eu
cd "$(dirname "$0")/.."
python3 tools/sql-scaffold/generate.py --prune
python3 tools/sql-scaffold/generate.py --check
