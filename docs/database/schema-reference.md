# Generated database schema reference

Generated from hendy.sql by tools/sql-scaffold/generate.py. Do not edit directly.

Tables: **45**.

## account

Java model: AccountRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | YES |
| username | varchar(20) | String | NO | — | NO |
| password | varchar(100) | String | NO | — | NO |
| create_time | timestamp | java.sql.Timestamp | YES | current_timestamp() | NO |
| update_time | timestamp | java.sql.Timestamp | YES | current_timestamp() | NO |
| ban | smallint(6) | Short | NO | 0 | NO |
| point_post | int(11) | Integer | NO | 0 | NO |
| last_post | int(11) | Integer | NO | 0 | NO |
| role | int(11) | Integer | NO | -1 | NO |
| is_admin | tinyint(1) | Boolean | NO | 0 | NO |
| last_time_login | timestamp | java.sql.Timestamp | NO | '2002-05-07 07:00:00' | NO |
| last_time_logout | timestamp | java.sql.Timestamp | NO | '2002-05-07 07:00:00' | NO |
| ip_address | varchar(50) | String | YES | NULL | NO |
| active | int(11) | Integer | NO | 0 | NO |
| thoi_vang | int(11) | Integer | NO | 0 | NO |
| server_login | int(11) | Integer | NO | -1 | NO |
| bd_player | double | Double | YES | 1 | NO |
| is_gift_box | tinyint(1) | Boolean | YES | 0 | NO |
| gift_time | varchar(255) | String | YES | '0' | NO |
| reward | longtext | String | YES | NULL | NO |
| tongnap | int(11) | Integer | NO | 0 | NO |
| coin | int(11) | Integer | NO | 0 | NO |
| vnd | int(11) | Integer | YES | 0 | NO |

Primary key: id
Unique index: username (username)

## archive_template

Java model: ArchiveTemplateRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| info1 | text | String | NO | — | NO |
| info2 | text | String | NO | — | NO |
| money | int(11) | Integer | NO | — | NO |

Primary key: id
Index: id (id)

## bg_item_template

Java model: BgItemTemplateRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| image_id | int(11) | Integer | NO | — | NO |
| layer | int(11) | Integer | NO | — | NO |
| dx | int(11) | Integer | NO | — | NO |
| dy | int(11) | Integer | NO | — | NO |

Primary key: id

## caption

Java model: CaptionRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | YES |
| NAME | varchar(255) | String | NO | — | NO |

Primary key: id

## card

Java model: CardRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| card_id | int(11) | Integer | NO | — | NO |
| NAME | text | String | YES | NULL | NO |
| khuyen_mai | int(11) | Integer | YES | 0 | NO |
| status | int(11) | Integer | YES | 0 | NO |

Primary key: not declared

## card_detail

Java model: CardDetailRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| card_detail_id | int(11) | Integer | NO | — | YES |
| card_id | int(11) | Integer | NO | — | NO |
| price | int(11) | Integer | NO | — | NO |
| thoi_vang | int(11) | Integer | NO | — | NO |

Primary key: card_detail_id
Index: card_id (card_id)

## clan_sv1

Java model: ClanSv1Row

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| NAME | varchar(255) | String | NO | — | NO |
| slogan | varchar(255) | String | NO | '' | NO |
| img_id | int(11) | Integer | NO | 0 | NO |
| power_point | bigint(20) | Long | NO | 0 | NO |
| max_member | smallint(6) | Short | NO | 10 | NO |
| clan_point | int(11) | Integer | NO | 0 | NO |
| LEVEL | int(11) | Integer | NO | 1 | NO |
| members | text | String | NO | — | NO |
| create_time | timestamp | java.sql.Timestamp | NO | current_timestamp() | NO |

Primary key: id

## clan_sv2

Java model: ClanSv2Row

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| NAME | varchar(255) | String | NO | — | NO |
| slogan | varchar(255) | String | NO | '' | NO |
| img_id | int(11) | Integer | NO | 0 | NO |
| power_point | bigint(20) | Long | NO | 0 | NO |
| max_member | smallint(6) | Short | NO | 10 | NO |
| clan_point | int(11) | Integer | NO | 0 | NO |
| LEVEL | int(11) | Integer | NO | 1 | NO |
| members | text | String | NO | — | NO |
| create_time | timestamp | java.sql.Timestamp | NO | current_timestamp() | NO |

Primary key: id

## comment

