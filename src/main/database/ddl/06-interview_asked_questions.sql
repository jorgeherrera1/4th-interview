CREATE TABLE interview_asked_questions (
   interview_id int(11)     NOT NULL,
   question_id  int(11)     NOT NULL,
   grade        varchar(14) NOT NULL,
   comments     longtext,
   
   PRIMARY KEY (interview_id, question_id),
   
   CONSTRAINT interview_asked_questions_fk01 FOREIGN KEY (question_id)  REFERENCES questions (question_id),
   CONSTRAINT interview_asked_questions_fk02 FOREIGN KEY (interview_id) REFERENCES interviews (interview_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;