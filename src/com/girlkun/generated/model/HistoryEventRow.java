package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class HistoryEventRow {
    public static final String TABLE_NAME = "history_event";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_POINT = "point";
    public static final String COLUMN_CREATED = "created";

    private Integer id;
    private String name;
    private Integer point;
    private java.sql.Date created;

    public HistoryEventRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoint() {
        return this.point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public java.sql.Date getCreated() {
        return this.created;
    }

    public void setCreated(java.sql.Date created) {
        this.created = created;
    }
}
