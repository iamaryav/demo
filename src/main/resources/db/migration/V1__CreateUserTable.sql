CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT,
    username VARCHAR(255),
    password VARCHAR(255),
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    PRIMARY KEY (ID)
);

INSERT INTO users (username, password, firstname, lastname) VALUES ('abc1@test.com', 'test1', 'name1', 'last1');
INSERT INTO users (username, password, firstname, lastname) VALUES ('abc2@test.com', 'test2', 'name2', 'last2');
INSERT INTO users (username, password, firstname, lastname) VALUES ('abc3@test.com', 'test3', 'name3', 'last3');
INSERT INTO users (username, password, firstname, lastname) VALUES ('abc4@test.com', 'test4', 'name4', 'last4');