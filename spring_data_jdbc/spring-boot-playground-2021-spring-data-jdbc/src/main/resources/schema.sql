DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id    int auto_increment primary key,
    email varchar(64) unique not null,
    name  varchar(64),
    nickname varchar(64),
    git_url varchar(64),
    group_id int references `group`
);

DROP TABLE IF EXISTS food;

CREATE TABLE food
(
    name VARCHAR(64),
    cal  int,
    `user` int references user(id),
    user_key int
);

DROP TABLE IF EXISTS `group`;

CREATE TABLE `group`
(
    id   int auto_increment primary key,
    name VARCHAR(64)
);

DROP TABLE IF EXISTS project;
CREATE TABLE project
(
    id   int auto_increment primary key,
    name VARCHAR(64)
);

DROP TABLE IF EXISTS works_on;
CREATE TABLE works_on
(
    id int primary key auto_increment,
    project_id int references project (id),
    user    int references user (id),
    `hour`       int
);


