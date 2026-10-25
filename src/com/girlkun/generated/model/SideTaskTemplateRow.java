package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class SideTaskTemplateRow {
    public static final String TABLE_NAME = "side_task_template";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_MAX_COUNT_LV1 = "max_count_lv1";
    public static final String COLUMN_MAX_COUNT_LV2 = "max_count_lv2";
    public static final String COLUMN_MAX_COUNT_LV3 = "max_count_lv3";
    public static final String COLUMN_MAX_COUNT_LV4 = "max_count_lv4";
    public static final String COLUMN_MAX_COUNT_LV5 = "max_count_lv5";

    private Integer id;
    private String name;
    private String maxCountLv1;
    private String maxCountLv2;
    private String maxCountLv3;
    private String maxCountLv4;
    private String maxCountLv5;

    public SideTaskTemplateRow() {
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

    public String getMaxCountLv1() {
        return this.maxCountLv1;
    }

    public void setMaxCountLv1(String maxCountLv1) {
        this.maxCountLv1 = maxCountLv1;
    }

    public String getMaxCountLv2() {
        return this.maxCountLv2;
    }

    public void setMaxCountLv2(String maxCountLv2) {
        this.maxCountLv2 = maxCountLv2;
    }

    public String getMaxCountLv3() {
        return this.maxCountLv3;
    }

    public void setMaxCountLv3(String maxCountLv3) {
        this.maxCountLv3 = maxCountLv3;
    }

    public String getMaxCountLv4() {
        return this.maxCountLv4;
    }

    public void setMaxCountLv4(String maxCountLv4) {
        this.maxCountLv4 = maxCountLv4;
    }

    public String getMaxCountLv5() {
        return this.maxCountLv5;
    }

    public void setMaxCountLv5(String maxCountLv5) {
        this.maxCountLv5 = maxCountLv5;
    }
}
