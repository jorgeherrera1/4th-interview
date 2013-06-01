CREATE TABLE tags (
   name        varchar(64) NOT NULL,
   description longtext,
   PRIMARY KEY (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;