Java model: CommentRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| comment_id | bigint(20) | Long | NO | — | YES |
| question_id | bigint(20) | Long | NO | — | NO |
| content | text | String | YES | NULL | NO |
| created | timestamp | java.sql.Timestamp | NO | current_timestamp() | NO |

Primary key: comment_id
Index: question_id (question_id)
Foreign key comment_ibfk_1: question_id → post_question (question_id)

## dhvt_template

Java model: DhvtTemplateRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | YES |
| cup | varchar(999) | String | NO | '0' | NO |
| time | varchar(999) | String | NO | '0' | NO |
| gem | int(11) | Integer | NO | 0 | NO |
| gold | int(11) | Integer | NO | 0 | NO |
| min_start | int(11) | Integer | NO | 0 | NO |
| min_limit | int(11) | Integer | NO | 0 | NO |

Primary key: id

## flag_bag

Java model: FlagBagRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| icon_data | varchar(255) | String | NO | — | NO |
| NAME | varchar(255) | String | NO | 'flag_bag' | NO |
| gold | int(11) | Integer | NO | -1 | NO |
| gem | int(11) | Integer | NO | -1 | NO |
| icon_id | int(11) | Integer | NO | 0 | NO |

Primary key: id

## giftcode

Java model: GiftcodeRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | YES |
| code | varchar(255) | String | NO | — | NO |
| count_left | int(11) | Integer | NO | — | NO |
| detail | text | String | NO | — | NO |
| datecreate | timestamp | java.sql.Timestamp | NO | current_timestamp() | NO |
| expired | timestamp | java.sql.Timestamp | YES | NULL | NO |
| itemoption | text | String | NO | — | NO |
| listIdUser | text | String | YES | '[]' | NO |

Primary key: id

## head_avatar

Java model: HeadAvatarRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| head_id | int(11) | Integer | NO | — | NO |
| avatar_id | int(11) | Integer | NO | — | NO |

Primary key: head_id

## history_event

Java model: HistoryEventRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | YES |
| name | varchar(255) | String | YES | NULL | NO |
| point | int(11) | Integer | YES | 0 | NO |
| created | date | java.sql.Date | YES | current_timestamp() | NO |

Primary key: id

## history_gold

Java model: HistoryGoldRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | YES |
| name | varchar(255) | String | YES | NULL | NO |
| gold | int(11) | Integer | YES | NULL | NO |

Primary key: id

## history_receive_goldbar

Java model: HistoryReceiveGoldbarRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| player_id | int(11) | Integer | NO | — | NO |
| player_name | varchar(255) | String | NO | — | NO |
| gold_before_receive | int(11) | Integer | NO | — | NO |
| gold_after_receive | int(11) | Integer | NO | — | NO |
| gold_bag_before | int(11) | Integer | NO | — | NO |
| gold_bag_after | int(11) | Integer | NO | — | NO |
| gold_box_before | int(11) | Integer | NO | — | NO |
| gold_box_after | int(11) | Integer | NO | — | NO |
| time_receive | datetime | java.sql.Timestamp | NO | current_timestamp() | NO |

Primary key: not declared
Index: player_id (player_id)

## history_transaction

Java model: HistoryTransactionRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| player_1 | varchar(255) | String | NO | — | NO |
| player_2 | varchar(255) | String | NO | — | NO |
| item_player_1 | text | String | NO | — | NO |
| item_player_2 | text | String | NO | — | NO |
| bag_1_before_tran | text | String | NO | — | NO |
| bag_2_before_tran | text | String | NO | — | NO |
| bag_1_after_tran | text | String | NO | — | NO |
| bag_2_after_tran | text | String | NO | — | NO |
| time_tran | timestamp | java.sql.Timestamp | NO | current_timestamp() | NO |

Primary key: not declared

## img_by_name

Java model: ImgByNameRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | YES |
| NAME | varchar(55) | String | NO | — | NO |
| n_frame | int(11) | Integer | NO | — | NO |

Primary key: id
Unique index: NAME (NAME)

## intrinsic

Java model: IntrinsicRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| NAME | varchar(255) | String | NO | — | NO |
| param_from_1 | int(11) | Integer | NO | 0 | NO |
| param_to_1 | int(11) | Integer | NO | 0 | NO |
| param_from_2 | int(11) | Integer | NO | 0 | NO |
| param_to_2 | int(11) | Integer | NO | 0 | NO |
| icon | int(11) | Integer | NO | 0 | NO |
| gender | smallint(6) | Short | NO | 3 | NO |

