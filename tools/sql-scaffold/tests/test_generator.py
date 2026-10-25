import importlib.util
import json
import unittest
from pathlib import Path

SCRIPT = Path(__file__).resolve().parents[1] / "generate.py"
SPEC = importlib.util.spec_from_file_location("sql_scaffold_generator", SCRIPT)
assert SPEC and SPEC.loader
GEN = importlib.util.module_from_spec(SPEC)
SPEC.loader.exec_module(GEN)

SAMPLE = r"""CREATE TABLE `account` (
  `id` bigint(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `active` tinyint(1) DEFAULT 1,
  `created` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB;
CREATE TABLE `player` (
  `id` int(11) NOT NULL,
  `account_id` bigint(20) DEFAULT NULL,
  `payload` text NOT NULL
) ENGINE=InnoDB;
ALTER TABLE `player` ADD PRIMARY KEY (`id`), ADD KEY `account_id` (`account_id`);
ALTER TABLE `player` ADD CONSTRAINT `player_ibfk_1` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE CASCADE;
ALTER TABLE `account` MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
""".replace("`", chr(96))

class GeneratorTests(unittest.TestCase):
    def test_parses_columns_keys_and_foreign_keys(self):
        tables = GEN.parse_schema(SAMPLE)
        self.assertEqual([t["name"] for t in tables], ["account", "player"])
        self.assertEqual(tables[0]["primary_key"], ["id"])
        self.assertTrue(tables[0]["columns"][0]["auto_increment"])
        self.assertEqual(tables[0]["columns"][2]["java_type"], "Boolean")
        self.assertEqual(tables[0]["columns"][3]["java_type"], "java.sql.Timestamp")
        self.assertTrue(any(index["unique"] for index in tables[0]["indexes"]))
        self.assertEqual(tables[1]["foreign_keys"][0]["referenced_table"], "account")
        self.assertEqual(tables[1]["foreign_keys"][0]["on_delete"], "CASCADE")

    def test_outputs_are_schema_driven(self):
        tables = GEN.parse_schema(SAMPLE)
        outputs = GEN.render_outputs(SAMPLE, tables, "sample.sql")
        self.assertIn("src/com/girlkun/generated/model/AccountRow.java", outputs)
        self.assertIn("src/com/girlkun/generated/sql/PlayerSql.java", outputs)
        self.assertIn("SELECT_BY_PRIMARY_KEY", outputs["src/com/girlkun/generated/sql/AccountSql.java"])
        self.assertIn("player_ibfk_1", outputs["docs/database/schema-reference.md"])
        manifest = json.loads(outputs[GEN.MANIFEST_PATH])
        self.assertEqual(manifest["table_count"], 2)

if __name__ == "__main__":
    unittest.main()
