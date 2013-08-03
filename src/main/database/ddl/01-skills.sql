CREATE TABLE skills (
   skill_id    int         NOT NULL AUTO_INCREMENT,
   name        varchar(64) NOT NULL,
   description varchar(512),
   PRIMARY KEY (skill_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;