package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class DhvtTemplateSql {
    public static final String TABLE_NAME = "dhvt_template";
    public static final String COLUMNS = "`id`, `cup`, `time`, `gem`, `gold`, `min_start`, `min_limit`";
    public static final String SELECT_ALL = "SELECT `id`, `cup`, `time`, `gem`, `gold`, `min_start`, `min_limit` FROM `dhvt_template`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `dhvt_template`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `cup`, `time`, `gem`, `gold`, `min_start`, `min_limit` FROM `dhvt_template` WHERE `id` = ?";

    private DhvtTemplateSql() {
    }
}
