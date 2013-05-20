CREATE TABLE questions (
   question_id     int(11)      NOT NULL AUTO_INCREMENT,
   question        varchar(128) NOT NULL,
   expected_answer longtext,
   difficulty      varchar(12)  NOT NULL,
   PRIMARY KEY (question_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;