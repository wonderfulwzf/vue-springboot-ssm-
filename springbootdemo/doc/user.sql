/*
Navicat MySQL Data Transfer

Source Server         : 666
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : springbootdemo

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2020-11-16 22:46:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `mobile` varchar(32) DEFAULT NULL COMMENT '登录名，使用电话号码作为登录名',
  `password` varchar(64) DEFAULT NULL COMMENT '登录密码',
  `sex` varchar(32) DEFAULT NULL COMMENT '性别',
  `birthdate` datetime DEFAULT NULL COMMENT '出生日期',
  `address` varchar(250) DEFAULT NULL COMMENT '详细地址',
  `email` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `state` varchar(32) DEFAULT NULL COMMENT '-1:表示删除 ，1：正常状态',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('00000001', '测试数据01', '0101', '男', '2020-11-16 17:48:32', '江西吉安', '80504767@qq.com', '1', '2020-11-20 17:48:54', '2020-11-28 17:48:58');
INSERT INTO `user` VALUES ('00000002', '测试数据02', '0201', '男', '2020-11-16 17:48:32', '江西吉安', '80504767@qq.com', '1', '2020-11-20 17:48:54', '2020-11-28 17:48:58');
INSERT INTO `user` VALUES ('00000003', '测试数据03', '0301', '男', '2020-11-16 17:48:32', '江西吉安', '80504767@qq.com', '1', '2020-11-20 17:48:54', '2020-11-28 17:48:58');
INSERT INTO `user` VALUES ('00000004', '测试数据04', '0401', '男', '2020-11-16 17:48:32', '江西吉安', '80504767@qq.com', '1', '2020-11-20 17:48:54', '2020-11-28 17:48:58');
INSERT INTO `user` VALUES ('00000005', '测试数据05', '0501', '男', '2020-11-16 17:48:32', '江西吉安', '80504767@qq.com', '1', '2020-11-20 17:48:54', '2020-11-28 17:48:58');
INSERT INTO `user` VALUES ('00000006', '测试数据06', '0601', '男', '2020-11-16 17:48:32', '江西吉安', '80504767@qq.com', '1', '2020-11-20 17:48:54', '2020-11-28 17:48:58');
INSERT INTO `user` VALUES ('00000007', '测试数据07', '0701', '男', '2020-11-16 17:48:32', '江西吉安', '80504767@qq.com', '1', '2020-11-20 17:48:54', '2020-11-28 17:48:58');
INSERT INTO `user` VALUES ('00000008', '测试数据08', '0801', '男', '2020-11-16 17:48:32', '江西吉安', '80504767@qq.com', '1', '2020-11-20 17:48:54', '2020-11-28 17:48:58');
INSERT INTO `user` VALUES ('00000009', '测试数据09', '0901', '男', '2020-11-16 17:48:32', '江西吉安', '80504767@qq.com', '1', '2020-11-20 17:48:54', '2020-11-28 17:48:58');


