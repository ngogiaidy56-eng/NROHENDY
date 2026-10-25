# Static game seeds

`game-static-data.sql` contains only static template/catalog data, not user-owned or operational records. It includes safe rows for tables such as `item_template`, `map_template`, `mob_template`, `part`, `small_version`, `skill_template`, `npc_template`, shop catalogs and lookup tables.

Intentionally excluded from public seeds: account/password records, player saves, guild membership data, gift-code values, auth tokens, top-up/payment records, transaction histories and user-generated posts/comments.

Apply schema first, then this seed file in a fresh development database. Review rights/licensing of game content before redistributing it.