/*
Navicat MySQL Data Transfer

Source Server         : huangjing
Source Server Version : 50153
Source Host           : localhost:3306
Source Database       : huangjing

Target Server Type    : MYSQL
Target Server Version : 50153
File Encoding         : 65001

Date: 2020-06-10 10:41:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for countrys
-- ----------------------------
DROP TABLE IF EXISTS `countrys`;
CREATE TABLE `countrys` (
  `countryid` int(11) NOT NULL,
  `CountryName` varchar(10) NOT NULL,
  `price` double(8,1) DEFAULT NULL,
  PRIMARY KEY (`countryid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of countrys
-- ----------------------------
INSERT INTO `countrys` VALUES ('1', 'Sweden', '1.3');
INSERT INTO `countrys` VALUES ('2', 'China', '4.0');
INSERT INTO `countrys` VALUES ('3', 'Brzail', '8.6');
INSERT INTO `countrys` VALUES ('4', 'Australia', '7.2');
