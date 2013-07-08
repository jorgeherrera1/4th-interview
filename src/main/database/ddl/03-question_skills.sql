CREATE TABLE question_skills (
   question_id int         NOT NULL,
   skill_name    varchar(64) NOT NULL,
   
   PRIMARY KEY (question_id, skill_name),
   
   CONSTRAINT question_skills_fk01 FOREIGN KEY (question_id) REFERENCES questions (question_id),
   CONSTRAINT question_skills_fk02 FOREIGN KEY (skill_name)    REFERENCES skills (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;