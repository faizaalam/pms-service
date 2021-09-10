DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS prescription;

CREATE TABLE users (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  username VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  password VARCHAR(250) DEFAULT NULL
);
-- insert into users(username, email, password) VALUES('user', 'gg', '$2a$10$VcdzH8Q.o4KEo6df.XesdOmXdXQwT5ugNQvu1Pl0390rmfOeA1bhS');


CREATE TABLE roles (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

-- INSERT INTO roles(name) VALUES('ROLE_USER');
-- INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
-- INSERT INTO roles(name) VALUES('ROLE_ADMIN');

DROP TABLE IF EXISTS user_roles;

CREATE TABLE user_roles (
  user_id INT NOT NULL,
  role_id INT NOT NULL
);

-- INSERT INTO user_roles(user_id,role_id) VALUES(1,1);
CREATE TABLE prescription (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  age INT,
  gender VARCHAR(250),
  diagnosis VARCHAR(250),
  prescribed_medicine VARCHAR(250),
  visit_date DATE

);


