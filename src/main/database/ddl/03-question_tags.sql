CREATE TABLE question_tags (
   question_id int         NOT NULL,
   tag_name    varchar(64) NOT NULL,
   
   PRIMARY KEY (question_id, tag_name),
   
   CONSTRAINT question_tags_fk01 FOREIGN KEY (question_id) REFERENCES questions (question_id),
   CONSTRAINT question_tags_fk02 FOREIGN KEY (tag_name)    REFERENCES tags (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;