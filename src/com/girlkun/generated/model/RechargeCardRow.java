package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class RechargeCardRow {
    public static final String TABLE_NAME = "recharge_card";
    public static final String COLUMN_RECHARGE_CARD_ID = "recharge_card_id";
    public static final String COLUMN_CARD_DETAIL_ID = "card_detail_id";
    public static final String COLUMN_ACCOUNT_ID = "account_id";
    public static final String COLUMN_SERI = "seri";
    public static final String COLUMN_CODE = "CODE";
    public static final String COLUMN_CREATED = "Created";
    public static final String COLUMN_STATUS = "STATUS";
    public static final String COLUMN_TRANS_ID = "trans_id";

    private Long rechargeCardId;
    private Integer cardDetailId;
    private Integer accountId;
    private String seri;
    private String code;
    private java.sql.Timestamp created;
    private Integer status;
    private String transId;

    public RechargeCardRow() {
    }

    public Long getRechargeCardId() {
        return this.rechargeCardId;
    }

    public void setRechargeCardId(Long rechargeCardId) {
        this.rechargeCardId = rechargeCardId;
    }

    public Integer getCardDetailId() {
        return this.cardDetailId;
    }

    public void setCardDetailId(Integer cardDetailId) {
        this.cardDetailId = cardDetailId;
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getSeri() {
        return this.seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public java.sql.Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(java.sql.Timestamp created) {
        this.created = created;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTransId() {
        return this.transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }
}
