package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class GiftcodeRow {
    public static final String TABLE_NAME = "giftcode";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_CODE = "code";
    public static final String COLUMN_COUNT_LEFT = "count_left";
    public static final String COLUMN_DETAIL = "detail";
    public static final String COLUMN_DATECREATE = "datecreate";
    public static final String COLUMN_EXPIRED = "expired";
    public static final String COLUMN_ITEMOPTION = "itemoption";
    public static final String COLUMN_LIST_ID_USER = "listIdUser";

    private Integer id;
    private String code;
    private Integer countLeft;
    private String detail;
    private java.sql.Timestamp datecreate;
    private java.sql.Timestamp expired;
    private String itemoption;
    private String listIdUser;

    public GiftcodeRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCountLeft() {
        return this.countLeft;
    }

    public void setCountLeft(Integer countLeft) {
        this.countLeft = countLeft;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public java.sql.Timestamp getDatecreate() {
        return this.datecreate;
    }

    public void setDatecreate(java.sql.Timestamp datecreate) {
        this.datecreate = datecreate;
    }

    public java.sql.Timestamp getExpired() {
        return this.expired;
    }

    public void setExpired(java.sql.Timestamp expired) {
        this.expired = expired;
    }

    public String getItemoption() {
        return this.itemoption;
    }

    public void setItemoption(String itemoption) {
        this.itemoption = itemoption;
    }

    public String getListIdUser() {
        return this.listIdUser;
    }

    public void setListIdUser(String listIdUser) {
        this.listIdUser = listIdUser;
    }
}
