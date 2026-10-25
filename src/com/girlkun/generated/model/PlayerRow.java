package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class PlayerRow {
    public static final String TABLE_NAME = "player";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_ACCOUNT_ID = "account_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_HEAD = "head";
    public static final String COLUMN_GENDER = "gender";
    public static final String COLUMN_HAVE_TENNIS_SPACE_SHIP = "have_tennis_space_ship";
    public static final String COLUMN_CLAN_ID_SV1 = "clan_id_sv1";
    public static final String COLUMN_CLAN_ID_SV2 = "clan_id_sv2";
    public static final String COLUMN_DATA_INVENTORY = "data_inventory";
    public static final String COLUMN_DATA_LOCATION = "data_location";
    public static final String COLUMN_DATA_POINT = "data_point";
    public static final String COLUMN_DATA_MAGIC_TREE = "data_magic_tree";
    public static final String COLUMN_ITEMS_BODY = "items_body";
    public static final String COLUMN_ITEMS_BAG = "items_bag";
    public static final String COLUMN_ITEMS_BOX = "items_box";
    public static final String COLUMN_ITEMS_BOX_LUCKY_ROUND = "items_box_lucky_round";
    public static final String COLUMN_FRIENDS = "friends";
    public static final String COLUMN_ENEMIES = "enemies";
    public static final String COLUMN_DATA_INTRINSIC = "data_intrinsic";
    public static final String COLUMN_DATA_ITEM_TIME = "data_item_time";
    public static final String COLUMN_DATA_ITEM_TIME_SIEU_CAP = "data_item_time_sieu_cap";
    public static final String COLUMN_DATA_TASK = "data_task";
    public static final String COLUMN_DATA_MABU_EGG = "data_mabu_egg";
    public static final String COLUMN_DATA_CHARM = "data_charm";
    public static final String COLUMN_SKILLS = "skills";
    public static final String COLUMN_SKILLS_SHORTCUT = "skills_shortcut";
    public static final String COLUMN_PET = "pet";
    public static final String COLUMN_DATA_BLACK_BALL = "data_black_ball";
    public static final String COLUMN_DATA_SIDE_TASK = "data_side_task";
    public static final String COLUMN_CREATE_TIME = "create_time";
    public static final String COLUMN_VIOLATE = "violate";
    public static final String COLUMN_POINT_PVP = "pointPvp";
    public static final String COLUMN_NGU_HANH_SON_POINT = "NguHanhSonPoint";
    public static final String COLUMN_DATA_CARD = "data_card";
    public static final String COLUMN_BILL_DATA = "bill_data";
    public static final String COLUMN_DATA_ARCHIVERMENT = "dataArchiverment";

    private Integer id;
    private Integer accountId;
    private String name;
    private Integer head;
    private Integer gender;
    private Boolean haveTennisSpaceShip;
    private Integer clanIdSv1;
    private Integer clanIdSv2;
    private String dataInventory;
    private String dataLocation;
    private String dataPoint;
    private String dataMagicTree;
    private String itemsBody;
    private String itemsBag;
    private String itemsBox;
    private String itemsBoxLuckyRound;
    private String friends;
    private String enemies;
    private String dataIntrinsic;
    private String dataItemTime;
    private String dataItemTimeSieuCap;
    private String dataTask;
    private String dataMabuEgg;
    private String dataCharm;
    private String skills;
    private String skillsShortcut;
    private String pet;
    private String dataBlackBall;
    private String dataSideTask;
    private java.sql.Timestamp createTime;
    private Integer violate;
    private Integer pointPvp;
    private Integer nguHanhSonPoint;
    private String dataCard;
    private String billData;
    private String dataArchiverment;

    public PlayerRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHead() {
        return this.head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Boolean getHaveTennisSpaceShip() {
        return this.haveTennisSpaceShip;
    }

    public void setHaveTennisSpaceShip(Boolean haveTennisSpaceShip) {
        this.haveTennisSpaceShip = haveTennisSpaceShip;
    }

    public Integer getClanIdSv1() {
        return this.clanIdSv1;
    }

    public void setClanIdSv1(Integer clanIdSv1) {
        this.clanIdSv1 = clanIdSv1;
    }

    public Integer getClanIdSv2() {
        return this.clanIdSv2;
    }

    public void setClanIdSv2(Integer clanIdSv2) {
        this.clanIdSv2 = clanIdSv2;
    }

    public String getDataInventory() {
        return this.dataInventory;
    }

    public void setDataInventory(String dataInventory) {
        this.dataInventory = dataInventory;
    }

    public String getDataLocation() {
        return this.dataLocation;
    }

    public void setDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
    }

    public String getDataPoint() {
        return this.dataPoint;
    }

    public void setDataPoint(String dataPoint) {
        this.dataPoint = dataPoint;
    }

    public String getDataMagicTree() {
        return this.dataMagicTree;
    }

    public void setDataMagicTree(String dataMagicTree) {
        this.dataMagicTree = dataMagicTree;
    }

    public String getItemsBody() {
        return this.itemsBody;
    }

    public void setItemsBody(String itemsBody) {
        this.itemsBody = itemsBody;
    }

    public String getItemsBag() {
        return this.itemsBag;
    }

    public void setItemsBag(String itemsBag) {
        this.itemsBag = itemsBag;
    }

    public String getItemsBox() {
        return this.itemsBox;
    }

    public void setItemsBox(String itemsBox) {
        this.itemsBox = itemsBox;
    }

    public String getItemsBoxLuckyRound() {
        return this.itemsBoxLuckyRound;
    }

    public void setItemsBoxLuckyRound(String itemsBoxLuckyRound) {
        this.itemsBoxLuckyRound = itemsBoxLuckyRound;
    }

    public String getFriends() {
        return this.friends;
    }

    public void setFriends(String friends) {
        this.friends = friends;
    }

    public String getEnemies() {
        return this.enemies;
    }

    public void setEnemies(String enemies) {
        this.enemies = enemies;
    }

    public String getDataIntrinsic() {
        return this.dataIntrinsic;
    }

    public void setDataIntrinsic(String dataIntrinsic) {
        this.dataIntrinsic = dataIntrinsic;
    }

    public String getDataItemTime() {
        return this.dataItemTime;
    }

    public void setDataItemTime(String dataItemTime) {
        this.dataItemTime = dataItemTime;
    }

    public String getDataItemTimeSieuCap() {
        return this.dataItemTimeSieuCap;
    }

    public void setDataItemTimeSieuCap(String dataItemTimeSieuCap) {
        this.dataItemTimeSieuCap = dataItemTimeSieuCap;
    }

    public String getDataTask() {
        return this.dataTask;
    }

    public void setDataTask(String dataTask) {
        this.dataTask = dataTask;
    }

    public String getDataMabuEgg() {
        return this.dataMabuEgg;
    }

    public void setDataMabuEgg(String dataMabuEgg) {
        this.dataMabuEgg = dataMabuEgg;
    }

    public String getDataCharm() {
        return this.dataCharm;
    }

    public void setDataCharm(String dataCharm) {
        this.dataCharm = dataCharm;
    }

    public String getSkills() {
        return this.skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getSkillsShortcut() {
        return this.skillsShortcut;
    }

    public void setSkillsShortcut(String skillsShortcut) {
        this.skillsShortcut = skillsShortcut;
    }

    public String getPet() {
        return this.pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public String getDataBlackBall() {
        return this.dataBlackBall;
    }

    public void setDataBlackBall(String dataBlackBall) {
        this.dataBlackBall = dataBlackBall;
    }

    public String getDataSideTask() {
        return this.dataSideTask;
    }

    public void setDataSideTask(String dataSideTask) {
        this.dataSideTask = dataSideTask;
    }

    public java.sql.Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.sql.Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getViolate() {
        return this.violate;
    }

    public void setViolate(Integer violate) {
        this.violate = violate;
    }

    public Integer getPointPvp() {
        return this.pointPvp;
    }

    public void setPointPvp(Integer pointPvp) {
        this.pointPvp = pointPvp;
    }

    public Integer getNguHanhSonPoint() {
        return this.nguHanhSonPoint;
    }

    public void setNguHanhSonPoint(Integer nguHanhSonPoint) {
        this.nguHanhSonPoint = nguHanhSonPoint;
    }

    public String getDataCard() {
        return this.dataCard;
    }

    public void setDataCard(String dataCard) {
        this.dataCard = dataCard;
    }

    public String getBillData() {
        return this.billData;
    }

    public void setBillData(String billData) {
        this.billData = billData;
    }

    public String getDataArchiverment() {
        return this.dataArchiverment;
    }

    public void setDataArchiverment(String dataArchiverment) {
        this.dataArchiverment = dataArchiverment;
    }
}
