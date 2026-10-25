package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class ImgByNameRow {
    public static final String TABLE_NAME = "img_by_name";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_N_FRAME = "n_frame";

    private Integer id;
    private String name;
    private Integer nFrame;

    public ImgByNameRow() {
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

    public Integer getNFrame() {
        return this.nFrame;
    }

    public void setNFrame(Integer nFrame) {
        this.nFrame = nFrame;
    }
}
