package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class MapTemplateSql {
    public static final String TABLE_NAME = "map_template";
    public static final String COLUMNS = "`id`, `NAME`, `zones`, `max_player`, `data`, `type`, `planet_id`, `bg_type`, `tile_id`, `bg_id`, `waypoints`, `mobs`, `npcs`";
    public static final String SELECT_ALL = "SELECT `id`, `NAME`, `zones`, `max_player`, `data`, `type`, `planet_id`, `bg_type`, `tile_id`, `bg_id`, `waypoints`, `mobs`, `npcs` FROM `map_template`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `map_template`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `NAME`, `zones`, `max_player`, `data`, `type`, `planet_id`, `bg_type`, `tile_id`, `bg_id`, `waypoints`, `mobs`, `npcs` FROM `map_template` WHERE `id` = ?";

    private MapTemplateSql() {
    }
}
