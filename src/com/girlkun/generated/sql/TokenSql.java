package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class TokenSql {
    public static final String TABLE_NAME = "token";
    public static final String COLUMNS = "`token_id`, `CODE`, `created`, `account_id`, `expiry`";
    public static final String SELECT_ALL = "SELECT `token_id`, `CODE`, `created`, `account_id`, `expiry` FROM `token`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `token`";
    public static final String PRIMARY_KEY_COLUMNS = "token_id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `token_id`, `CODE`, `created`, `account_id`, `expiry` FROM `token` WHERE `token_id` = ?";

    private TokenSql() {
    }
}
