package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class CardRow {
    public static final String TABLE_NAME = "card";
    public static final String COLUMN_CARD_ID = "card_id";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_KHUYEN_MAI = "khuyen_mai";
    public static final String COLUMN_STATUS = "status";

    private Integer cardId;
    private String name;
    private Integer khuyenMai;
    private Integer status;

    public CardRow() {
    }

    public Integer getCardId() {
        return this.cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getKhuyenMai() {
        return this.khuyenMai;
    }

    public void setKhuyenMai(Integer khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
