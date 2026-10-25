package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class ItemOptionTemplateRow {
    public static final String TABLE_NAME = "item_option_template";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "NAME";

    private Integer id;
    private String name;

    public ItemOptionTemplateRow() {
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
}
