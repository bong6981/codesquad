INSERT INTO user(email, `name`, nickname, git_url, `group_id`)
VALUES ('honux@a.com', 'honux','honu_git', 'honu_git@url.com', 1),
       ('crong@b.io', 'crong', 'crong_git', 'crong_git@url.com', 1),
       ('k@qqq.com', 'kyu', null, null, 3);

INSERT INTO food(`name`, cal, `user`)
VALUES ('flower crab', 0, 1),
       ('sool',2000, 2),
       ('kangaroo', 600, 3);

INSERT INTO `group`(`name`)
VALUES ('game'),
       ('backend'),
       ('frontend');

INSERT INTO project(`name`)
VALUES ('sidedish'),
       ('todo'),
       ('super mario');

INSERT INTO works_on(project_id, `user`, `hour`)
VALUES (1, 1, 1),
       (2, 1, 1),
       (2, 2, 1);