Primary key: id

## item_option_template

Java model: ItemOptionTemplateRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| NAME | varchar(255) | String | NO | — | NO |

Primary key: id

## item_shop

Java model: ItemShopRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | YES |
| tab_id | int(11) | Integer | NO | — | NO |
| temp_id | int(11) | Integer | NO | — | NO |
| is_new | tinyint(1) | Boolean | NO | 1 | NO |
| is_sell | tinyint(1) | Boolean | NO | 1 | NO |
| type_sell | int(11) | Integer | YES | 1 | NO |
| cost | int(11) | Integer | YES | 0 | NO |
| icon_spec | int(11) | Integer | YES | 0 | NO |
| create_time | timestamp | java.sql.Timestamp | YES | current_timestamp() | NO |

Primary key: id
Index: tab_id (tab_id)
Index: temp_id (temp_id)

## item_shop_option

Java model: ItemShopOptionRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| item_shop_id | int(11) | Integer | NO | — | NO |
| option_id | int(11) | Integer | NO | — | NO |
| param | int(11) | Integer | NO | — | NO |

Primary key: not declared
Index: item_shop_id (item_shop_id)
Index: option_id (option_id)
Foreign key item_shop_option_ibfk_1: item_shop_id → item_shop (id); ON DELETE CASCADE
Foreign key item_shop_option_ibfk_2: option_id → item_option_template (id)

## item_template

Java model: ItemTemplateRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| TYPE | int(11) | Integer | NO | — | NO |
| gender | smallint(6) | Short | NO | — | NO |
| NAME | varchar(255) | String | NO | — | NO |
| description | varchar(255) | String | NO | — | NO |
| icon_id | int(11) | Integer | NO | — | NO |
| part | int(11) | Integer | NO | — | NO |
| is_up_to_up | tinyint(1) | Boolean | NO | — | NO |
| power_require | int(11) | Integer | NO | — | NO |
| gold | int(11) | Integer | NO | 0 | NO |
| gem | int(11) | Integer | NO | 0 | NO |
| head | int(11) | Integer | NO | -1 | NO |
| body | int(11) | Integer | NO | -1 | NO |
| leg | int(11) | Integer | NO | -1 | NO |

Primary key: id

## map_template

Java model: MapTemplateRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| NAME | varchar(55) | String | NO | — | NO |
| zones | int(11) | Integer | NO | 1 | NO |
| max_player | int(11) | Integer | NO | 15 | NO |
| data | varchar(1000) | String | NO | '[]' | NO |
| type | int(11) | Integer | NO | 1 | NO |
| planet_id | int(11) | Integer | NO | 1 | NO |
| bg_type | int(11) | Integer | NO | 1 | NO |
| tile_id | int(11) | Integer | NO | 1 | NO |
| bg_id | int(11) | Integer | NO | 1 | NO |
| waypoints | text | String | NO | — | NO |
| mobs | text | String | NO | — | NO |
| npcs | text | String | NO | — | NO |

Primary key: id

## mob_template

Java model: MobTemplateRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| TYPE | int(11) | Integer | NO | — | NO |
| NAME | varchar(50) | String | NO | — | NO |
| hp | int(11) | Integer | NO | — | NO |
| range_move | smallint(6) | Short | NO | — | NO |
| speed | smallint(6) | Short | NO | — | NO |
| dart_type | smallint(6) | Short | NO | — | NO |
| percent_dame | smallint(6) | Short | NO | 5 | NO |
| percent_tiem_nang | smallint(6) | Short | NO | 50 | NO |

Primary key: id

## naptien

Java model: NaptienRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | YES |
| uid | text | String | YES | NULL | NO |
| sotien | text | String | YES | NULL | NO |
| seri | text | String | YES | NULL | NO |
| code | text | String | YES | NULL | NO |
| loaithe | text | String | YES | NULL | NO |
| time | text | String | YES | NULL | NO |
| noidung | text | String | YES | NULL | NO |
| tinhtrang | text | String | YES | NULL | NO |
| tranid | text | String | YES | NULL | NO |
| magioithieu | text | String | NO | — | NO |

Primary key: id

## nclass

Java model: NclassRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| NAME | varchar(50) | String | NO | — | NO |

Primary key: id

## npc_template

