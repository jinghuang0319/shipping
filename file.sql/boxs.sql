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
INSERT INTO `boxs` VALUES ('11', 'box5', '55.0', 'bg', '220.00');
INSERT INTO `boxs` VALUES ('12', 'sss', '555.0', '', '4773.00');
INSERT INTO `boxs` VALUES ('13', 'erw', '34.0', '', '44.20');
INSERT INTO `boxs` VALUES ('14', 'trr', '34.0', '', '44.20');
INSERT INTO `boxs` VALUES ('15', 'trr', '34.0', '', '44.20');
INSERT INTO `boxs` VALUES ('16', 'trr', '34.0', '#808080', '44.20');
INSERT INTO `boxs` VALUES ('17', 'trr', '34.0', '#00ff00', '44.20');
INSERT INTO `boxs` VALUES ('18', 'food', '500.0', '#ff0000', '500.00');
INSERT INTO `boxs` VALUES ('19', 'food', '500.0', '#ff0000', '500.00');
INSERT INTO `boxs` VALUES ('20', 'f', '3.0', '#808080', '3.90');
INSERT INTO `boxs` VALUES ('155', 'mybox', '22.0', '(ffff', '28.60');
INSERT INTO `boxs` VALUES ('156', 'jing', '12.0', '000000', '48.00');
INSERT INTO `boxs` VALUES ('157', 'ghg', '0.0', '000000', '0.00');
INSERT INTO `boxs` VALUES ('158', 'ghg', '0.0', '000000', '0.00');
INSERT INTO `boxs` VALUES ('159', 'sfd', '0.0', 'ffffff', '0.00');
INSERT INTO `boxs` VALUES ('160', 'sfd', '9.0', 'ffffff', '11.70');
INSERT INTO `boxs` VALUES ('161', 'sfd', '2.0', '004040', '2.60');
INSERT INTO `boxs` VALUES ('162', 'sfd', '3.0', '8000ff', '3.90');
INSERT INTO `boxs` VALUES ('163', 'sfd', '0.0', '8000ff', '0.00');
