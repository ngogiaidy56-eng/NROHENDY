package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class NaptienSql {
    public static final String TABLE_NAME = "naptien";
    public static final String COLUMNS = "`id`, `uid`, `sotien`, `seri`, `code`, `loaithe`, `time`, `noidung`, `tinhtrang`, `tranid`, `magioithieu`";
    public static final String SELECT_ALL = "SELECT `id`, `uid`, `sotien`, `seri`, `code`, `loaithe`, `time`, `noidung`, `tinhtrang`, `tranid`, `magioithieu` FROM `naptien`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `naptien`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `uid`, `sotien`, `seri`, `code`, `loaithe`, `time`, `noidung`, `tinhtrang`, `tranid`, `magioithieu` FROM `naptien` WHERE `id` = ?";

    private NaptienSql() {
    }
}
