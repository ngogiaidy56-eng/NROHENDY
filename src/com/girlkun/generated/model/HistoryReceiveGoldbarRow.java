package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class HistoryReceiveGoldbarRow {
    public static final String TABLE_NAME = "history_receive_goldbar";
    public static final String COLUMN_PLAYER_ID = "player_id";
    public static final String COLUMN_PLAYER_NAME = "player_name";
    public static final String COLUMN_GOLD_BEFORE_RECEIVE = "gold_before_receive";
    public static final String COLUMN_GOLD_AFTER_RECEIVE = "gold_after_receive";
    public static final String COLUMN_GOLD_BAG_BEFORE = "gold_bag_before";
    public static final String COLUMN_GOLD_BAG_AFTER = "gold_bag_after";
    public static final String COLUMN_GOLD_BOX_BEFORE = "gold_box_before";
    public static final String COLUMN_GOLD_BOX_AFTER = "gold_box_after";
    public static final String COLUMN_TIME_RECEIVE = "time_receive";

    private Integer playerId;
    private String playerName;
    private Integer goldBeforeReceive;
    private Integer goldAfterReceive;
    private Integer goldBagBefore;
    private Integer goldBagAfter;
    private Integer goldBoxBefore;
    private Integer goldBoxAfter;
    private java.sql.Timestamp timeReceive;

    public HistoryReceiveGoldbarRow() {
    }

    public Integer getPlayerId() {
        return this.playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getGoldBeforeReceive() {
        return this.goldBeforeReceive;
    }

    public void setGoldBeforeReceive(Integer goldBeforeReceive) {
        this.goldBeforeReceive = goldBeforeReceive;
    }

    public Integer getGoldAfterReceive() {
        return this.goldAfterReceive;
    }

    public void setGoldAfterReceive(Integer goldAfterReceive) {
        this.goldAfterReceive = goldAfterReceive;
    }

    public Integer getGoldBagBefore() {
        return this.goldBagBefore;
    }

    public void setGoldBagBefore(Integer goldBagBefore) {
        this.goldBagBefore = goldBagBefore;
    }

    public Integer getGoldBagAfter() {
        return this.goldBagAfter;
    }

    public void setGoldBagAfter(Integer goldBagAfter) {
        this.goldBagAfter = goldBagAfter;
    }

    public Integer getGoldBoxBefore() {
        return this.goldBoxBefore;
    }

    public void setGoldBoxBefore(Integer goldBoxBefore) {
        this.goldBoxBefore = goldBoxBefore;
    }

    public Integer getGoldBoxAfter() {
        return this.goldBoxAfter;
    }

    public void setGoldBoxAfter(Integer goldBoxAfter) {
        this.goldBoxAfter = goldBoxAfter;
    }

    public java.sql.Timestamp getTimeReceive() {
        return this.timeReceive;
    }

    public void setTimeReceive(java.sql.Timestamp timeReceive) {
        this.timeReceive = timeReceive;
    }
}
