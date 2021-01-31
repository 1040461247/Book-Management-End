# Book-Management-End
图书管理系统后台程序数据库建表语句
```
CREATE TABLE `book`.`Untitled`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `author` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `publish` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pages` int(0) NULL DEFAULT NULL,
  `price` float(10, 2) NULL DEFAULT NULL,
  `bookcaseid` int(0) NULL DEFAULT NULL,
  `abled` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_ieh6qsxp6q7oydadktc9oc8t2`(`bookcaseid`) USING BTREE,
  CONSTRAINT `FK_ieh6qsxp6q7oydadktc9oc8t2` FOREIGN KEY (`bookcaseid`) REFERENCES `book`.`bookcase` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 119 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
```
