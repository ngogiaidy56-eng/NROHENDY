package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class TaskSubTemplateRow {
    public static final String TABLE_NAME = "task_sub_template";
    public static final String COLUMN_TASK_MAIN_ID = "task_main_id";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_MAX_COUNT = "max_count";
    public static final String COLUMN_NOTIFY = "notify";
    public static final String COLUMN_NPC_ID = "npc_id";
    public static final String COLUMN_MAP = "map";

    private Integer taskMainId;
    private String name;
    private Integer maxCount;
    private String notify;
    private Integer npcId;
    private Integer map;

    public TaskSubTemplateRow() {
    }

    public Integer getTaskMainId() {
        return this.taskMainId;
    }

    public void setTaskMainId(Integer taskMainId) {
        this.taskMainId = taskMainId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxCount() {
        return this.maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public String getNotify() {
        return this.notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    public Integer getNpcId() {
        return this.npcId;
    }

    public void setNpcId(Integer npcId) {
        this.npcId = npcId;
    }

    public Integer getMap() {
        return this.map;
    }

    public void setMap(Integer map) {
        this.map = map;
    }
}
