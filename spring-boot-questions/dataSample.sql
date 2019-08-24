CREATE TABLE `test` (
  `test_id` INT(11) NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(255) NOT NULL,
  `a` VARCHAR(45) NOT NULL,
  `b` VARCHAR(45) NOT NULL,
  `c` VARCHAR(45) NOT NULL,
  `d` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`test_id`));

INSERT INTO `test` (`test_id`, `description`, `a`, `b`, `c`, `d`) VALUES ('1', 'question1', 'A1', 'B1', 'C1', 'D1');
INSERT INTO `test` (`test_id`, `description`, `a`, `b`, `c`, `d`) VALUES ('2', 'question1', 'A2', 'B2', 'C2', 'D2');
INSERT INTO `test` (`test_id`, `description`, `a`, `b`, `c`, `d`) VALUES ('3', 'question1', 'A3', 'B3', 'C3', 'D3');

