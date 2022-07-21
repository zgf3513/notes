-- phpMyAdmin SQL Dump
-- version 2.9.1.1
-- http://www.phpmyadmin.net
-- 
-- 主机: localhost:3306
-- 生成日期: 2013 年 04 月 08 日 10:34
-- 服务器版本: 5.0.27
-- PHP 版本: 5.2.0
-- 
-- 数据库: `data`
-- 

-- --------------------------------------------------------

-- 
-- 表的结构 `products`
-- 

CREATE TABLE `products` (
  `proID` int(10) NOT NULL auto_increment,
  `proname` varchar(40) default NULL COMMENT '产品名称',
  `proguige` varchar(20) default NULL COMMENT '产品规格',
  `proprice` decimal(19,4) default NULL,
  `proamount` smallint(5) default NULL,
  `proimages` varchar(50) default NULL,
  `proweb` varchar(50) default NULL,
  PRIMARY KEY  (`proID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=78 ;

-- 
-- 导出表中的数据 `products`
-- 

INSERT INTO `products` (`proID`, `proname`, `proguige`, `proprice`, `proamount`, `proimages`, `proweb`) VALUES 
(1, '苹果汁', '每箱24瓶', 18.0000, 39, 'images\\1.bmp', 'http://www.sina.com.cn'),
(2, '牛奶', '每箱24瓶', 19.0000, 17, 'images\\2.bmp', 'http://www.sohu.com'),
(3, '蕃茄酱', '每箱12瓶', 10.0000, 13, 'images\\3.bmp', NULL),
(4, '盐', '每箱12瓶', 22.0000, 53, 'images\\4.bmp', 'http://www.sina.com.cn'),
(5, '麻油', '每箱12瓶', 21.3500, 0, 'images\\5.bmp', 'http://www.sina.com.cn'),
(6, '酱油', '每箱12瓶', 25.0000, 120, 'images\\6.bmp', 'http://www.sohu.com'),
(7, '海鲜粉', '每箱30盒', 30.0000, 15, '', 'http://www.sina.com.cn'),
(8, '胡椒粉', '每箱30盒', 40.0000, 6, 'images\\8.bmp', 'http://www.sina.com.cn'),
(9, '鸡', '每袋500克', 97.0000, 29, 'images\\9.bmp', 'http://www.sina.com.cn'),
(10, '蟹', '每袋500克', 31.0000, 31, 'images\\10.bmp', 'http://www.sina.com.cn'),
(11, '大众奶酪', '每袋6包', 21.0000, 22, '', NULL),
(12, '德国奶酪', '每箱12瓶', 38.0000, 86, 'images\\12.bmp', 'http://www.sina.com.cn'),
(13, '龙虾', '每袋500克', 6.0000, 24, 'images\\13.bmp', 'http://www.sina.com.cn'),
(14, '沙茶', '每箱12瓶', 23.2500, 35, '', 'http://www.sohu.com'),
(15, '味精', '每箱30盒', 15.5000, 39, 'images\\15.bmp', 'http://www.sina.com.cn'),
(16, '饼干', '每箱30盒', 17.4500, 29, 'images\\16.bmp', 'http://www.google.com'),
(17, '猪肉', '每袋500克', 39.0000, 0, 'images\\17.bmp', 'http://www.sina.com.cn'),
(18, '墨鱼', '每袋500克', 62.5000, 42, '', NULL),
(19, '糖果', '每箱30盒', 9.2000, 25, 'images\\19.bmp', 'http://www.sina.com.cn'),
(20, '桂花糕', '每箱30盒', 81.0000, 40, 'images\\20.bmp', 'http://www.sina.com.cn'),
(21, '花生', '每箱30包', 10.0000, 3, 'images\\21.bmp', 'http://www.google.com'),
(22, '糯米', '每袋3公斤', 21.0000, 104, 'images\\22.bmp', 'http://www.sina.com.cn'),
(23, '燕麦', '每袋3公斤', 9.0000, 61, 'images\\23.bmp', NULL),
(24, '汽水', '每箱12瓶', 4.5000, 20, '', 'http://www.sina.com.cn'),
(25, '巧克力', '每箱30盒', 14.0000, 76, 'images\\25.bmp', 'http://www.sina.com.cn'),
(26, '棉花糖', '每箱30盒', 31.2300, 15, 'images\\26.bmp', 'http://www.sina.com.cn'),
(27, '牛肉干', '每箱30包', 43.9000, 49, 'images\\27.bmp', 'http://www.sina.com.cn'),
(28, '烤肉酱', '每箱12瓶', 45.6000, 26, 'images\\28.bmp', NULL),
(29, '鸭肉', '每袋3公斤', 123.7900, 0, '', 'http://www.sina.com.cn'),
(30, '黄鱼', '每袋3公斤', 25.8900, 10, 'images\\30.bmp', 'http://www.sohu.com'),
(31, '温馨奶酪', '每箱12瓶', 12.5000, 0, 'images\\31.bmp', 'http://www.sina.com.cn'),
(32, '白奶酪', '每箱12瓶', 32.0000, 9, 'images\\32.bmp', 'http://www.sina.com.cn'),
(33, '浪花奶酪', '每箱12瓶', 2.5000, 112, '', 'http://www.sina.com.cn'),
(34, '啤酒', '每箱24瓶', 14.0000, 111, 'images\\34.bmp', 'http://www.sohu.com'),
(35, '蜜桃汁', '每箱24瓶', 18.0000, 20, '', 'http://www.sina.com.cn'),
(36, '鱿鱼', '每袋3公斤', 19.0000, 112, 'images\\36.bmp', 'http://www.sina.com.cn'),
(37, '干贝', '每袋3公斤', 26.0000, 11, 'images\\37.bmp', 'http://www.sina.com.cn'),
(38, '绿茶', '每箱24瓶', 263.5000, 17, 'images\\38.bmp', 'http://www.sohu.com'),
(39, '运动饮料', '每箱24瓶', 18.0000, 69, 'images\\39.bmp', 'http://www.sina.com.cn'),
(40, '虾米', '每袋3公斤', 18.4000, 123, 'images\\40.bmp', NULL),
(41, '虾子', '每袋3公斤', 9.6500, 85, 'images\\41.bmp', 'http://www.google.com'),
(42, '糙米', '每袋3公斤', 14.0000, 26, 'images\\42.bmp', 'http://www.sina.com.cn'),
(43, '柳橙汁', '每箱24瓶', 46.0000, 17, 'images\\43.bmp', NULL),
(44, '蚝油', '每箱24瓶', 19.4500, 27, 'images\\44.bmp', 'http://www.sina.com.cn'),
(45, '雪鱼', '每袋3公斤', 9.5000, 5, 'images\\45.bmp', 'http://www.google.com'),
(46, '蚵', '每袋3公斤', 12.0000, 95, 'images\\46.bmp', NULL),
(47, '蛋糕', '每箱24个', 9.5000, 36, '', 'http://www.sina.com.cn'),
(48, '玉米片', '每箱24包', 12.7500, 15, 'images\\48.bmp', 'http://www.chinaren.com.cn'),
(49, '薯条', '每箱24包', 20.0000, 10, 'images\\49.bmp', NULL),
(50, '玉米饼', '每箱24包', 16.2500, 65, '', 'http://www.sina.com.cn'),
(51, '猪肉干', '每箱24包', 53.0000, 20, 'images\\51.bmp', 'http://www.sina.com.cn'),
(52, '三合一麦片', '每箱24包', 7.0000, 38, 'images\\52.bmp', 'http://www.sina.com.cn'),
(53, '盐水鸭', '每袋3公斤', 32.8000, 0, '', 'http://www.sina.com.cn'),
(54, '鸡肉', '每袋3公斤', 7.4500, 21, 'images\\54.bmp', NULL),
(55, '鸭肉', '每袋3公斤', 24.0000, 115, 'images\\55.bmp', 'http://www.google.com'),
(56, '白米', '每袋3公斤', 38.0000, 21, 'images\\56.bmp', 'http://www.sina.com.cn'),
(57, '小米', '每袋3公斤', 19.5000, 36, '', 'http://www.chinaren.com.cn'),
(58, '海参', '每袋3公斤', 13.2500, 62, 'images\\58.bmp', 'http://www.sina.com.cn'),
(59, '光明奶酪', '每箱24瓶', 55.0000, 79, 'images\\59.bmp', NULL),
(60, '花奶酪', '每箱24瓶', 34.0000, 19, 'images\\60.bmp', 'http://www.sina.com.cn'),
(61, '海鲜酱', '每箱24瓶', 28.5000, 113, 'images\\61.bmp', 'http://www.163.com'),
(62, '山渣片', '每箱24包', 49.3000, 17, 'images\\62.bmp', 'http://www.sina.com.cn'),
(63, '甜辣酱', '每箱24瓶', 43.9000, 24, '', 'http://www.163.com'),
(64, '黄豆', '每袋3公斤', 33.2500, 22, 'images\\64.bmp', 'http://www.sina.com.cn'),
(65, '海苔酱', '每箱24瓶', 21.0500, 76, 'images\\65.bmp', 'http://www.sina.com.cn'),
(66, '肉松', '每箱24瓶', 17.0000, 4, 'images\\66.bmp', NULL),
(67, '矿泉水', '每箱24瓶', 14.0000, 52, 'images\\67.bmp', 'http://www.sina.com.cn'),
(68, '绿豆糕', '每箱24包', 12.5000, 6, '', 'http://www.sina.com.cn'),
(69, '黑奶酪', '每盒24个', 36.0000, 26, 'images\\69.bmp', 'http://www.163.com'),
(70, '苏打水', '每箱24瓶', 15.0000, 15, 'images\\70.bmp', 'http://www.google.com'),
(71, '意大利奶酪', '每箱2个', 21.5000, 26, 'images\\71.bmp', 'http://www.sina.com.cn'),
(72, '酸奶酪', '每箱2个', 34.8000, 14, '', 'http://www.chinaren.com.cn'),
(73, '海哲皮', '每袋3公斤', 15.0000, 101, 'images\\73.bmp', NULL),
(74, '鸡精', '每盒24个', 10.0000, 4, 'images\\74.bmp', 'http://www.sina.com.cn'),
(75, '浓缩咖啡', '每箱24瓶', 7.7500, 125, '', 'http://www.chinaren.com.cn'),
(76, '柠檬汁', '每箱24瓶', 18.0000, 57, 'images\\76.bmp', NULL),
(77, '辣椒粉', '每袋3公斤', 13.0000, 32, '', 'http://www.sina.com.cn');

-- --------------------------------------------------------

-- 
-- 表的结构 `user`
-- 

CREATE TABLE `user` (
  `id` int(10) NOT NULL auto_increment,
  `username` varchar(50) default NULL,
  `password` varchar(50) default NULL,
  `sex` varchar(50) default NULL,
  `birthday` datetime default NULL,
  `hobby` varchar(50) default NULL,
  `regdate` date default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- 导出表中的数据 `user`
-- 

