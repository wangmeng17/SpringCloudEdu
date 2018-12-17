drop table if exists role;
create table role (
 id bigint(20) not null auto_increment,
 name varchar(255) collate utf8_bin not null,
  primary key (id)
);

DROP TABLE IF EXISTS user;
CREATE TABLE user(
  id bigint(20) NOT NULL AUTO_INCREMENT ,
  password varchar(255) COLLATE utf8_bin DEFAULT NULL,
  username varchar(255) COLLATE utf8_bin NOT NULL ,
  PRIMARY KEY (id),
  UNIQUE KEY UK_sb8bbouer5wak8vyiiy4pf2bx (username)
);
DROP TABLE IF EXISTS user_role;
CREATE TABLE user_role(
  user_id bigint(20) NOT NULL ,
  role_id bigint(20) NOT NULL ,
  KEY FKa6819608lfvovjhkek5m97n3y (role_id),
  KEY FK859n2jvi8ivhui0rl0esws6o (user_id),
  CONSTRAINT FK859n2jvi8ivhui0rl0esws6o FOREIGN KEY (user_id ) REFERENCES user (id),
  CONSTRAINT FKa68196081fvovjhkek5m97n3y FOREIGN KEY (role_id) REFERENCES role (id)
);

INSERT INTO user (id, username, password) VALUES (1, 'forezp', '$2a$10$lY6HNOL5e04/jhyvT31wEOQbyXxpujd.UlyxP393ekRt.BYqZkojK');
INSERT INTO user (id, username, password)  VALUES (2, 'admin', '$2a$10$lY6HNOL5e04/jhyvT31wEOQbyXxpujd.UlyxP393ekRt.BYqZkojK');

INSERT INTO role (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO role (id, name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 2);
