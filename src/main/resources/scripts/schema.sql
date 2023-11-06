DROP TABLE IF EXISTS magazine;
CREATE TABLE magazine
(
    id bigint NOT NULL AUTO_INCREMENT,
    name varchar(50),
    price int,
    primary key (id)
);
