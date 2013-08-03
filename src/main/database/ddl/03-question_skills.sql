CREATE TABLE question_skills (
   question_id int NOT NULL,
   skill_id    int NOT NULL,
   
   PRIMARY KEY (question_id, skill_id),
   
   CONSTRAINT question_skills_fk01 FOREIGN KEY (question_id) REFERENCES questions (question_id),
   CONSTRAINT question_skills_fk02 FOREIGN KEY (skill_id)    REFERENCES skills (skill_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;