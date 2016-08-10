SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `final_standing`;
DROP TABLE IF EXISTS `game`;
DROP TABLE IF EXISTS `groups`;
DROP TABLE IF EXISTS `player`;
DROP TABLE IF EXISTS `participant`;
DROP TABLE IF EXISTS `group_participant`;
DROP TABLE IF EXISTS `matchs`;
DROP TABLE IF EXISTS `play_off_game`;
DROP TABLE IF EXISTS `stage`;
DROP TABLE IF EXISTS `tournament`;
DROP TABLE IF EXISTS `rating`;
DROP TABLE IF EXISTS `tournament_rating`;
DROP TABLE IF EXISTS `rating_points`;
DROP TABLE IF EXISTS `playing_format`;
DROP TABLE IF EXISTS `tournament_admin`;
DROP TABLE IF EXISTS `user`;
DROP TABLE IF EXISTS `ithf_tournament`;
SET FOREIGN_KEY_CHECKS=1;

--
-- Table structure for table `final_standing`
--

CREATE TABLE IF NOT EXISTS `final_standing` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PARTICIPANT_ID` int(11) DEFAULT NULL,
  `FINAL_RANK` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `FINAL_RANK` (`FINAL_RANK`,`PARTICIPANT_ID`),
  KEY `PARTICIPANT_ID` (`PARTICIPANT_ID`),
  KEY `FINAL_RANK_2` (`FINAL_RANK`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `game`
--

CREATE TABLE IF NOT EXISTS `game` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `HOME_GROUP_PARTICIPANT_ID` int(11) NOT NULL,
  `AWAY_GROUP_PARTICIPANT_ID` int(11) NOT NULL,
  `RESULT` varchar(50) DEFAULT NULL,  
  `STATUS` enum('WIN','LOSE','DRAW') DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `HOME_GROUP_PARTICIPANT_ID` (`HOME_GROUP_PARTICIPANT_ID`),
  KEY `AWAY_GROUP_PARTICIPANT_ID` (`AWAY_GROUP_PARTICIPANT_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `groups`
--

