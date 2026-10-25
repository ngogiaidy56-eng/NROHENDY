package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class HistoryTransactionSql {
    public static final String TABLE_NAME = "history_transaction";
    public static final String COLUMNS = "`player_1`, `player_2`, `item_player_1`, `item_player_2`, `bag_1_before_tran`, `bag_2_before_tran`, `bag_1_after_tran`, `bag_2_after_tran`, `time_tran`";
    public static final String SELECT_ALL = "SELECT `player_1`, `player_2`, `item_player_1`, `item_player_2`, `bag_1_before_tran`, `bag_2_before_tran`, `bag_1_after_tran`, `bag_2_after_tran`, `time_tran` FROM `history_transaction`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `history_transaction`";

    private HistoryTransactionSql() {
    }
}
