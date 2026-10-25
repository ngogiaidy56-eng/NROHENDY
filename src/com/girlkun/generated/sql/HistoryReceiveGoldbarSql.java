package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class HistoryReceiveGoldbarSql {
    public static final String TABLE_NAME = "history_receive_goldbar";
    public static final String COLUMNS = "`player_id`, `player_name`, `gold_before_receive`, `gold_after_receive`, `gold_bag_before`, `gold_bag_after`, `gold_box_before`, `gold_box_after`, `time_receive`";
    public static final String SELECT_ALL = "SELECT `player_id`, `player_name`, `gold_before_receive`, `gold_after_receive`, `gold_bag_before`, `gold_bag_after`, `gold_box_before`, `gold_box_after`, `time_receive` FROM `history_receive_goldbar`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `history_receive_goldbar`";

    private HistoryReceiveGoldbarSql() {
    }
}
