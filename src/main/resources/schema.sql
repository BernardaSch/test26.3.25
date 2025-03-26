CREATE TABLE if not exists USERS (
    id  IDENTITY(1,1) PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE if not exists POLAZNIK (
    id  IDENTITY(1,1) PRIMARY KEY,
    ime VARCHAR(50) NOT NULL,
    prezime VARCHAR(50) NOT NULL
);

CREATE TABLE if not exists PROGRAM_OBRAZOVANJA (
    id  IDENTITY(1,1) PRIMARY KEY,
    naziv VARCHAR(100) NOT NULL,
    csvet INT NOT NULL
);

CREATE TABLE IF NOT EXISTS UPIS (
    id INT IDENTITY(1,1) PRIMARY KEY,
    polaznik_id INT NOT NULL,
    program_obrazovanja_id INT NOT NULL,
    CONSTRAINT FK_upis_polaznik FOREIGN KEY (polaznik_id) REFERENCES POLAZNIK(id),
    CONSTRAINT FK_upis_programObrazovanja FOREIGN KEY (program_obrazovanja_id) REFERENCES PROGRAM_OBRAZOVANJA(id)
);

