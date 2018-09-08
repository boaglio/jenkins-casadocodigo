
DROP USER IF EXISTS boaglio;
DROP DATABASE IF EXISTS minhasmoedas_dev;
DROP DATABASE IF EXISTS minhasmoedas_aceite;
DROP DATABASE IF EXISTS minhasmoedas_prod;

create user boaglio;

create database minhasmoedas_dev DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

create database minhasmoedas_aceite DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

create database minhasmoedas_prod DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

use minhasmoedas_dev;

GRANT ALL PRIVILEGES ON *.* TO 'boaglio'@'%' IDENTIFIED BY 'boaglio';
 
DROP TABLE IF EXISTS dolar_day;

CREATE TABLE dolar_day (
  id_dolar_day int(11) NOT NULL AUTO_INCREMENT,
  day date DEFAULT NULL,
  value varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (id_dolar_day),
  UNIQUE KEY day_uk (day)
) ENGINE=InnoDB AUTO_INCREMENT=5845 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

DROP TABLE IF EXISTS dolar_mes;

CREATE TABLE dolar_mes (
  id_dolar_mes int(11) NOT NULL AUTO_INCREMENT,
  day date DEFAULT NULL,
  value varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (id_dolar_mes),
  UNIQUE KEY day_uk (day)
) ENGINE=InnoDB AUTO_INCREMENT=254 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO dolar_day VALUES (1,'1995-01-02','0.844');

INSERT INTO dolar_mes VALUES (1,'1995-01-01','0.8461');

use minhasmoedas_aceite;

GRANT ALL PRIVILEGES ON *.* TO 'boaglio'@'%' IDENTIFIED BY 'boaglio';
 
CREATE TABLE dolar_day (
  id_dolar_day int(11) NOT NULL AUTO_INCREMENT,
  day date DEFAULT NULL,
  value varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (id_dolar_day),
  UNIQUE KEY day_uk (day)
) ENGINE=InnoDB AUTO_INCREMENT=5845 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

DROP TABLE IF EXISTS dolar_mes;

CREATE TABLE dolar_mes (
  id_dolar_mes int(11) NOT NULL AUTO_INCREMENT,
  day date DEFAULT NULL,
  value varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (id_dolar_mes),
  UNIQUE KEY day_uk (day)
) ENGINE=InnoDB AUTO_INCREMENT=254 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO dolar_day VALUES (1,'1995-01-02','0.844');

INSERT INTO dolar_mes VALUES (1,'1995-01-01','0.8461');

use minhasmoedas_prod;

GRANT ALL PRIVILEGES ON *.* TO 'boaglio'@'%' IDENTIFIED BY 'boaglio';
 
CREATE TABLE dolar_day (
  id_dolar_day int(11) NOT NULL AUTO_INCREMENT,
  day date DEFAULT NULL,
  value varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (id_dolar_day),
  UNIQUE KEY day_uk (day)
) ENGINE=InnoDB AUTO_INCREMENT=5845 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

DROP TABLE IF EXISTS dolar_mes;

CREATE TABLE dolar_mes (
  id_dolar_mes int(11) NOT NULL AUTO_INCREMENT,
  day date DEFAULT NULL,
  value varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (id_dolar_mes),
  UNIQUE KEY day_uk (day)
) ENGINE=InnoDB AUTO_INCREMENT=254 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO dolar_day VALUES (1,'1995-01-02','0.844');

INSERT INTO dolar_mes VALUES (1,'1995-01-01','0.8461');

flush privileges;
