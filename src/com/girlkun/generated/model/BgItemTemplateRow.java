package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class BgItemTemplateRow {
    public static final String TABLE_NAME = "bg_item_template";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_IMAGE_ID = "image_id";
    public static final String COLUMN_LAYER = "layer";
    public static final String COLUMN_DX = "dx";
    public static final String COLUMN_DY = "dy";

    private Integer id;
    private Integer imageId;
    private Integer layer;
    private Integer dx;
    private Integer dy;

    public BgItemTemplateRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImageId() {
        return this.imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getLayer() {
        return this.layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public Integer getDx() {
        return this.dx;
    }

    public void setDx(Integer dx) {
        this.dx = dx;
    }

    public Integer getDy() {
        return this.dy;
    }

    public void setDy(Integer dy) {
        this.dy = dy;
    }
}
