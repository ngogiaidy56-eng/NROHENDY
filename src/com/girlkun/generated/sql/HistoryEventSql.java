package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class HistoryEventSql {
    public static final String TABLE_NAME = "history_event";
    public static final String COLUMNS = "`id`, `name`, `point`, `created`";
    public static final String SELECT_ALL = "SELECT `id`, `name`, `point`, `created` FROM `history_event`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `history_event`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `name`, `point`, `created` FROM `history_event` WHERE `id` = ?";

    private HistoryEventSql() {
    }
}
