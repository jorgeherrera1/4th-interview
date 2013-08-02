CREATE TABLE skills (
   skill_id    int         NOT NULL AUTO_INCREMENT,
   name        varchar(64) NOT NULL,
   description varchar(512),
   PRIMARY KEY (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;