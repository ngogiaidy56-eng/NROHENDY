package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class MobTemplateSql {
    public static final String TABLE_NAME = "mob_template";
    public static final String COLUMNS = "`id`, `TYPE`, `NAME`, `hp`, `range_move`, `speed`, `dart_type`, `percent_dame`, `percent_tiem_nang`";
    public static final String SELECT_ALL = "SELECT `id`, `TYPE`, `NAME`, `hp`, `range_move`, `speed`, `dart_type`, `percent_dame`, `percent_tiem_nang` FROM `mob_template`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `mob_template`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `TYPE`, `NAME`, `hp`, `range_move`, `speed`, `dart_type`, `percent_dame`, `percent_tiem_nang` FROM `mob_template` WHERE `id` = ?";

    private MobTemplateSql() {
    }
}
