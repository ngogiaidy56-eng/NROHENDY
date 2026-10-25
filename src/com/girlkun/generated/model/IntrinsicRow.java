package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class IntrinsicRow {
    public static final String TABLE_NAME = "intrinsic";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_PARAM_FROM_1 = "param_from_1";
    public static final String COLUMN_PARAM_TO_1 = "param_to_1";
    public static final String COLUMN_PARAM_FROM_2 = "param_from_2";
    public static final String COLUMN_PARAM_TO_2 = "param_to_2";
    public static final String COLUMN_ICON = "icon";
    public static final String COLUMN_GENDER = "gender";

    private Integer id;
    private String name;
    private Integer paramFrom1;
    private Integer paramTo1;
    private Integer paramFrom2;
    private Integer paramTo2;
    private Integer icon;
    private Short gender;

    public IntrinsicRow() {
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

    public Integer getParamFrom1() {
        return this.paramFrom1;
    }

    public void setParamFrom1(Integer paramFrom1) {
        this.paramFrom1 = paramFrom1;
    }

    public Integer getParamTo1() {
        return this.paramTo1;
    }

    public void setParamTo1(Integer paramTo1) {
        this.paramTo1 = paramTo1;
    }

    public Integer getParamFrom2() {
        return this.paramFrom2;
    }

    public void setParamFrom2(Integer paramFrom2) {
        this.paramFrom2 = paramFrom2;
    }

    public Integer getParamTo2() {
        return this.paramTo2;
    }

    public void setParamTo2(Integer paramTo2) {
        this.paramTo2 = paramTo2;
    }

    public Integer getIcon() {
        return this.icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public Short getGender() {
        return this.gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }
}
