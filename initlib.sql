CREATE DATABASE IF NOT EXISTS homelib
    COLLATE utf8_general_ci;
CREATE DATABASE IF NOT EXISTS test
    COLLATE utf8_general_ci;

USE homelib;

DROP TABLE IF EXISTS book;

CREATE TABLE book
(
    id       BIGINT(20)  NOT NULL AUTO_INCREMENT,
    name     VARCHAR(50) NULL,
    author   VARCHAR(50) NULL,
    bookType VARCHAR(9)  NULL,
    prodDate date        NULL,
    isUsed   BIT(1)      NULL,
    bookcase  INT(4)      NULL,
    bookshelf INT(4)      NULL,
    rating    DOUBLE      NULL,
    PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;

insert into book(name, author, bookType, prodDate, isUsed,bookcase, bookshelf, rating)
values ('Orion III', 'Mars', 'DETECTIVE', '2995-01-01', true, 2, 617, 1.31),
('Orion I', 'Venus', 'ROMAN', '2995-01-01', true, 2, 617, 1.31);
