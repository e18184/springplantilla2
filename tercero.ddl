DROP TABLE IF EXISTS taller1.Persona CASCADE;
CREATE TABLE taller1.Persona (
  Ru     varchar(255) NOT NULL, 
  Nombre varchar(255), 
  Ap     varchar(255), 
  Am     varchar(255), 
  Edad   int4 NOT NULL, 
  PRIMARY KEY (Ru));
