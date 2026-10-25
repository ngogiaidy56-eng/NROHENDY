package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class CardDetailSql {
    public static final String TABLE_NAME = "card_detail";
    public static final String COLUMNS = "`card_detail_id`, `card_id`, `price`, `thoi_vang`";
    public static final String SELECT_ALL = "SELECT `card_detail_id`, `card_id`, `price`, `thoi_vang` FROM `card_detail`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `card_detail`";
    public static final String PRIMARY_KEY_COLUMNS = "card_detail_id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `card_detail_id`, `card_id`, `price`, `thoi_vang` FROM `card_detail` WHERE `card_detail_id` = ?";

    private CardDetailSql() {
    }
}
