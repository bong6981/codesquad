DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id    int auto_increment primary key,
    email varchar(64) unique not null,
    name  varchar(64),
    nickname varchar(64),
    git_url varchar(64)
);
