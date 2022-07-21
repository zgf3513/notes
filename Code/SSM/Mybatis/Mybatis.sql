drop schema if exists MybatisTest;
create schema MybatisTest;
use MybatisTest;

create table user
(
    id   INT(11) primary key auto_increment,
    name VARCHAR(20),
    pass VARCHAR(20)
) ENGINE = INNODB
  CHAR SET UTF8MB4;

INSERT INTO user
VALUES (1, '张三', '123');
INSERT INTO user
VALUES (2, '李四', '123');
INSERT INTO user
VALUES (3, '王五', '123');

##########################################
drop table if exists teacher;
CREATE TABLE teacher
(
    id   INT(10) NOT NULL,
    name VARCHAR(30) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8;

insert into teacher(id, name) value (1, '秦老师');

drop table if exists student;
CREATE TABLE student
(
    id   INT(10) NOT NULL,
    name VARCHAR(30) DEFAULT NULL,
    tid  INT(10)     DEFAULT NULL,
    PRIMARY KEY (id),
    KEY `fktid` (tid),
    CONSTRAINT `fktid` FOREIGN KEY (tid) REFERENCES teacher (id)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8;

INSERT INTO `student` (`id`, `name`, `tid`)
VALUES (1, '小明', 1);
INSERT INTO `student` (`id`, `name`, `tid`)
VALUES (2, '小红', 1);
INSERT INTO `student` (`id`, `name`, `tid`)
VALUES (3, '小张', 1);
INSERT INTO `student` (`id`, `name`, `tid`)
VALUES (4, '小李', 1);
INSERT INTO `student` (`id`, `name`, `tid`)
VALUES (5, '小王', 1);

############################################
CREATE TABLE `blog`
(
    `id`          VARCHAR(50)  NOT NULL COMMENT '博客id',
    `title`       VARCHAR(100) NOT NULL COMMENT '博客标题',
    `author`      VARCHAR(30)  NOT NULL COMMENT '博客作者',
    `create_time` DATETIME     NOT NULL COMMENT '创建时间',
    `views`       INT(30)      NOT NULL COMMENT '浏览量'
) ENGINE = INNODB
  DEFAULT CHARSET = utf8;