DROP TABLE IF EXISTS author;
DROP TABLE IF EXISTS country;
DROP TABLE IF EXISTS post;

CREATE TABLE author
(
  id character(36) NOT NULL PRIMARY KEY,
	name char(100) NOT NULL,
  email char(100) NOT NULL,
  created_date_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE country
(
  id character(36) NOT NULL PRIMARY KEY,
  code integer NOT NULL UNIQUE,
  phone_code character(36) NOT NULL UNIQUE,
	alpha_three char(36) NOT NULL,
  fullname character(36) NOT NULL,
  created_date_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE post
(
  id character(36) NOT NULL PRIMARY KEY,
  author_id character(36) NOT NULL REFERENCES author,
	title char(100) NOT NULL,
  content char(200) NOT NULL,
  created_date_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);