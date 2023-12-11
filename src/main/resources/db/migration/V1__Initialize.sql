DROP TABLE IF EXISTS country;

CREATE TABLE country
(
  id integer NOT NULL PRIMARY KEY,
  code integer NOT NULL UNIQUE,
	name char(100) NOT NULL,
  created_date_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);