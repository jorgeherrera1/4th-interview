CREATE TABLE interviews (
   interview_id   int NOT NULL AUTO_INCREMENT,
   candidate_id   int,
   interview_date datetime,
   PRIMARY KEY (interview_id),
   CONSTRAINT interviews_fk02 FOREIGN KEY (candidate_id) REFERENCES candidates (candidate_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;