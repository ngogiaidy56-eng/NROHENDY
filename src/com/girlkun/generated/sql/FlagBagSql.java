package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class FlagBagSql {
    public static final String TABLE_NAME = "flag_bag";
    public static final String COLUMNS = "`id`, `icon_data`, `NAME`, `gold`, `gem`, `icon_id`";
    public static final String SELECT_ALL = "SELECT `id`, `icon_data`, `NAME`, `gold`, `gem`, `icon_id` FROM `flag_bag`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `flag_bag`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `icon_data`, `NAME`, `gold`, `gem`, `icon_id` FROM `flag_bag` WHERE `id` = ?";

    private FlagBagSql() {
    }
}
