package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class RadarSql {
    public static final String TABLE_NAME = "radar";
    public static final String COLUMNS = "`id`, `iconId`, `rank`, `max`, `type`, `template`, `body`, `name`, `info`, `options`, `require`, `require_level`, `aura_id`";
    public static final String SELECT_ALL = "SELECT `id`, `iconId`, `rank`, `max`, `type`, `template`, `body`, `name`, `info`, `options`, `require`, `require_level`, `aura_id` FROM `radar`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `radar`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `iconId`, `rank`, `max`, `type`, `template`, `body`, `name`, `info`, `options`, `require`, `require_level`, `aura_id` FROM `radar` WHERE `id` = ?";

    private RadarSql() {
    }
}
