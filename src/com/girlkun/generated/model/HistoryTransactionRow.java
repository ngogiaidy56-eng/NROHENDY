package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class HistoryTransactionRow {
    public static final String TABLE_NAME = "history_transaction";
    public static final String COLUMN_PLAYER_1 = "player_1";
    public static final String COLUMN_PLAYER_2 = "player_2";
    public static final String COLUMN_ITEM_PLAYER_1 = "item_player_1";
    public static final String COLUMN_ITEM_PLAYER_2 = "item_player_2";
    public static final String COLUMN_BAG_1_BEFORE_TRAN = "bag_1_before_tran";
    public static final String COLUMN_BAG_2_BEFORE_TRAN = "bag_2_before_tran";
    public static final String COLUMN_BAG_1_AFTER_TRAN = "bag_1_after_tran";
    public static final String COLUMN_BAG_2_AFTER_TRAN = "bag_2_after_tran";
    public static final String COLUMN_TIME_TRAN = "time_tran";

    private String player1;
    private String player2;
    private String itemPlayer1;
    private String itemPlayer2;
    private String bag1BeforeTran;
    private String bag2BeforeTran;
    private String bag1AfterTran;
    private String bag2AfterTran;
    private java.sql.Timestamp timeTran;

    public HistoryTransactionRow() {
    }

    public String getPlayer1() {
        return this.player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return this.player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getItemPlayer1() {
        return this.itemPlayer1;
    }

    public void setItemPlayer1(String itemPlayer1) {
        this.itemPlayer1 = itemPlayer1;
    }

    public String getItemPlayer2() {
        return this.itemPlayer2;
    }

    public void setItemPlayer2(String itemPlayer2) {
        this.itemPlayer2 = itemPlayer2;
    }

    public String getBag1BeforeTran() {
        return this.bag1BeforeTran;
    }

    public void setBag1BeforeTran(String bag1BeforeTran) {
        this.bag1BeforeTran = bag1BeforeTran;
    }

    public String getBag2BeforeTran() {
        return this.bag2BeforeTran;
    }

    public void setBag2BeforeTran(String bag2BeforeTran) {
        this.bag2BeforeTran = bag2BeforeTran;
    }

    public String getBag1AfterTran() {
        return this.bag1AfterTran;
    }

    public void setBag1AfterTran(String bag1AfterTran) {
        this.bag1AfterTran = bag1AfterTran;
    }

    public String getBag2AfterTran() {
        return this.bag2AfterTran;
    }

    public void setBag2AfterTran(String bag2AfterTran) {
        this.bag2AfterTran = bag2AfterTran;
    }

    public java.sql.Timestamp getTimeTran() {
        return this.timeTran;
    }

    public void setTimeTran(java.sql.Timestamp timeTran) {
        this.timeTran = timeTran;
    }
}
