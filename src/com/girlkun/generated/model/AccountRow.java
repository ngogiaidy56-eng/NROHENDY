package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class AccountRow {
    public static final String TABLE_NAME = "account";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_USERNAME = "username";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_CREATE_TIME = "create_time";
    public static final String COLUMN_UPDATE_TIME = "update_time";
    public static final String COLUMN_BAN = "ban";
    public static final String COLUMN_POINT_POST = "point_post";
    public static final String COLUMN_LAST_POST = "last_post";
    public static final String COLUMN_ROLE = "role";
    public static final String COLUMN_IS_ADMIN = "is_admin";
    public static final String COLUMN_LAST_TIME_LOGIN = "last_time_login";
    public static final String COLUMN_LAST_TIME_LOGOUT = "last_time_logout";
    public static final String COLUMN_IP_ADDRESS = "ip_address";
    public static final String COLUMN_ACTIVE = "active";
    public static final String COLUMN_THOI_VANG = "thoi_vang";
    public static final String COLUMN_SERVER_LOGIN = "server_login";
    public static final String COLUMN_BD_PLAYER = "bd_player";
    public static final String COLUMN_IS_GIFT_BOX = "is_gift_box";
    public static final String COLUMN_GIFT_TIME = "gift_time";
    public static final String COLUMN_REWARD = "reward";
    public static final String COLUMN_TONGNAP = "tongnap";
    public static final String COLUMN_COIN = "coin";
    public static final String COLUMN_VND = "vnd";

    private Integer id;
    private String username;
    private String password;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;
    private Short ban;
    private Integer pointPost;
    private Integer lastPost;
    private Integer role;
    private Boolean isAdmin;
    private java.sql.Timestamp lastTimeLogin;
    private java.sql.Timestamp lastTimeLogout;
    private String ipAddress;
    private Integer active;
    private Integer thoiVang;
    private Integer serverLogin;
    private Double bdPlayer;
    private Boolean isGiftBox;
    private String giftTime;
    private String reward;
    private Integer tongnap;
    private Integer coin;
    private Integer vnd;

    public AccountRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public java.sql.Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.sql.Timestamp createTime) {
        this.createTime = createTime;
    }

    public java.sql.Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.sql.Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Short getBan() {
        return this.ban;
    }

    public void setBan(Short ban) {
        this.ban = ban;
    }

    public Integer getPointPost() {
        return this.pointPost;
    }

    public void setPointPost(Integer pointPost) {
        this.pointPost = pointPost;
    }

    public Integer getLastPost() {
        return this.lastPost;
    }

    public void setLastPost(Integer lastPost) {
        this.lastPost = lastPost;
    }

    public Integer getRole() {
        return this.role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public java.sql.Timestamp getLastTimeLogin() {
        return this.lastTimeLogin;
    }

    public void setLastTimeLogin(java.sql.Timestamp lastTimeLogin) {
        this.lastTimeLogin = lastTimeLogin;
    }

    public java.sql.Timestamp getLastTimeLogout() {
        return this.lastTimeLogout;
    }

    public void setLastTimeLogout(java.sql.Timestamp lastTimeLogout) {
        this.lastTimeLogout = lastTimeLogout;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Integer getActive() {
        return this.active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getThoiVang() {
        return this.thoiVang;
    }

    public void setThoiVang(Integer thoiVang) {
        this.thoiVang = thoiVang;
    }

    public Integer getServerLogin() {
        return this.serverLogin;
    }

    public void setServerLogin(Integer serverLogin) {
        this.serverLogin = serverLogin;
    }

    public Double getBdPlayer() {
        return this.bdPlayer;
    }

    public void setBdPlayer(Double bdPlayer) {
        this.bdPlayer = bdPlayer;
    }

    public Boolean getIsGiftBox() {
        return this.isGiftBox;
    }

    public void setIsGiftBox(Boolean isGiftBox) {
        this.isGiftBox = isGiftBox;
    }

    public String getGiftTime() {
        return this.giftTime;
    }

    public void setGiftTime(String giftTime) {
        this.giftTime = giftTime;
    }

    public String getReward() {
        return this.reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public Integer getTongnap() {
        return this.tongnap;
    }

    public void setTongnap(Integer tongnap) {
        this.tongnap = tongnap;
    }

    public Integer getCoin() {
        return this.coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public Integer getVnd() {
        return this.vnd;
    }

    public void setVnd(Integer vnd) {
        this.vnd = vnd;
    }
}
