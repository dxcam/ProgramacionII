-- database: ../DataBase/EXOBOT.sqlite

DROP TABLE IF EXISTS Persona;
DROP TABLE IF EXISTS ExaBot;
DROP TABLE IF EXISTS Catalogo;
DROP TABLE IF EXISTS CatalogoTipo;
DROP TABLE IF EXISTS IABot;

CREATE TABLE CatalogoTipo(
    IdCatalogoTipo INTEGER PRIMARY KEY AUTOINCREMENT
    ,Nombre        VARCHAR(10) NOT NULL UNIQUE
    ,Descripcion   VARCHAR(90) NOT NULL UNIQUE 
    ,Estado        VARCHAR(1) DEFAULT('A') CHECK (Estado  IN ('A','X'))
    ,FechaCrecion  DATETIME DEFAULT(datatime('now','localtime'))
    ,FechaModifica DATETIME 
);
CREATE TABLE Catalogo(
    IdCatalogo      INTEGER PRIMARY KEY AUTOINCREMENT
    ,IdCatalogoTipo INTEGER NOT NULL REFERENCES CatalogoTipo(IdCatalogoTipo)
    ,Nombre         VARCHAR(10) NOT NULL UNIQUE
    ,Descripcion    VARCHAR(90) NOT NULL UNIQUE 
    ,Estado         VARCHAR(1) DEFAULT('A') CHECK (Estado  IN ('A','X'))
    ,FechaCrecion   DATETIME DEFAULT(datatime('now','localtime'))
    ,FechaModifica  DATETIME 
);
CREATE TABLE IABot (
    IdIABot         INTEGER PRIMARY KEY AUTOINCREMENT
    ,Nombre         TEXT NOT NULL UNIQUE
    ,Observacion    TEXT
    ,Estado         VARCHAR(1) DEFAULT('A') CHECK (Estado  IN ('A','X'))
    ,FechaCrea      DATETIME DEFAULT current_timestamp
);
CREATE TABLE ExaBot (
    IdExaBot        INTEGER PRIMARY KEY AUTOINCREMENT
    ,IdIABot        INTEGER NOT NULL
    ,Nombre         TEXT NOT NULL
    ,Serie          TEXT NOT NULL
    ,CONSTRAINT     fk_IABot FOREIGN KEY (IdIABot) REFERENCES  IABot(IdIABot)
);
--CREATE TABLE PersonaTipo (
--    IdPersonaTipo  INTEGER PRIMARY KEY AUTOINCREMENT
--    ,Nombre         TEXT NOT NULL UNIQUE
--    ,FechaCrea      DATETIME DEFAULT current_timestamp
--);
CREATE TABLE Persona (
    IdPersona               INTEGER PRIMARY KEY AUTOINCREMENT
    ,IdCatalogoTipoPersona  INTEGER NOT NULL REFERENCES Catalogo(IdCatalogo)
    ,IdCatalogoSexo         INTEGER NOT NULL REFERENCES Catalogo(IdCatalogo)
    ,IdCatalogoEstadoCivil  INTEGER NOT NULL REFERENCES Catalogo(IdCatalogo)
    ,Cedula                 VARCHAR(10) NOT NULL 
    ,Nombre                 VARCHAR(50) NOT NULL 
    ,Apellido               VARCHAR(50) NOT NULL 
    ,Estado                 VARCHAR(1) DEFAULT('A') 
    ,FechaCrecion           DATETIME DEFAULT(datatime('now','localtime'))
    ,FechaModifica          DATETIME 
);

SELECT * FROM PersonaTipo;
SELECT count(*) FROM PersonaTipo;