CREATE TABLE IF NOT EXISTS `groups` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) NOT NULL,
  `STAGE_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `STAGE_ID` (`STAGE_ID`),
  KEY `NAME` (`NAME`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `group_participant`
--

CREATE TABLE IF NOT EXISTS `group_participant` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `GROUP_ID` int(11) NOT NULL,
  `PARTICIPANT_ID` int(11) NOT NULL,
  `POINTS` int(4) NOT NULL DEFAULT '0',
  `SCORE` varchar(10) NOT NULL DEFAULT '0:0',
  `RANK` int(4) DEFAULT NULL,
  `SECONDARY_RANK` int(11) DEFAULT NULL,  
  PRIMARY KEY (`ID`),
  KEY `GROUP_ID` (`GROUP_ID`),
  KEY `PARTICIPANT_ID` (`PARTICIPANT_ID`),
  KEY `RANK` (`RANK`)  
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `ithf_tournament`
--

CREATE TABLE IF NOT EXISTS `ithf_tournament` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PLAYER_ID` int(11) NOT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `SERIES` varchar(255) DEFAULT NULL,
  `DATE` date NOT NULL,
  `POINTS` int(11) DEFAULT NULL,
  `RANK` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `WCH_QUALIFICATION_ID` (`PLAYER_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `matchs`
--

CREATE TABLE IF NOT EXISTS `matchs` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `HOME_PLAYER_ID` int(11) DEFAULT NULL,
  `AWAY_PLAYER_ID` int(11) DEFAULT NULL,
  `GAME_ID` int(11) DEFAULT NULL,
  `GROUP_ID` int(11) NOT NULL,
  `ROUND` int(11) DEFAULT NULL,
  `HOCKEY` int(11) DEFAULT NULL,  
  PRIMARY KEY (`ID`),
  KEY `HOME_PLAYER_ID` (`HOME_PLAYER_ID`),
  KEY `AWAY_PLAYER_ID` (`AWAY_PLAYER_ID`),
  KEY `GROUP_ID` (`GROUP_ID`),
  KEY `GAME_ID` (`GAME_ID`),
  KEY `ROUND` (`ROUND`),
  KEY `HOCKEY` (`HOCKEY`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `player`
--

CREATE TABLE IF NOT EXISTS `player` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `SURNAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `NICKNAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `GENDER` enum('M','F','0') NOT NULL DEFAULT '0',
  `DATE_OF_BIRTH` date DEFAULT NULL,
  `COUNTRY` varchar(255) DEFAULT NULL,
  `CITY` varchar(255) DEFAULT NULL,
  `CLUB` varchar(255) DEFAULT NULL,
  `WORLD_RANKING` int(11) DEFAULT NULL,
  `ITHF_ID` int(11) DEFAULT NULL,
  `NAME_ASCII` varchar(255) NOT NULL,
  `SURNAME_ASCII` varchar(255) NOT NULL,
  `VERIFICATION` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `playing_format`
--

CREATE TABLE IF NOT EXISTS `playing_format` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) NOT NULL,
  `FINAL_PROMOTING` int(11) NOT NULL,
  `LOWER_PROMOTING` int(11) NOT NULL,
  `WIN_POINTS` int(11) NOT NULL,
  `PLAY_OFF_FINAL` int(11) NOT NULL,
  `PLAY_OFF_LOWER` int(11) NOT NULL,
  `MIN_PLAYERS_IN_GROUP` int(11) NOT NULL,
  `SORT_TYPE` enum('SK','CZ','INFO') NOT NULL DEFAULT 'INFO',
  `DESCRIPTION` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `play_off_game`
--

CREATE TABLE IF NOT EXISTS `play_off_game` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `HOME_PARTICIPANT_ID` int(11) DEFAULT NULL,
  `AWAY_PARTICIPANT_ID` int(11) DEFAULT NULL,
  `STATUS` enum('WIN','LOSE','DRAW') DEFAULT NULL,
  `RESULT` varchar(50) DEFAULT NULL,
  `STAGE_ID` int(11) NOT NULL,
  `POSITION` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `HOME_PARTICIPANT_ID` (`HOME_PARTICIPANT_ID`),
  KEY `AWAY_PARTICIPANT_ID` (`AWAY_PARTICIPANT_ID`),
  KEY `STAGE_ID` (`STAGE_ID`),
  KEY `POSITION` (`POSITION`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `rating`
--

CREATE TABLE IF NOT EXISTS `rating` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `RATING_POINTS_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `RATING_POINTS_ID` (`RATING_POINTS_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `rating_points`
--

CREATE TABLE IF NOT EXISTS `rating_points` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) NOT NULL,
  `POINTS` int(4) NOT NULL DEFAULT '0',
  `RANK` int(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `stage`
--

CREATE TABLE IF NOT EXISTS `stage` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) NOT NULL,
  `SEQUENCE` int(11) NOT NULL,
  `NUMBER_OF_HOCKEY` int(4) NOT NULL DEFAULT '1',
  `WIN_POINTS` int(4) NOT NULL DEFAULT '2',
  `TYPE` enum('RR','PO') NOT NULL COMMENT 'RR->RoundRobin->stage contains another groups, PO->Playoff no additional groups',
  `TOURNAMENT_ID` int(11) NOT NULL,
  `STATUS` enum('NS','BC','F') NOT NULL DEFAULT 'NS',
  `COPY_RESULT_STAGE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `TOURNAMENT_ID` (`TOURNAMENT_ID`),
  KEY `COPY_RESULT_STAGE_ID` (`COPY_RESULT_STAGE_ID`),
  KEY `NAME` (`NAME`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `tournament`
--

CREATE TABLE IF NOT EXISTS `tournament` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) NOT NULL,
  `STATUS` enum('RO','RC','NS','BC','F') NOT NULL DEFAULT 'RO',
  `PLAYING_FORMAT_ID` int(11) DEFAULT NULL,
  `COUNTRY` varchar(255) DEFAULT NULL,
  `CITY` varchar(255) DEFAULT NULL,
  `ADDRESS` varchar(255) DEFAULT NULL,
  `LOGO` blob,
  `REGISTRATION_FROM` timestamp NULL DEFAULT NULL,
  `TOURNAMENT_DATE` date DEFAULT NULL,
  `REGISTRATION_TO` timestamp NULL DEFAULT NULL,
  `VISIBLE` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`),
  KEY `PLAYING_FORMAT_ID` (`PLAYING_FORMAT_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `tournament_admin`
--

CREATE TABLE IF NOT EXISTS `tournament_admin` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TOURNAMENT_ID` int(11) NOT NULL,
  `USER_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `TOURNAMENT_ADMIN_ibfk_1` (`TOURNAMENT_ID`),
  KEY `TOURNAMENT_ADMIN_ibfk_2` (`USER_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `participant`
--

CREATE TABLE IF NOT EXISTS `participant` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TOURNAMENT_ID` int(11) NOT NULL,
  `PLAYER_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `TOURNAMENT_PLAYER_ID` (`TOURNAMENT_ID`,`PLAYER_ID`),
  KEY `TOURNAMENT_ID` (`TOURNAMENT_ID`),
  KEY `PLAYER_ID` (`PLAYER_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `tournament_rating`
--

CREATE TABLE IF NOT EXISTS `tournament_rating` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TOURNAMENT_ID` int(11) NOT NULL,
  `RATING_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `TOURNAMENT_RATING_ibfk_1` (`TOURNAMENT_ID`),
  KEY `TOURNAMENT_RATING_ibfk_2` (`RATING_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `PLAYER_ID` int(11) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `LOGIN` varchar(255) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `PHONE` varchar(255) DEFAULT NULL,
  `ROLE` enum('ADMIN','USER') NOT NULL DEFAULT 'USER',
  `VALIDITY` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`PLAYER_ID`),
  UNIQUE KEY `LOGIN` (`LOGIN`),
  UNIQUE KEY `EMAIL` (`EMAIL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Constraints for table `final_standing`
--
ALTER TABLE `final_standing`
  ADD CONSTRAINT `FINAL_STANDING_ibfk_1` FOREIGN KEY (`PARTICIPANT_ID`) REFERENCES `participant` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `game`
--
ALTER TABLE `game`
  ADD CONSTRAINT `GAME_ibfk_1` FOREIGN KEY (`HOME_GROUP_PARTICIPANT_ID`) REFERENCES `group_participant` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `GAME_ibfk_2` FOREIGN KEY (`AWAY_GROUP_PARTICIPANT_ID`) REFERENCES `group_participant` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `groups`
--
ALTER TABLE `groups`
  ADD CONSTRAINT `GROUPS_ibfk_1` FOREIGN KEY (`STAGE_ID`) REFERENCES `stage` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `group_participant`
--
ALTER TABLE `group_participant`
  ADD CONSTRAINT `GROUP_PARTICIPANT_ibfk_1` FOREIGN KEY (`PARTICIPANT_ID`) REFERENCES `participant` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `GROUP_PARTICIPANT_ibfk_2` FOREIGN KEY (`GROUP_ID`) REFERENCES `groups` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `matchs`
--
ALTER TABLE `matchs`
  ADD CONSTRAINT `matchs_ibfk_1` FOREIGN KEY (`HOME_PLAYER_ID`) REFERENCES `player` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `matchs_ibfk_2` FOREIGN KEY (`AWAY_PLAYER_ID`) REFERENCES `player` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `matchs_ibfk_3` FOREIGN KEY (`GROUP_ID`) REFERENCES `groups` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `matchs_ibfk_4` FOREIGN KEY (`GAME_ID`) REFERENCES `game` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;
  
--
-- Constraints for table `ithf_tournament`
--
ALTER TABLE `ithf_tournament`
  ADD CONSTRAINT `ithf_tournament_ibfk_1` FOREIGN KEY (`PLAYER_ID`) REFERENCES `player` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `play_off_game`
--
ALTER TABLE `play_off_game`
  ADD CONSTRAINT `play_off_game_ibfk_1` FOREIGN KEY (`HOME_PARTICIPANT_ID`) REFERENCES `participant` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `play_off_game_ibfk_2` FOREIGN KEY (`AWAY_PARTICIPANT_ID`) REFERENCES `participant` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `play_off_game_ibfk_3` FOREIGN KEY (`STAGE_ID`) REFERENCES `stage` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rating`
--
ALTER TABLE `rating`
  ADD CONSTRAINT `RATING_ibfk_1` FOREIGN KEY (`RATING_POINTS_ID`) REFERENCES `rating_points` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `stage`
--
ALTER TABLE `stage`
  ADD CONSTRAINT `STAGE_ibfk_1` FOREIGN KEY (`TOURNAMENT_ID`) REFERENCES `tournament` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `STAGE_ibfk_2` FOREIGN KEY (`COPY_RESULT_STAGE_ID`) REFERENCES `stage` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tournament`
--
ALTER TABLE `tournament`
  ADD CONSTRAINT `TOURNAMENT_ibfk_1` FOREIGN KEY (`PLAYING_FORMAT_ID`) REFERENCES `playing_format` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tournament_admin`
--
ALTER TABLE `tournament_admin`
  ADD CONSTRAINT `TOURNAMENT_ADMIN_ibfk_1` FOREIGN KEY (`TOURNAMENT_ID`) REFERENCES `tournament` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `TOURNAMENT_ADMIN_ibfk_2` FOREIGN KEY (`USER_ID`) REFERENCES `user` (`PLAYER_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `participant`
--
ALTER TABLE `participant`
  ADD CONSTRAINT `PARTICIPANT_fk_1` FOREIGN KEY (`TOURNAMENT_ID`) REFERENCES `tournament` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `PARTICIPANT_fk_2` FOREIGN KEY (`PLAYER_ID`) REFERENCES `player` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tournament_rating`
--
ALTER TABLE `tournament_rating`
  ADD CONSTRAINT `TOURNAMENT_RATING_ibfk_1` FOREIGN KEY (`TOURNAMENT_ID`) REFERENCES `tournament` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `TOURNAMENT_RATING_ibfk_2` FOREIGN KEY (`RATING_ID`) REFERENCES `rating` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `USER_ibfk_1` FOREIGN KEY (`PLAYER_ID`) REFERENCES `player` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;
