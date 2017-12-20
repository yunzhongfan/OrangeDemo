--<ScriptOptions statementTerminator=";"/>

ALTER TABLE `test`.`score` DROP PRIMARY KEY;

ALTER TABLE `test`.`courses` DROP PRIMARY KEY;

ALTER TABLE `test`.`tx` DROP PRIMARY KEY;

ALTER TABLE `test`.`student` DROP PRIMARY KEY;

ALTER TABLE `test`.`user` DROP PRIMARY KEY;

DROP TABLE `test`.`courses`;

DROP TABLE `test`.`tx`;

DROP TABLE `test`.`score`;

DROP TABLE `test`.`user`;

DROP TABLE `test`.`tb`;

DROP TABLE `test`.`student`;

CREATE TABLE `test`.`courses` (
	`courseno` VARCHAR(20) NOT NULL,
	`coursenm` VARCHAR(100) NOT NULL,
	PRIMARY KEY (`courseno`)
) ENGINE=InnoDB;

CREATE TABLE `test`.`tx` (
	`id` INT NOT NULL,
	`c1` CHAR(2),
	`c2` CHAR(2),
	`c3` INT,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB;

CREATE TABLE `test`.`score` (
	`stuid` VARCHAR(16) NOT NULL,
	`courseno` VARCHAR(20) NOT NULL,
	`scores` FLOAT,
	PRIMARY KEY (`stuid`,`courseno`)
) ENGINE=InnoDB;

CREATE TABLE `test`.`user` (
	`id` BIGINT NOT NULL,
	`age` INT NOT NULL,
	`name` VARCHAR(255),
	`pass_word` VARCHAR(255),
	PRIMARY KEY (`id`)
) ENGINE=InnoDB;

CREATE TABLE `test`.`tb` (
	`cname` VARCHAR(10),
	`cource` VARCHAR(10),
	`score` INT
) ENGINE=InnoDB;

CREATE TABLE `test`.`student` (
	`stuid` VARCHAR(16) NOT NULL,
	`stunm` VARCHAR(20) NOT NULL,
	PRIMARY KEY (`stuid`)
) ENGINE=InnoDB;

