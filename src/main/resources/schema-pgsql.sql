CREATE SEQUENCE person_id_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE person(
  id          NUMERIC DEFAULT nextval('person_id_seq'),
	first_name 	VARCHAR(150),
	last_name 	VARCHAR(150),
	age					INTEGER,
	place				VARCHAR(100)
);

ALTER SEQUENCE person_id_seq OWNED BY person.id;
