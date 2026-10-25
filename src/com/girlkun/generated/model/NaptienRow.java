package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class NaptienRow {
    public static final String TABLE_NAME = "naptien";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_UID = "uid";
    public static final String COLUMN_SOTIEN = "sotien";
    public static final String COLUMN_SERI = "seri";
    public static final String COLUMN_CODE = "code";
    public static final String COLUMN_LOAITHE = "loaithe";
    public static final String COLUMN_TIME = "time";
    public static final String COLUMN_NOIDUNG = "noidung";
    public static final String COLUMN_TINHTRANG = "tinhtrang";
    public static final String COLUMN_TRANID = "tranid";
    public static final String COLUMN_MAGIOITHIEU = "magioithieu";

    private Integer id;
    private String uid;
    private String sotien;
    private String seri;
    private String code;
    private String loaithe;
    private String time;
    private String noidung;
    private String tinhtrang;
    private String tranid;
    private String magioithieu;

    public NaptienRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSotien() {
        return this.sotien;
    }

    public void setSotien(String sotien) {
        this.sotien = sotien;
    }

    public String getSeri() {
        return this.seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLoaithe() {
        return this.loaithe;
    }

    public void setLoaithe(String loaithe) {
        this.loaithe = loaithe;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNoidung() {
        return this.noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getTinhtrang() {
        return this.tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getTranid() {
        return this.tranid;
    }

    public void setTranid(String tranid) {
        this.tranid = tranid;
    }

    public String getMagioithieu() {
        return this.magioithieu;
    }

    public void setMagioithieu(String magioithieu) {
        this.magioithieu = magioithieu;
    }
}
