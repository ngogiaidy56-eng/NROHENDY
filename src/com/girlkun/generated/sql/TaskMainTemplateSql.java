package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class TaskMainTemplateSql {
    public static final String TABLE_NAME = "task_main_template";
    public static final String COLUMNS = "`id`, `NAME`, `detail`";
    public static final String SELECT_ALL = "SELECT `id`, `NAME`, `detail` FROM `task_main_template`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `task_main_template`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `NAME`, `detail` FROM `task_main_template` WHERE `id` = ?";

    private TaskMainTemplateSql() {
    }
}
