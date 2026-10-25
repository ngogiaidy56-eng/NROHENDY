package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class MapTemplateRow {
    public static final String TABLE_NAME = "map_template";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_ZONES = "zones";
    public static final String COLUMN_MAX_PLAYER = "max_player";
    public static final String COLUMN_DATA = "data";
    public static final String COLUMN_TYPE = "type";
    public static final String COLUMN_PLANET_ID = "planet_id";
    public static final String COLUMN_BG_TYPE = "bg_type";
    public static final String COLUMN_TILE_ID = "tile_id";
    public static final String COLUMN_BG_ID = "bg_id";
    public static final String COLUMN_WAYPOINTS = "waypoints";
    public static final String COLUMN_MOBS = "mobs";
    public static final String COLUMN_NPCS = "npcs";

    private Integer id;
    private String name;
    private Integer zones;
    private Integer maxPlayer;
    private String data;
    private Integer type;
    private Integer planetId;
    private Integer bgType;
    private Integer tileId;
    private Integer bgId;
    private String waypoints;
    private String mobs;
    private String npcs;

    public MapTemplateRow() {
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

    public Integer getZones() {
        return this.zones;
    }

    public void setZones(Integer zones) {
        this.zones = zones;
    }

    public Integer getMaxPlayer() {
        return this.maxPlayer;
    }

    public void setMaxPlayer(Integer maxPlayer) {
        this.maxPlayer = maxPlayer;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPlanetId() {
        return this.planetId;
    }

    public void setPlanetId(Integer planetId) {
        this.planetId = planetId;
    }

    public Integer getBgType() {
        return this.bgType;
    }

    public void setBgType(Integer bgType) {
        this.bgType = bgType;
    }

    public Integer getTileId() {
        return this.tileId;
    }

    public void setTileId(Integer tileId) {
        this.tileId = tileId;
    }

    public Integer getBgId() {
        return this.bgId;
    }

    public void setBgId(Integer bgId) {
        this.bgId = bgId;
    }

    public String getWaypoints() {
        return this.waypoints;
    }

    public void setWaypoints(String waypoints) {
        this.waypoints = waypoints;
    }

    public String getMobs() {
        return this.mobs;
    }

    public void setMobs(String mobs) {
        this.mobs = mobs;
    }

    public String getNpcs() {
        return this.npcs;
    }

    public void setNpcs(String npcs) {
        this.npcs = npcs;
    }
}
