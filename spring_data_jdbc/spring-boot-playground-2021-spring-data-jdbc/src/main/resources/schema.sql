DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id    int auto_increment primary key,
    email varchar(64) unique not null,
    name  varchar(64),
    nickname varchar(64),
    git_url varchar(64)
);

DROP TABLE IF EXISTS food;

CREATE TABLE food
(
    name VARCHAR(64),
    cal  int,
    `user` int references user(id),
    user_key VARCHAR(64)
);
