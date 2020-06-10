/*
Navicat MySQL Data Transfer

Source Server         : huangjing
Source Server Version : 50153
Source Host           : localhost:3306
Source Database       : huangjing

Target Server Type    : MYSQL
Target Server Version : 50153
File Encoding         : 65001

Date: 2020-06-09 18:46:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for boxs
-- ----------------------------
DROP TABLE IF EXISTS `boxs`;
CREATE TABLE `boxs` (
  `boxsid` int(8) NOT NULL AUTO_INCREMENT,
  `boxName` varchar(10) NOT NULL,
  `boxWeight` double(8,1) NOT NULL,
  `boxColour` varchar(8) NOT NULL,
  `sumcost` double(8,2) NOT NULL,
  PRIMARY KEY (`boxsid`)
) ENGINE=InnoDB AUTO_INCREMENT=164 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of boxs
-- ----------------------------
INSERT INTO `boxs` VALUES ('1', 'box1', '22.0', '#000000', '200.00');
INSERT INTO `boxs` VALUES ('2', 'box1', '21.0', '#0080ff', '300.00');
INSERT INTO `boxs` VALUES ('3', 'box3', '40.0', '#00ff00', '52.00');
INSERT INTO `boxs` VALUES ('4', 'box4', '40.0', '#00ff00', '52.00');
