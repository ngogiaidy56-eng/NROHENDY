package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class TaskSubTemplateSql {
    public static final String TABLE_NAME = "task_sub_template";
    public static final String COLUMNS = "`task_main_id`, `NAME`, `max_count`, `notify`, `npc_id`, `map`";
    public static final String SELECT_ALL = "SELECT `task_main_id`, `NAME`, `max_count`, `notify`, `npc_id`, `map` FROM `task_sub_template`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `task_sub_template`";

    private TaskSubTemplateSql() {
    }
}
