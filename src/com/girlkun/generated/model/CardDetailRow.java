package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class CardDetailRow {
    public static final String TABLE_NAME = "card_detail";
    public static final String COLUMN_CARD_DETAIL_ID = "card_detail_id";
    public static final String COLUMN_CARD_ID = "card_id";
    public static final String COLUMN_PRICE = "price";
    public static final String COLUMN_THOI_VANG = "thoi_vang";

    private Integer cardDetailId;
    private Integer cardId;
    private Integer price;
    private Integer thoiVang;

    public CardDetailRow() {
    }

    public Integer getCardDetailId() {
        return this.cardDetailId;
    }

    public void setCardDetailId(Integer cardDetailId) {
        this.cardDetailId = cardDetailId;
    }

    public Integer getCardId() {
        return this.cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getThoiVang() {
        return this.thoiVang;
    }

    public void setThoiVang(Integer thoiVang) {
        this.thoiVang = thoiVang;
    }
}
