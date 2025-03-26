    INSERT INTO POLAZNIK(ime, prezime) VALUES
    ('Ivo', 'Ivić'),
    ('Ana', 'Anić'),
    ('Marko', 'Markić'),
    ('Petra', 'Petrić');


    INSERT INTO PROGRAM_OBRAZOVANJA(naziv, csvet) VALUES
    ('Prvi', 3),
    ('Drugi', 5),
    ('Treći', 2);


    INSERT INTO UPIS(PROGRAM_OBRAZOVANJA_ID, POLAZNIK_ID) VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (1, 4),
    (2, 1);

    insert into USERS(username, password)
    values
        ('user', '$2a$12$h0HcS2QDb/7zPASbLa2GoOTSRP6CWK0oX7pCK.dPjkM6L5N4pNovi'), -- password = user
        ('admin', '$2a$12$INo0nbj40sQrTB7b28KJput/bNltGmFyCfRsUhvy73qcXo5/XdsTG'); -- password = admin (edited)