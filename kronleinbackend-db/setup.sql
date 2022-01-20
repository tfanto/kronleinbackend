CREATE DATABASE localdb;
\connect localdb;


CREATE USER databas WITH PASSWORD 'databas'; 
CREATE SCHEMA AUTHORIZATION databas;  
ALTER USER databas SET search_path = databas, public; 
GRANT CONNECT ON DATABASE localdb TO databas;  
GRANT SELECT, INSERT, UPDATE, DELETE ON ALL TABLES IN SCHEMA databas TO databas; 
ALTER SCHEMA databas OWNER TO databas;


CREATE TABLE databas.cust
(
    cust_id integer NOT NULL,
    cust_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT cust_pkey PRIMARY KEY (cust_id)
)

    TABLESPACE pg_default;

ALTER TABLE databas.cust
    OWNER to databas;
-- Index: customer_pk

-- DROP INDEX databas.cust_pk;

CREATE UNIQUE INDEX cust_pk
    ON databas.cust USING btree
        (cust_id ASC NULLS LAST)
    TABLESPACE pg_default;




--  here the db can be created and populated OR do that with liquibase at a later stage


insert into databas.cust (cust_id, cust_name) values (1, 'Forshaga Golv AB');
