package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class MobTemplateRow {
    public static final String TABLE_NAME = "mob_template";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_TYPE = "TYPE";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_HP = "hp";
    public static final String COLUMN_RANGE_MOVE = "range_move";
    public static final String COLUMN_SPEED = "speed";
    public static final String COLUMN_DART_TYPE = "dart_type";
    public static final String COLUMN_PERCENT_DAME = "percent_dame";
    public static final String COLUMN_PERCENT_TIEM_NANG = "percent_tiem_nang";

    private Integer id;
    private Integer type;
    private String name;
    private Integer hp;
    private Short rangeMove;
    private Short speed;
    private Short dartType;
    private Short percentDame;
    private Short percentTiemNang;

    public MobTemplateRow() {
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return this.hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Short getRangeMove() {
        return this.rangeMove;
    }

    public void setRangeMove(Short rangeMove) {
        this.rangeMove = rangeMove;
    }

    public Short getSpeed() {
        return this.speed;
    }

    public void setSpeed(Short speed) {
        this.speed = speed;
    }

    public Short getDartType() {
        return this.dartType;
    }

    public void setDartType(Short dartType) {
        this.dartType = dartType;
    }

    public Short getPercentDame() {
        return this.percentDame;
    }

    public void setPercentDame(Short percentDame) {
        this.percentDame = percentDame;
    }

    public Short getPercentTiemNang() {
        return this.percentTiemNang;
    }

    public void setPercentTiemNang(Short percentTiemNang) {
        this.percentTiemNang = percentTiemNang;
    }
}
