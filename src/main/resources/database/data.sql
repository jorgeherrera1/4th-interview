-- Difficulties
insert into difficulties (val, name, description) values (10, 'Basic', 'Includes questions that even Jr candidates should know');
insert into difficulties (val, name, description) values (20, 'Intermediate', 'Includes questions that require some experience working with the technology');
insert into difficulties (val, name, description) values (30, 'Advanced', 'Includes questions that require expertise from the candidate with the technology');

-- Tags
insert into tags (name, description) values ('Java', 'Java programming language');
insert into tags (name, description) values ('PHP', 'PHP programming language');
insert into tags (name, description) values ('SQL', 'Structured query language');
insert into tags (name, description) values ('PL/SQL', 'Oracle PL/SQL');

-- Questions
insert into questions (question, expected_answer, difficulty) values ('What is the difference between TRUNCATE and DELETE?', 'The DELETE may include a WHERE clause to limit the rows deleted, also the deletion can be rolled back whereas the TRUNCATE will delete all rows with no possibility of rolling back; additionally TRUNCATE will not fire any triggers', 20);
insert into questions (question, expected_answer, difficulty) values ('What is the purpose of the VOLATILE keyword?', 'Every thread accessing a VOLATILE field will read its current value instead of (potentially) using a cached value', 30);
insert into questions (question, expected_answer, difficulty) values ('How do you define a constant in PHP?', 'By using the DEFINE keyword, e.g., define("CONSTANT", "Hello World!");', 10);
insert into questions (question, expected_answer, difficulty) values ('What is the purpose of the PRAGMA AUTONOMOUS_TRANSTACTION clause?', 'A subprogram marked with this pragma can perform DML and commit/rollback without committing/rolling back the data of the calling transaction', 30);

-- Question / Tags
insert into question_tags (question_id, tag_name) values (1, 'SQL');
insert into question_tags (question_id, tag_name) values (2, 'Java');
insert into question_tags (question_id, tag_name) values (3, 'PHP');
insert into question_tags (question_id, tag_name) values (4, 'PL/SQL');

-- Candidates
insert into candidates (name, age) values ('Homer Simpson',33);
insert into candidates (name, age) values ('Superman', 28);
insert into candidates (name, age) values ('Lionel Messi', 25);
insert into candidates (name, age) values ('Sheldon Cooper', 30);