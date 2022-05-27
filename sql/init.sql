CREATE SCHEMA 'aqa_it_step_4at';

CREATE TABLE `aqa_it_step_4at`.`employees` (
  `employee_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `office` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`employee_id`));

CREATE TABLE `aqa_it_step_4at`.`userDetails` (
  `id_email` INT NOT NULL,
  `age` INT NOT NULL,
  `db` DATE NOT NULL,
  `phone` INT NOT NULL,
  `post` VARCHAR(45) NULL,
  `employee_id` INT NOT NULL,
  PRIMARY KEY (`id_email`));


