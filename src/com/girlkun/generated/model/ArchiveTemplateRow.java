package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class ArchiveTemplateRow {
    public static final String TABLE_NAME = "archive_template";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_INFO1 = "info1";
    public static final String COLUMN_INFO2 = "info2";
    public static final String COLUMN_MONEY = "money";

    private Integer id;
    private String info1;
    private String info2;
    private Integer money;

    public ArchiveTemplateRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo1() {
        return this.info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1;
    }

    public String getInfo2() {
        return this.info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2;
    }

    public Integer getMoney() {
        return this.money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
