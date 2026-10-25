CREATE TABLE `account` (
  `id` bigint(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `active` tinyint(1) DEFAULT 1,
  `created` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB;
CREATE TABLE `player` (
  `id` int(11) NOT NULL,
  `account_id` bigint(20) DEFAULT NULL,
  `payload` text NOT NULL
) ENGINE=InnoDB;
ALTER TABLE `player` ADD PRIMARY KEY (`id`), ADD KEY `account_id` (`account_id`);
ALTER TABLE `player` ADD CONSTRAINT `player_ibfk_1` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE CASCADE;
ALTER TABLE `account` MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
