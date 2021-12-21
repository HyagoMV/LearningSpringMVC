CREATE DATABASE 'spring_mvc_db';

USE 'spring_mvc_db';

CREATE USER 'spring_mvc'@'%' IDENTIFIED BY 'pass';

GRANT CREATE,INSERT, SELECT ON spring_mvc_db.* TO 'spring_mvc'@'%';