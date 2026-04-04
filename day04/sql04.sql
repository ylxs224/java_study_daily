/*
SQLyog Community v13.3.1 (64 bit)
MySQL - 8.0.44 : Database - practice_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`practice_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `practice_db`;

/*Table structure for table `order_info` */

DROP TABLE IF EXISTS `order_info`;

CREATE TABLE `order_info` (
  `order_id` int NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `user_id` int NOT NULL COMMENT '关联用户ID',
  `goods_name` varchar(50) NOT NULL COMMENT '商品名称',
  `price` decimal(10,2) NOT NULL COMMENT '商品价格',
  `order_time` datetime NOT NULL COMMENT '下单时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单表';

/*Data for the table `order_info` */

insert  into `order_info`(`order_id`,`user_id`,`goods_name`,`price`,`order_time`) values 
(1,1,'Java编程思想',89.90,'2025-04-01 10:00:00'),
(2,1,'数据结构考研书',59.90,'2025-04-01 14:00:00'),
(3,2,'C语言入门',49.90,'2025-04-01 11:00:00'),
(4,3,'MySQL实战',79.90,'2025-04-01 15:00:00');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `pid` int NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `pname` varchar(50) NOT NULL COMMENT '商品名(非空+唯一)',
  `price` decimal(10,2) DEFAULT '0.00' COMMENT '价格(默认0)',
  `stock` int NOT NULL COMMENT '库存',
  PRIMARY KEY (`pid`),
  UNIQUE KEY `pname` (`pname`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `product` */

insert  into `product`(`pid`,`pname`,`price`,`stock`) values 
(4,'Spring课本',79.90,60),
(5,'Python课本',49.90,120);

/*Table structure for table `test_user` */

DROP TABLE IF EXISTS `test_user`;

CREATE TABLE `test_user` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户ID(主键自增)',
  `username` varchar(30) NOT NULL COMMENT '用户名',
  `age` int DEFAULT NULL COMMENT '年龄',
  `hobby` varchar(50) DEFAULT NULL COMMENT '爱好',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `test_user` */

insert  into `test_user`(`id`,`username`,`age`,`hobby`) values 
(1,'张三',22,'健身'),
(2,'李四',19,'看书'),
(4,'张三',22,'健身'),
(5,'李四',19,'看书'),
(6,'赵六',20,'编程');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
