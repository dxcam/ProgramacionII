-- database: ../DataBase/EXOBOT.sqlite
DELETE FROM PersonaTipo;

INSERT INTO PersonaTipo
( Nombre ) VALUES
('Soldado'),
('Mecanico'),
('Experto Ingles'),
('Experto Español');
DELETE FROM Persona;

INSERT INTO Persona
( IdPersonaTipo ,Cedula , Nombre) VALUES
(1,             '321654','Pepe Sancchez'),
(2,             '321234','Ana Sanz'),
(3,             '321423','Pedro Lopez'),
(4,             '321757','Jose Plact');

SELECT * FROM Persona;

UPDATE Persona
SET Nombre = 'Camila Caicedo'
WHERE Cedula = '321234';

SELECT pt.FechaCrea , p.Cedula 
FROM PersonaTipo pt
JOIN Persona p ON pt.IdPersonaTipo= p.IdPersonaTipo;
SELECT * FROM PersonaTipo
--SELECT PersonaTipo.Nombre,Persona.Nombre
--FROM PersonaTipo
--JOIN Persona ON PersonaTipo.IdPersonaTipo=Persona.IdPersonaTipo;