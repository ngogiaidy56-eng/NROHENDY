package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class TokenRow {
    public static final String TABLE_NAME = "token";
    public static final String COLUMN_TOKEN_ID = "token_id";
    public static final String COLUMN_CODE = "CODE";
    public static final String COLUMN_CREATED = "created";
    public static final String COLUMN_ACCOUNT_ID = "account_id";
    public static final String COLUMN_EXPIRY = "expiry";

    private Long tokenId;
    private String code;
    private java.sql.Date created;
    private Integer accountId;
    private java.sql.Date expiry;

    public TokenRow() {
    }

    public Long getTokenId() {
        return this.tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public java.sql.Date getCreated() {
        return this.created;
    }

    public void setCreated(java.sql.Date created) {
        this.created = created;
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public java.sql.Date getExpiry() {
        return this.expiry;
    }

    public void setExpiry(java.sql.Date expiry) {
        this.expiry = expiry;
    }
}