Java model: NpcTemplateRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| NAME | varchar(50) | String | NO | — | NO |
| head | int(11) | Integer | NO | — | NO |
| body | int(11) | Integer | NO | — | NO |
| leg | int(11) | Integer | NO | — | NO |
| avatar | int(11) | Integer | YES | 0 | NO |

Primary key: id

## part

Java model: PartRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| TYPE | int(11) | Integer | NO | — | NO |
| DATA | text | String | NO | — | NO |

Primary key: not declared

## player

Java model: PlayerRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | YES |
| account_id | int(11) | Integer | YES | NULL | NO |
| name | varchar(20) | String | NO | — | NO |
| head | int(11) | Integer | NO | 102 | NO |
| gender | int(11) | Integer | NO | — | NO |
| have_tennis_space_ship | tinyint(1) | Boolean | YES | 0 | NO |
| clan_id_sv1 | int(11) | Integer | NO | -1 | NO |
| clan_id_sv2 | int(11) | Integer | NO | -1 | NO |
| data_inventory | text | String | NO | — | NO |
| data_location | text | String | NO | — | NO |
| data_point | text | String | NO | — | NO |
| data_magic_tree | text | String | NO | — | NO |
| items_body | text | String | NO | — | NO |
| items_bag | text | String | NO | — | NO |
| items_box | text | String | NO | — | NO |
| items_box_lucky_round | text | String | NO | — | NO |
| friends | text | String | NO | — | NO |
| enemies | text | String | NO | — | NO |
| data_intrinsic | text | String | NO | — | NO |
| data_item_time | text | String | NO | — | NO |
| data_item_time_sieu_cap | text | String | NO | — | NO |
| data_task | text | String | NO | — | NO |
| data_mabu_egg | text | String | NO | — | NO |
| data_charm | text | String | NO | — | NO |
| skills | text | String | NO | — | NO |
| skills_shortcut | text | String | NO | — | NO |
| pet | text | String | NO | — | NO |
| data_black_ball | text | String | NO | — | NO |
| data_side_task | text | String | NO | — | NO |
| create_time | timestamp | java.sql.Timestamp | NO | current_timestamp() | NO |
| violate | int(11) | Integer | NO | 0 | NO |
| pointPvp | int(11) | Integer | YES | 0 | NO |
| NguHanhSonPoint | int(11) | Integer | YES | 0 | NO |
| data_card | text | String | NO | — | NO |
| bill_data | text | String | NO | — | NO |
| dataArchiverment | text | String | NO | — | NO |

Primary key: id
Unique index: account_id (account_id)
Foreign key player_ibfk_1: account_id → account (id)

## post_question

Java model: PostQuestionRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| question_id | bigint(20) | Long | NO | — | YES |
| title | text | String | NO | — | NO |
| content | text | String | YES | NULL | NO |
| created | timestamp | java.sql.Timestamp | NO | current_timestamp() | NO |
| STATUS | int(11) | Integer | YES | 0 | NO |
| account_id | int(11) | Integer | NO | — | NO |

Primary key: question_id
Index: FKpijp3eahwssnf3qu27bydj928 (account_id)

## radar

Java model: RadarRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| iconId | int(11) | Integer | YES | 0 | NO |
| rank | tinyint(4) | Byte | YES | 0 | NO |
| max | int(11) | Integer | YES | 60 | NO |
| type | int(11) | Integer | YES | 0 | NO |
| template | int(11) | Integer | YES | 1 | NO |
| body | varchar(500) | String | YES | '[]' | NO |
| name | varchar(500) | String | YES | '' | NO |
| info | varchar(2000) | String | YES | '' | NO |
| options | varchar(2000) | String | YES | '[]' | NO |
| require | int(11) | Integer | YES | -1 | NO |
| require_level | int(11) | Integer | YES | 0 | NO |
| aura_id | smallint(6) | Short | YES | -1 | NO |

Primary key: id

## recharge_card

Java model: RechargeCardRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| recharge_card_id | bigint(20) | Long | NO | — | YES |
| card_detail_id | int(11) | Integer | NO | — | NO |
| account_id | int(11) | Integer | NO | — | NO |
| seri | text | String | YES | NULL | NO |
| CODE | text | String | YES | NULL | NO |
| Created | timestamp | java.sql.Timestamp | NO | current_timestamp() | NO |
| STATUS | int(11) | Integer | YES | 1 | NO |
| trans_id | longtext | String | YES | NULL | NO |

Primary key: recharge_card_id
Index: card_detail_id (card_detail_id)
Index: account_id (account_id)

