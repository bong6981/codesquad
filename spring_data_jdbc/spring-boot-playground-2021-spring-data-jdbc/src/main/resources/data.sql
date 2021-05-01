INSERT INTO user(email, `name`, nickname, git_url)
VALUES ('honux@a.com', 'honux','honu_git', 'honu_git@url.com'),
       ('crong@b.io', 'crong', 'crong_git', 'crong_git@url.com'),
       ('k@qqq.com', 'kyu', null, null);

INSERT INTO food(`name`, cal, `user`, user_key)
VALUES ('flower crab', 0, 1, 'abc001'),
       ('sool',2000, 2, 'abc002'),
       ('kangaroo', 600, 3, 'abc003');
