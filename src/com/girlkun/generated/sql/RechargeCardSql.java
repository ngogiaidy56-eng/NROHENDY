package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class RechargeCardSql {
    public static final String TABLE_NAME = "recharge_card";
    public static final String COLUMNS = "`recharge_card_id`, `card_detail_id`, `account_id`, `seri`, `CODE`, `Created`, `STATUS`, `trans_id`";
    public static final String SELECT_ALL = "SELECT `recharge_card_id`, `card_detail_id`, `account_id`, `seri`, `CODE`, `Created`, `STATUS`, `trans_id` FROM `recharge_card`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `recharge_card`";
    public static final String PRIMARY_KEY_COLUMNS = "recharge_card_id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `recharge_card_id`, `card_detail_id`, `account_id`, `seri`, `CODE`, `Created`, `STATUS`, `trans_id` FROM `recharge_card` WHERE `recharge_card_id` = ?";

    private RechargeCardSql() {
    }
}