## shop

Java model: ShopRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | YES |
| npc_id | int(11) | Integer | NO | — | NO |
| tag_name | varchar(50) | String | YES | NULL | NO |
| type_shop | int(11) | Integer | YES | NULL | NO |

Primary key: id
Index: npc_id (npc_id)
Foreign key shop_ibfk_1: npc_id → npc_template (id)

## shop_ky_gui

Java model: ShopKyGuiRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| player_id | int(11) | Integer | NO | — | NO |
| tab | int(11) | Integer | NO | — | NO |
| item_id | int(11) | Integer | NO | — | NO |
| gold | int(11) | Integer | NO | — | NO |
| gem | int(11) | Integer | NO | — | NO |
| quantity | int(11) | Integer | NO | — | NO |
| itemOption | text | String | NO | '[]' | NO |
| isUpTop | int(11) | Integer | NO | — | NO |
| isBuy | int(11) | Integer | NO | — | NO |

Primary key: id

## side_task_template

Java model: SideTaskTemplateRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| NAME | varchar(255) | String | NO | — | NO |
| max_count_lv1 | varchar(255) | String | NO | — | NO |
| max_count_lv2 | varchar(255) | String | NO | — | NO |
| max_count_lv3 | varchar(255) | String | NO | — | NO |
| max_count_lv4 | varchar(255) | String | NO | — | NO |
| max_count_lv5 | varchar(255) | String | NO | — | NO |

Primary key: id

## skill_template

Java model: SkillTemplateRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| nclass_id | int(11) | Integer | NO | — | NO |
| id | int(11) | Integer | NO | — | NO |
| NAME | varchar(50) | String | NO | — | NO |
| max_point | smallint(6) | Short | NO | 7 | NO |
| mana_use_type | smallint(6) | Short | NO | — | NO |
| TYPE | smallint(6) | Short | NO | — | NO |
| icon_id | int(11) | Integer | NO | — | NO |
| dam_info | varchar(255) | String | NO | — | NO |
| slot | int(11) | Integer | NO | — | NO |
| skills | text | String | NO | — | NO |

Primary key: nclass_id, id
Foreign key skill_template_ibfk_1: nclass_id → nclass (id)

## small_version

Java model: SmallVersionRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| x1 | int(11) | Integer | NO | — | NO |
| x2 | int(11) | Integer | NO | — | NO |
| x3 | int(11) | Integer | NO | — | NO |
| x4 | int(11) | Integer | NO | — | NO |

Primary key: id

## tab_shop

Java model: TabShopRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | YES |
| shop_id | int(11) | Integer | NO | — | NO |
| NAME | varchar(50) | String | NO | — | NO |

Primary key: id
Index: shop_id (shop_id)

## task_main_template

Java model: TaskMainTemplateRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| NAME | varchar(255) | String | NO | — | NO |
| detail | varchar(255) | String | NO | — | NO |

Primary key: id

## task_sub_template

Java model: TaskSubTemplateRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| task_main_id | int(11) | Integer | NO | — | NO |
| NAME | varchar(255) | String | NO | — | NO |
| max_count | int(11) | Integer | NO | -1 | NO |
| notify | varchar(255) | String | NO | '' | NO |
| npc_id | int(11) | Integer | NO | -1 | NO |
| map | int(11) | Integer | NO | — | NO |

Primary key: not declared
Index: task_main_id (task_main_id)

## token

Java model: TokenRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| token_id | bigint(20) | Long | NO | — | YES |
| CODE | varchar(50) | String | NO | — | NO |
| created | date | java.sql.Date | YES | curdate() | NO |
| account_id | int(11) | Integer | NO | — | NO |
| expiry | date | java.sql.Date | YES | NULL | NO |

Primary key: token_id
Unique index: account_id (account_id)
Unique index: UK_1l8br3dq53yfan1deqeb246os (account_id)

## type_item

Java model: TypeItemRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | YES |
| NAME | varchar(50) | String | NO | '' | NO |

Primary key: id

## type_map

Java model: TypeMapRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | NO |
| NAME | varchar(55) | String | NO | — | NO |

Primary key: id

## type_sell_item_shop

Java model: TypeSellItemShopRow

| Column | SQL type | Java type | Nullable | Default | Auto increment |
|---|---|---|---|---|---|
| id | int(11) | Integer | NO | — | YES |
| NAME | varchar(50) | String | NO | — | NO |

Primary key: id

