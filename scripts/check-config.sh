#!/usr/bin/env sh
set -eu
ROOT="$(CDPATH= cd -- "$(dirname -- "$0")/.." && pwd)"
[ -f "$ROOT/data/config/server.properties" ] || { echo "Missing data/config/server.properties (copy the .example file first)" >&2; exit 1; }
[ -f "$ROOT/data/config/database.json" ] || { echo "Missing data/config/database.json (copy the .example file first)" >&2; exit 1; }
if grep -q 'CHANGE_ME_LOCALLY' "$ROOT/data/config/database.json"; then
  echo "Database password is still a placeholder; update local config before starting." >&2
  exit 1
fi
echo "Basic config presence check passed. This does not validate DB connectivity or Java compatibility."