package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class SideTaskTemplateSql {
    public static final String TABLE_NAME = "side_task_template";
    public static final String COLUMNS = "`id`, `NAME`, `max_count_lv1`, `max_count_lv2`, `max_count_lv3`, `max_count_lv4`, `max_count_lv5`";
    public static final String SELECT_ALL = "SELECT `id`, `NAME`, `max_count_lv1`, `max_count_lv2`, `max_count_lv3`, `max_count_lv4`, `max_count_lv5` FROM `side_task_template`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `side_task_template`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `NAME`, `max_count_lv1`, `max_count_lv2`, `max_count_lv3`, `max_count_lv4`, `max_count_lv5` FROM `side_task_template` WHERE `id` = ?";

    private SideTaskTemplateSql() {
    }
}
