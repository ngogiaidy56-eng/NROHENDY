package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class PartRow {
    public static final String TABLE_NAME = "part";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_TYPE = "TYPE";
    public static final String COLUMN_DATA = "DATA";

    private Integer id;
    private Integer type;
    private String data;

    public PartRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
