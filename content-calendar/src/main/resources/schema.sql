CREATE TABLE IF NOT EXISTS Content (
    id INTEGER AUTO_INCREMENT,
    title varchar(255) NOT NULL,
    desc text,
    status VARCHAR(20) NOT NULL,
    content_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url VARCHAR(255),
    primary key (id)
);

INSERT INTO Content(title,desc,status,content_type,date_created)
VALUES ('First entry to datasource-h2','No more in-memory datasource rather embedded h2 datasource','IDEA','ARTICLE',CURRENT_TIMESTAMP)