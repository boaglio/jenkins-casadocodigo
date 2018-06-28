CREATE TABLE dolar_mes (
  id_dolar_mes INT NOT NULL AUTO_INCREMENT,
  day DATE NULL,
  value VARCHAR(45) NULL,
  PRIMARY KEY (id_dolar_mes),
  UNIQUE INDEX day_uk (day))
;
