-- NROHENDY database schema (sanitized public version)
-- Derived from the legacy MariaDB dump. Static game rows live in database/seeds/game-static-data.sql.
-- Runtime account/player/guild state, gift codes and top-up records are intentionally excluded.
-- Select/create the target database before importing. Review docs/DB_SCHEMA_AUDIT.md before production use.

-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 20, 2023 lúc 12:40 PM
-- Phiên bản máy phục vụ: 10.4.28-MariaDB
-- Phiên bản PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `hendy`
--

DELIMITER $$
--
-- Các hàm
--
CREATE FUNCTION `SPLIT_STR` (`x` VARCHAR(255), `delim` VARCHAR(12), `pos` INT) RETURNS VARCHAR(255) CHARSET utf8mb4 COLLATE utf8mb4_general_ci  RETURN REPLACE(SUBSTRING(SUBSTRING_INDEX(x, delim, pos),
       CHAR_LENGTH(SUBSTRING_INDEX(x, delim, pos -1)) + 1),
       delim, "")$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `account`
--

CREATE TABLE `account` (
  `id` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(100) NOT NULL,
  `create_time` timestamp NULL DEFAULT current_timestamp(),
  `update_time` timestamp NULL DEFAULT current_timestamp(),
  `ban` smallint(6) NOT NULL DEFAULT 0,
  `point_post` int(11) NOT NULL DEFAULT 0,
  `last_post` int(11) NOT NULL DEFAULT 0,
  `role` int(11) NOT NULL DEFAULT -1,
  `is_admin` tinyint(1) NOT NULL DEFAULT 0,
  `last_time_login` timestamp NOT NULL DEFAULT '2002-05-07 07:00:00',
  `last_time_logout` timestamp NOT NULL DEFAULT '2002-05-07 07:00:00',
  `ip_address` varchar(50) DEFAULT NULL,
  `active` int(11) NOT NULL DEFAULT 0,
  `thoi_vang` int(11) NOT NULL DEFAULT 0,
  `server_login` int(11) NOT NULL DEFAULT -1,
  `bd_player` double DEFAULT 1,
  `is_gift_box` tinyint(1) DEFAULT 0,
  `gift_time` varchar(255) DEFAULT '0',
  `reward` longtext DEFAULT NULL,
  `tongnap` int(11) NOT NULL DEFAULT 0,
  `coin` int(11) NOT NULL DEFAULT 0,
  `vnd` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `account`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `archive_template`
--

CREATE TABLE `archive_template` (
  `id` int(11) NOT NULL,
  `info1` text NOT NULL,
  `info2` text NOT NULL,
  `money` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `archive_template`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bg_item_template`
--

CREATE TABLE `bg_item_template` (
  `id` int(11) NOT NULL,
  `image_id` int(11) NOT NULL,
  `layer` int(11) NOT NULL,
  `dx` int(11) NOT NULL,
  `dy` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `bg_item_template`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `caption`
--

CREATE TABLE `caption` (
  `id` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `caption`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `card`
--

CREATE TABLE `card` (
  `card_id` int(11) NOT NULL,
  `NAME` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `khuyen_mai` int(11) DEFAULT 0,
  `status` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Đang đổ dữ liệu cho bảng `card`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `card_detail`
--

CREATE TABLE `card_detail` (
  `card_detail_id` int(11) NOT NULL,
  `card_id` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `thoi_vang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `clan_sv1`
--

CREATE TABLE `clan_sv1` (
  `id` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `slogan` varchar(255) NOT NULL DEFAULT '',
  `img_id` int(11) NOT NULL DEFAULT 0,
  `power_point` bigint(20) NOT NULL DEFAULT 0,
  `max_member` smallint(6) NOT NULL DEFAULT 10,
  `clan_point` int(11) NOT NULL DEFAULT 0,
  `LEVEL` int(11) NOT NULL DEFAULT 1,
  `members` text NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `clan_sv1`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `clan_sv2`
--

CREATE TABLE `clan_sv2` (
  `id` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `slogan` varchar(255) NOT NULL DEFAULT '',
  `img_id` int(11) NOT NULL DEFAULT 0,
  `power_point` bigint(20) NOT NULL DEFAULT 0,
  `max_member` smallint(6) NOT NULL DEFAULT 10,
  `clan_point` int(11) NOT NULL DEFAULT 0,
  `LEVEL` int(11) NOT NULL DEFAULT 1,
  `members` text NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `comment`
--

CREATE TABLE `comment` (
  `comment_id` bigint(20) NOT NULL,
  `question_id` bigint(20) NOT NULL,
  `content` text DEFAULT NULL,
  `created` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dhvt_template`
--

CREATE TABLE `dhvt_template` (
  `id` int(11) NOT NULL,
  `cup` varchar(999) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL DEFAULT '0',
  `time` varchar(999) NOT NULL DEFAULT '0',
  `gem` int(11) NOT NULL DEFAULT 0,
  `gold` int(11) NOT NULL DEFAULT 0,
  `min_start` int(11) NOT NULL DEFAULT 0,
  `min_limit` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `dhvt_template`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `flag_bag`
--

CREATE TABLE `flag_bag` (
  `id` int(11) NOT NULL,
  `icon_data` varchar(255) NOT NULL,
  `NAME` varchar(255) NOT NULL DEFAULT 'flag_bag',
  `gold` int(11) NOT NULL DEFAULT -1,
  `gem` int(11) NOT NULL DEFAULT -1,
  `icon_id` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `flag_bag`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `giftcode`
--

CREATE TABLE `giftcode` (
  `id` int(11) NOT NULL,
  `code` varchar(255) NOT NULL,
  `count_left` int(11) NOT NULL,
  `detail` text NOT NULL,
  `datecreate` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `expired` timestamp NULL DEFAULT NULL,
  `itemoption` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `listIdUser` text DEFAULT '[]'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Đang đổ dữ liệu cho bảng `giftcode`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `head_avatar`
--

CREATE TABLE `head_avatar` (
  `head_id` int(11) NOT NULL,
  `avatar_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `head_avatar`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `history_event`
--

CREATE TABLE `history_event` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `point` int(11) DEFAULT 0,
  `created` date DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `history_gold`
--

CREATE TABLE `history_gold` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `gold` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `history_receive_goldbar`
--

CREATE TABLE `history_receive_goldbar` (
  `player_id` int(11) NOT NULL,
  `player_name` varchar(255) NOT NULL,
  `gold_before_receive` int(11) NOT NULL,
  `gold_after_receive` int(11) NOT NULL,
  `gold_bag_before` int(11) NOT NULL,
  `gold_bag_after` int(11) NOT NULL,
  `gold_box_before` int(11) NOT NULL,
  `gold_box_after` int(11) NOT NULL,
  `time_receive` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `history_transaction`
--

CREATE TABLE `history_transaction` (
  `player_1` varchar(255) NOT NULL,
  `player_2` varchar(255) NOT NULL,
  `item_player_1` text NOT NULL,
  `item_player_2` text NOT NULL,
  `bag_1_before_tran` text NOT NULL,
  `bag_2_before_tran` text NOT NULL,
  `bag_1_after_tran` text NOT NULL,
  `bag_2_after_tran` text NOT NULL,
  `time_tran` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `img_by_name`
--

CREATE TABLE `img_by_name` (
  `id` int(11) NOT NULL,
  `NAME` varchar(55) NOT NULL,
  `n_frame` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `img_by_name`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `intrinsic`
--

CREATE TABLE `intrinsic` (
  `id` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `param_from_1` int(11) NOT NULL DEFAULT 0,
  `param_to_1` int(11) NOT NULL DEFAULT 0,
  `param_from_2` int(11) NOT NULL DEFAULT 0,
  `param_to_2` int(11) NOT NULL DEFAULT 0,
  `icon` int(11) NOT NULL DEFAULT 0,
  `gender` smallint(6) NOT NULL DEFAULT 3
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `intrinsic`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `item_option_template`
--

CREATE TABLE `item_option_template` (
  `id` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `item_option_template`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `item_shop`
--

CREATE TABLE `item_shop` (
  `id` int(11) NOT NULL,
  `tab_id` int(11) NOT NULL,
  `temp_id` int(11) NOT NULL,
  `is_new` tinyint(1) NOT NULL DEFAULT 1,
  `is_sell` tinyint(1) NOT NULL DEFAULT 1,
  `type_sell` int(11) DEFAULT 1,
  `cost` int(11) DEFAULT 0,
  `icon_spec` int(11) DEFAULT 0,
  `create_time` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `item_shop`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `item_shop_option`
--

CREATE TABLE `item_shop_option` (
  `item_shop_id` int(11) NOT NULL,
  `option_id` int(11) NOT NULL,
  `param` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `item_shop_option`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `item_template`
--

CREATE TABLE `item_template` (
  `id` int(11) NOT NULL,
  `TYPE` int(11) NOT NULL,
  `gender` smallint(6) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `icon_id` int(11) NOT NULL,
  `part` int(11) NOT NULL,
  `is_up_to_up` tinyint(1) NOT NULL,
  `power_require` int(11) NOT NULL,
  `gold` int(11) NOT NULL DEFAULT 0,
  `gem` int(11) NOT NULL DEFAULT 0,
  `head` int(11) NOT NULL DEFAULT -1,
  `body` int(11) NOT NULL DEFAULT -1,
  `leg` int(11) NOT NULL DEFAULT -1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `item_template`
--






-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `map_template`
--

CREATE TABLE `map_template` (
  `id` int(11) NOT NULL,
  `NAME` varchar(55) NOT NULL,
  `zones` int(11) NOT NULL DEFAULT 1,
  `max_player` int(11) NOT NULL DEFAULT 15,
  `data` varchar(1000) NOT NULL DEFAULT '[]',
  `type` int(11) NOT NULL DEFAULT 1,
  `planet_id` int(11) NOT NULL DEFAULT 1,
  `bg_type` int(11) NOT NULL DEFAULT 1,
  `tile_id` int(11) NOT NULL DEFAULT 1,
  `bg_id` int(11) NOT NULL DEFAULT 1,
  `waypoints` text NOT NULL,
  `mobs` text NOT NULL,
  `npcs` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `map_template`
--




-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `mob_template`
--

CREATE TABLE `mob_template` (
  `id` int(11) NOT NULL,
  `TYPE` int(11) NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `hp` int(11) NOT NULL,
  `range_move` smallint(6) NOT NULL,
  `speed` smallint(6) NOT NULL,
  `dart_type` smallint(6) NOT NULL,
  `percent_dame` smallint(6) NOT NULL DEFAULT 5,
  `percent_tiem_nang` smallint(6) NOT NULL DEFAULT 50
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `mob_template`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `naptien`
--

CREATE TABLE `naptien` (
  `id` int(11) NOT NULL,
  `uid` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `sotien` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `seri` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `code` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `loaithe` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `time` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `noidung` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tinhtrang` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tranid` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `magioithieu` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Đang đổ dữ liệu cho bảng `naptien`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nclass`
--

CREATE TABLE `nclass` (
  `id` int(11) NOT NULL,
  `NAME` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nclass`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `npc_template`
--

CREATE TABLE `npc_template` (
  `id` int(11) NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `head` int(11) NOT NULL,
  `body` int(11) NOT NULL,
  `leg` int(11) NOT NULL,
  `avatar` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `npc_template`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `part`
--

CREATE TABLE `part` (
  `id` int(11) NOT NULL,
  `TYPE` int(11) NOT NULL,
  `DATA` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `part`
--







-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `player`
--

CREATE TABLE `player` (
  `id` int(11) NOT NULL,
  `account_id` int(11) DEFAULT NULL,
  `name` varchar(20) NOT NULL,
  `head` int(11) NOT NULL DEFAULT 102,
  `gender` int(11) NOT NULL,
  `have_tennis_space_ship` tinyint(1) DEFAULT 0,
  `clan_id_sv1` int(11) NOT NULL DEFAULT -1,
  `clan_id_sv2` int(11) NOT NULL DEFAULT -1,
  `data_inventory` text NOT NULL,
  `data_location` text NOT NULL,
  `data_point` text NOT NULL,
  `data_magic_tree` text NOT NULL,
  `items_body` text NOT NULL,
  `items_bag` text NOT NULL,
  `items_box` text NOT NULL,
  `items_box_lucky_round` text NOT NULL,
  `friends` text NOT NULL,
  `enemies` text NOT NULL,
  `data_intrinsic` text NOT NULL,
  `data_item_time` text NOT NULL,
  `data_item_time_sieu_cap` text NOT NULL,
  `data_task` text NOT NULL,
  `data_mabu_egg` text NOT NULL,
  `data_charm` text NOT NULL,
  `skills` text NOT NULL,
  `skills_shortcut` text NOT NULL,
  `pet` text NOT NULL,
  `data_black_ball` text NOT NULL,
  `data_side_task` text NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT current_timestamp(),
  `violate` int(11) NOT NULL DEFAULT 0,
  `pointPvp` int(11) DEFAULT 0,
  `NguHanhSonPoint` int(11) DEFAULT 0,
  `data_card` text NOT NULL,
  `bill_data` text NOT NULL,
  `dataArchiverment` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `player`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `post_question`
--

CREATE TABLE `post_question` (
  `question_id` bigint(20) NOT NULL,
  `title` text NOT NULL,
  `content` text DEFAULT NULL,
  `created` timestamp NOT NULL DEFAULT current_timestamp(),
  `STATUS` int(11) DEFAULT 0,
  `account_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `radar`
--

CREATE TABLE `radar` (
  `id` int(11) NOT NULL,
  `iconId` int(11) DEFAULT 0,
  `rank` tinyint(4) DEFAULT 0,
  `max` int(11) DEFAULT 60,
  `type` int(11) DEFAULT 0,
  `template` int(11) DEFAULT 1,
  `body` varchar(500) DEFAULT '[]',
  `name` varchar(500) DEFAULT '',
  `info` varchar(2000) DEFAULT '',
  `options` varchar(2000) DEFAULT '[]',
  `require` int(11) DEFAULT -1,
  `require_level` int(11) DEFAULT 0,
  `aura_id` smallint(6) DEFAULT -1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `radar`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `recharge_card`
--

CREATE TABLE `recharge_card` (
  `recharge_card_id` bigint(20) NOT NULL,
  `card_detail_id` int(11) NOT NULL,
  `account_id` int(11) NOT NULL,
  `seri` text DEFAULT NULL,
  `CODE` text DEFAULT NULL,
  `Created` timestamp NOT NULL DEFAULT current_timestamp(),
  `STATUS` int(11) DEFAULT 1,
  `trans_id` longtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `shop`
--

CREATE TABLE `shop` (
  `id` int(11) NOT NULL,
  `npc_id` int(11) NOT NULL,
  `tag_name` varchar(50) DEFAULT NULL,
  `type_shop` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `shop`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `shop_ky_gui`
--

CREATE TABLE `shop_ky_gui` (
  `id` int(11) NOT NULL,
  `player_id` int(11) NOT NULL,
  `tab` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  `gold` int(11) NOT NULL,
  `gem` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `itemOption` text NOT NULL DEFAULT '[]',
  `isUpTop` int(11) NOT NULL,
  `isBuy` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `side_task_template`
--

CREATE TABLE `side_task_template` (
  `id` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `max_count_lv1` varchar(255) NOT NULL,
  `max_count_lv2` varchar(255) NOT NULL,
  `max_count_lv3` varchar(255) NOT NULL,
  `max_count_lv4` varchar(255) NOT NULL,
  `max_count_lv5` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `side_task_template`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `skill_template`
--

CREATE TABLE `skill_template` (
  `nclass_id` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `max_point` smallint(6) NOT NULL DEFAULT 7,
  `mana_use_type` smallint(6) NOT NULL,
  `TYPE` smallint(6) NOT NULL,
  `icon_id` int(11) NOT NULL,
  `dam_info` varchar(255) NOT NULL,
  `slot` int(11) NOT NULL,
  `skills` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `skill_template`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `small_version`
--

CREATE TABLE `small_version` (
  `id` int(11) NOT NULL,
  `x1` int(11) NOT NULL,
  `x2` int(11) NOT NULL,
  `x3` int(11) NOT NULL,
  `x4` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `small_version`
--













-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tab_shop`
--

CREATE TABLE `tab_shop` (
  `id` int(11) NOT NULL,
  `shop_id` int(11) NOT NULL,
  `NAME` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `tab_shop`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `task_main_template`
--

CREATE TABLE `task_main_template` (
  `id` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `detail` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `task_main_template`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `task_sub_template`
--

CREATE TABLE `task_sub_template` (
  `task_main_id` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `max_count` int(11) NOT NULL DEFAULT -1,
  `notify` varchar(255) NOT NULL DEFAULT '',
  `npc_id` int(11) NOT NULL DEFAULT -1,
  `map` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `task_sub_template`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `token`
--

CREATE TABLE `token` (
  `token_id` bigint(20) NOT NULL,
  `CODE` varchar(50) NOT NULL,
  `created` date DEFAULT curdate(),
  `account_id` int(11) NOT NULL,
  `expiry` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `type_item`
--

CREATE TABLE `type_item` (
  `id` int(11) NOT NULL,
  `NAME` varchar(50) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `type_item`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `type_map`
--

CREATE TABLE `type_map` (
  `id` int(11) NOT NULL,
  `NAME` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `type_map`
--



-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `type_sell_item_shop`
--

CREATE TABLE `type_sell_item_shop` (
  `id` int(11) NOT NULL,
  `NAME` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `type_sell_item_shop`
--



--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id`) USING BTREE,
  ADD UNIQUE KEY `username` (`username`) USING BTREE;

--
-- Chỉ mục cho bảng `archive_template`
--
ALTER TABLE `archive_template`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`);

--
-- Chỉ mục cho bảng `bg_item_template`
--
ALTER TABLE `bg_item_template`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `caption`
--
ALTER TABLE `caption`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `card_detail`
--
ALTER TABLE `card_detail`
  ADD PRIMARY KEY (`card_detail_id`),
  ADD KEY `card_id` (`card_id`);

--
-- Chỉ mục cho bảng `clan_sv1`
--
ALTER TABLE `clan_sv1`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `clan_sv2`
--
ALTER TABLE `clan_sv2`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`comment_id`),
  ADD KEY `question_id` (`question_id`);

--
-- Chỉ mục cho bảng `dhvt_template`
--
ALTER TABLE `dhvt_template`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `flag_bag`
--
ALTER TABLE `flag_bag`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `giftcode`
--
ALTER TABLE `giftcode`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `head_avatar`
--
ALTER TABLE `head_avatar`
  ADD PRIMARY KEY (`head_id`) USING BTREE;

--
-- Chỉ mục cho bảng `history_event`
--
ALTER TABLE `history_event`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `history_gold`
--
ALTER TABLE `history_gold`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `history_receive_goldbar`
--
ALTER TABLE `history_receive_goldbar`
  ADD KEY `player_id` (`player_id`);

--
-- Chỉ mục cho bảng `img_by_name`
--
ALTER TABLE `img_by_name`
  ADD PRIMARY KEY (`id`) USING BTREE,
  ADD UNIQUE KEY `NAME` (`NAME`) USING BTREE;

--
-- Chỉ mục cho bảng `intrinsic`
--
ALTER TABLE `intrinsic`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `item_option_template`
--
ALTER TABLE `item_option_template`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `item_shop`
--
ALTER TABLE `item_shop`
  ADD PRIMARY KEY (`id`) USING BTREE,
  ADD KEY `tab_id` (`tab_id`) USING BTREE,
  ADD KEY `temp_id` (`temp_id`) USING BTREE;

--
-- Chỉ mục cho bảng `item_shop_option`
--
ALTER TABLE `item_shop_option`
  ADD KEY `item_shop_id` (`item_shop_id`) USING BTREE,
  ADD KEY `option_id` (`option_id`) USING BTREE;

--
-- Chỉ mục cho bảng `item_template`
--
ALTER TABLE `item_template`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `map_template`
--
ALTER TABLE `map_template`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `mob_template`
--
ALTER TABLE `mob_template`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `naptien`
--
ALTER TABLE `naptien`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `nclass`
--
ALTER TABLE `nclass`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `npc_template`
--
ALTER TABLE `npc_template`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`id`) USING BTREE,
  ADD UNIQUE KEY `account_id` (`account_id`) USING BTREE;

--
-- Chỉ mục cho bảng `post_question`
--
ALTER TABLE `post_question`
  ADD PRIMARY KEY (`question_id`),
  ADD KEY `FKpijp3eahwssnf3qu27bydj928` (`account_id`);

--
-- Chỉ mục cho bảng `radar`
--
ALTER TABLE `radar`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `recharge_card`
--
ALTER TABLE `recharge_card`
  ADD PRIMARY KEY (`recharge_card_id`),
  ADD KEY `card_detail_id` (`card_detail_id`),
  ADD KEY `account_id` (`account_id`);

--
-- Chỉ mục cho bảng `shop`
--
ALTER TABLE `shop`
  ADD PRIMARY KEY (`id`) USING BTREE,
  ADD KEY `npc_id` (`npc_id`) USING BTREE;

--
-- Chỉ mục cho bảng `shop_ky_gui`
--
ALTER TABLE `shop_ky_gui`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `side_task_template`
--
ALTER TABLE `side_task_template`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `skill_template`
--
ALTER TABLE `skill_template`
  ADD PRIMARY KEY (`nclass_id`,`id`) USING BTREE;

--
-- Chỉ mục cho bảng `small_version`
--
ALTER TABLE `small_version`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `tab_shop`
--
ALTER TABLE `tab_shop`
  ADD PRIMARY KEY (`id`) USING BTREE,
  ADD KEY `shop_id` (`shop_id`) USING BTREE;

--
-- Chỉ mục cho bảng `task_main_template`
--
ALTER TABLE `task_main_template`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `task_sub_template`
--
ALTER TABLE `task_sub_template`
  ADD KEY `task_main_id` (`task_main_id`) USING BTREE;

--
-- Chỉ mục cho bảng `token`
--
ALTER TABLE `token`
  ADD PRIMARY KEY (`token_id`),
  ADD UNIQUE KEY `account_id` (`account_id`),
  ADD UNIQUE KEY `UK_1l8br3dq53yfan1deqeb246os` (`account_id`);

--
-- Chỉ mục cho bảng `type_item`
--
ALTER TABLE `type_item`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `type_map`
--
ALTER TABLE `type_map`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Chỉ mục cho bảng `type_sell_item_shop`
--
ALTER TABLE `type_sell_item_shop`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `account`
--
ALTER TABLE `account`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=107097;

--
-- AUTO_INCREMENT cho bảng `caption`
--
ALTER TABLE `caption`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT cho bảng `card_detail`
--
ALTER TABLE `card_detail`
  MODIFY `card_detail_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `comment`
--
ALTER TABLE `comment`
  MODIFY `comment_id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `dhvt_template`
--
ALTER TABLE `dhvt_template`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT cho bảng `giftcode`
--
ALTER TABLE `giftcode`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT cho bảng `history_event`
--
ALTER TABLE `history_event`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `history_gold`
--
ALTER TABLE `history_gold`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=332;

--
-- AUTO_INCREMENT cho bảng `img_by_name`
--
ALTER TABLE `img_by_name`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=82;

--
-- AUTO_INCREMENT cho bảng `item_shop`
--
ALTER TABLE `item_shop`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2013;

--
-- AUTO_INCREMENT cho bảng `naptien`
--
ALTER TABLE `naptien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=125;

--
-- AUTO_INCREMENT cho bảng `player`
--
ALTER TABLE `player`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58233;

--
-- AUTO_INCREMENT cho bảng `post_question`
--
ALTER TABLE `post_question`
  MODIFY `question_id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `recharge_card`
--
ALTER TABLE `recharge_card`
  MODIFY `recharge_card_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4344;

--
-- AUTO_INCREMENT cho bảng `shop`
--
ALTER TABLE `shop`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT cho bảng `tab_shop`
--
ALTER TABLE `tab_shop`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT cho bảng `token`
--
ALTER TABLE `token`
  MODIFY `token_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19017;

--
-- AUTO_INCREMENT cho bảng `type_item`
--
ALTER TABLE `type_item`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=78;

--
-- AUTO_INCREMENT cho bảng `type_sell_item_shop`
--
ALTER TABLE `type_sell_item_shop`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `comment`
--
ALTER TABLE `comment`
  ADD CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`question_id`) REFERENCES `post_question` (`question_id`);

--
-- Các ràng buộc cho bảng `item_shop_option`
--
ALTER TABLE `item_shop_option`
  ADD CONSTRAINT `item_shop_option_ibfk_1` FOREIGN KEY (`item_shop_id`) REFERENCES `item_shop` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `item_shop_option_ibfk_2` FOREIGN KEY (`option_id`) REFERENCES `item_option_template` (`id`);

--
-- Các ràng buộc cho bảng `player`
--
ALTER TABLE `player`
  ADD CONSTRAINT `player_ibfk_1` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`);

--
-- Các ràng buộc cho bảng `shop`
--
ALTER TABLE `shop`
  ADD CONSTRAINT `shop_ibfk_1` FOREIGN KEY (`npc_id`) REFERENCES `npc_template` (`id`);

--
-- Các ràng buộc cho bảng `skill_template`
--
ALTER TABLE `skill_template`
  ADD CONSTRAINT `skill_template_ibfk_1` FOREIGN KEY (`nclass_id`) REFERENCES `nclass` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
