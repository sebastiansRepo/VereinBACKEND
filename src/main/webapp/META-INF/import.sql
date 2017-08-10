-- Create some Kurs entries
INSERT INTO KURS (ID, NAME) VALUES (1, 'Karate');
INSERT INTO KURS (ID, NAME) VALUES (2, 'Fußball');
INSERT INTO KURS (ID, NAME) VALUES (3, 'Handball');
INSERT INTO KURS (ID, NAME) VALUES (4, 'Tennis');
INSERT INTO KURS (ID, NAME) VALUES (5, 'Tischtennis');
INSERT INTO KURS (ID, NAME) VALUES (6, 'Basketball');
INSERT INTO KURS (ID, NAME) VALUES (7, 'Bogenschießen');
INSERT INTO KURS (ID, NAME) VALUES (8, 'Bowling');
INSERT INTO KURS (ID, NAME) VALUES (9, 'Eishockey');
INSERT INTO KURS (ID, NAME) VALUES (10, 'Federball');
INSERT INTO KURS (ID, NAME) VALUES (11, 'Golf');
INSERT INTO KURS (ID, NAME) VALUES (12, 'Yoga');

-- Create some Login entries
INSERT INTO LOGIN (ID, USERNAME, PASSWORD) VALUES (1, 'root', 'root');
INSERT INTO LOGIN (ID, USERNAME, PASSWORD) VALUES (2, 'Hans', '123456');
INSERT INTO LOGIN (ID, USERNAME, PASSWORD) VALUES (3, 'Dirk', '123456');
INSERT INTO LOGIN (ID, USERNAME, PASSWORD) VALUES (4, 'Dörte', '123456');
INSERT INTO LOGIN (ID, USERNAME, PASSWORD) VALUES (5, 'Siegfried', '123456');
INSERT INTO LOGIN (ID, USERNAME, PASSWORD) VALUES (6, 'Traudel', '123456');
INSERT INTO LOGIN (ID, USERNAME, PASSWORD) VALUES (7, 'Mathilda', '123456');
INSERT INTO LOGIN (ID, USERNAME, PASSWORD) VALUES (8, 'Jonas', '123456');
INSERT INTO LOGIN (ID, USERNAME, PASSWORD) VALUES (9, 'Frida', '123456');
INSERT INTO LOGIN (ID, USERNAME, PASSWORD) VALUES (10, 'Horst', '123456');
INSERT INTO LOGIN (ID, USERNAME, PASSWORD) VALUES (11, 'Dietrich', '123456');

-- Create some Mitglied entries
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (1, '1971-10-31', 'Herborn','MAENNLICH' , 'Müller',  '2022-12-09',  'Lukas');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (2, '1972-05-28', 'Bischoffen','MAENNLICH' , 'Schmitt',  '2022-12-09',  'Franz');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (3, '1972-08-31', 'Mittenaar','MAENNLICH' , 'Schneider',  '2022-12-09',  'Kaspar');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (4, '1973-09-01', 'Fronhausen','WEIBLICH' , 'Fischer',  '2022-12-09',  'Janina');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (5, '1973-12-25', 'Staufenberg','WEIBLICH' , 'Weber',  '2022-12-09',  'Marlene');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (6, '1974-09-14', 'Lollar','MAENNLICH' , 'Meyer',  '2022-12-09',  'Petrus');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (7, '1975-10-14', 'Wettenberg','MAENNLICH' , 'Wagner',  '2022-12-09',  'Roman');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (8, '1976-10-25', 'Rabenau','WEIBLICH' , 'Becker',  '2022-12-09',  'Evelin');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (9, '1977-10-18', 'Solms','WEIBLICH' , 'Schulz',  '2022-12-09',  'Cecilia');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (10, '1978-02-01', 'Wetzlar','WEIBLICH' , 'Hoffmann',  '2022-12-09',  'Sybille');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (11, '1978-04-23', 'Fernwald','MAENNLICH' , 'Schäfer',  '2022-12-09',  'Armin');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (12, '1979-09-28', 'Lich','WEIBLICH' , 'Koch',  '2022-12-09',  'Hannelore');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (13, '1980-10-10', 'Grünberg','WEIBLICH' , 'Bauer',  '2022-12-09',  'Sylvia');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (14, '1984-11-25', 'Wetzlar','MAENNLICH' , 'Richter',  '2022-12-09',  'Dominik');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (15, '1985-10-26', 'Braunfels','MAENNLICH' , 'Klein',  '2022-12-09',  'Heinrich');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (16, '1990-01-20', 'Hüttenberg','MAENNLICH' , 'Wolf',  '2022-12-09',  'Gabriel');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (17, '1986-02-27', 'Münzenberg','MAENNLICH' , 'Schröder',  '2022-12-09',  'Johanna');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (18, '1987-01-25', 'Hungen','MAENNLICH' , 'Neumann',  '2022-12-09',  'Paul');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (19, '1991-04-02', 'Laubach','MAENNLICH' , 'Schwarz',  '2022-12-09',  'Till');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (20, '1991-09-21', 'Eschborn','WEIBLICH' , 'Zimmermann',  '2022-12-09',  'Tatiana');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (21, '1994-03-29', 'Frankfurt','MAENNLICH' , 'Braun',  '2022-12-09',  'Frederik');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (22, '1995-03-26', 'Dietzenbach','MAENNLICH' , 'Krüger',  '2022-12-09',  'Simon');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (23, '1996-01-26', 'Krombach','MAENNLICH' , 'Hofmann',  '2022-12-09',  'Manuela');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (24, '1971-06-28', 'Büdingen','WEIBLICH' , 'Hartmann',  '2022-12-09',  'Isabelle');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (25, '1971-08-09', 'Nidderau','WEIBLICH' , 'Lange',  '2022-12-09',  'Valerie');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (26, '1972-10-25', 'Karben','WEIBLICH' , 'Werner',  '2022-12-09',  'Nadja');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (27, '1973-03-31', 'Friedrichsdorf','MAENNLICH' , 'Schmitz',  '2022-12-09',  'Friedrich');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (28, '1974-07-26', 'Niedernhausen','WEIBLICH' , 'Krause',  '2022-12-09',  'Amanda');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (29, '1974-10-20', 'Rüsselsheim','MAENNLICH' , 'Meier',  '2022-12-09',  'Friedrich');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (30, '1976-02-03', 'Fulda','MAENNLICH' , 'Lehmann',  '2022-12-09',  'Timo');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (31, '1976-04-15', 'Hosenfeld','MAENNLICH' , 'Schmid',  '2022-12-09',  'Niklas');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (32, '1977-01-29', 'Grebenhain','WEIBLICH' , 'Schulze',  '2022-12-09',  'Janine');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (33, '1977-05-31', 'Eichenzell','MAENNLICH' , 'Maier',  '2022-12-09',  'Siegmund');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (34, '1977-10-26', 'Hofbieber','MAENNLICH' , 'Köhler',  '2022-12-09',  'Hannes');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (35, '1979-08-08', 'Schwalmtal','WEIBLICH' , 'Herrmann',  '2022-12-09',  'Anne');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (36, '1980-10-24', 'Lautertal','WEIBLICH' , 'König',  '2022-12-09',  'Anna');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (37, '1982-09-19', 'Herbstein','WEIBLICH' , 'Walter',  '2022-12-09',  'Liselotte');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (38, '1983-03-09', 'Birstein','MAENNLICH' , 'Mayer',  '2022-12-09',  'Elena');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (39, '1984-09-07', 'Marburg','MAENNLICH' , 'Huber',  '2022-12-09',  'Suse');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (40, '1985-04-18', 'Cölbe','WEIBLICH' , 'Kaiser',  '2022-12-09',  'Elke');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (41, '1987-03-20', 'Rauschenberg','MAENNLICH' , 'Fuchs',  '2022-12-09',  'Konstantin');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (42, '1987-06-20', 'Krichhain','MAENNLICH' , 'Scholz',  '2022-12-09',  'Thomas');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (43, '1989-02-02', 'Stadtallendorf','MAENNLICH' , 'Möller',  '2022-12-09',  'Silas');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (44, '1990-02-08', 'Biedenkopf','MAENNLICH' , 'Schubert',  '2022-12-09',  'Herbert');
INSERT INTO MITGLIED (ID, GEBDATUM, GEBORT, GESCHLECHT, NACHNAME, TRITTAUSDATUM, VORNAME) VALUES (45, '1990-07-20', 'Westerwald','WEIBLICH' , 'Roth',  '2022-12-09',  'Mareike');

-- Create some Trainer entries
INSERT INTO TRAINER (ID, GEBDATUM,    GEBORT,   GESCHLECHT,   NACHNAME, TRITTAUSDATUM, VORNAME, LOGIN_ID) VALUES (1, '1996-12-19', 'Marburg','MAENNLICH' , 'rootNachname',  '2022-12-09',  'rootVorname',  1);
INSERT INTO TRAINER (ID, GEBDATUM,    GEBORT,   GESCHLECHT,   NACHNAME, TRITTAUSDATUM, VORNAME, LOGIN_ID) VALUES (2, '1990-09-02', 'Giessen','MAENNLICH' , 'Mueller',  '2019-12-09',  'Hans',  2);
INSERT INTO TRAINER (ID, GEBDATUM,    GEBORT,   GESCHLECHT,   NACHNAME, TRITTAUSDATUM, VORNAME, LOGIN_ID) VALUES (3, '1974-04-13', 'Friedberg','MAENNLICH' , 'Peterson',  '2020-12-09',  'Dirk',  3);
INSERT INTO TRAINER (ID, GEBDATUM,    GEBORT,   GESCHLECHT,   NACHNAME, TRITTAUSDATUM, VORNAME, LOGIN_ID) VALUES (4, '1982-11-21', 'Michelbach','WEIBLICH' , 'Gibson',  '2021-12-09',  'Dörte',  4);
INSERT INTO TRAINER (ID, GEBDATUM,    GEBORT,   GESCHLECHT,   NACHNAME, TRITTAUSDATUM, VORNAME, LOGIN_ID) VALUES (5, '1980-01-27', 'Wehrshausen','MAENNLICH' , 'Bolz',  '2020-12-09',  'Siegfried',  5);
INSERT INTO TRAINER (ID, GEBDATUM,    GEBORT,   GESCHLECHT,   NACHNAME, TRITTAUSDATUM, VORNAME, LOGIN_ID) VALUES (6, '1990-12-16', 'Giessen','WEIBLICH' , 'Hausen',  '2019-12-09',  'Traudel',  6);
INSERT INTO TRAINER (ID, GEBDATUM,    GEBORT,   GESCHLECHT,   NACHNAME, TRITTAUSDATUM, VORNAME, LOGIN_ID) VALUES (7, '1963-08-09', 'Frankfurt','WEIBLICH' , 'Becker',  '2021-12-09',  'Mathilda',  7);
INSERT INTO TRAINER (ID, GEBDATUM,    GEBORT,   GESCHLECHT,   NACHNAME, TRITTAUSDATUM, VORNAME, LOGIN_ID) VALUES (8, '1986-07-18', 'Sterzhausen','WEIBLICH' , 'Mueller',  '2020-12-09',  'Jonas',  8);
INSERT INTO TRAINER (ID, GEBDATUM,    GEBORT,   GESCHLECHT,   NACHNAME, TRITTAUSDATUM, VORNAME, LOGIN_ID) VALUES (9, '1987-10-03', 'Marburg','WEIBLICH' , 'Becker',  '2022-12-09',  'Frida',  9);
INSERT INTO TRAINER (ID, GEBDATUM,    GEBORT,   GESCHLECHT,   NACHNAME, TRITTAUSDATUM, VORNAME, LOGIN_ID) VALUES (10, '1984-10-09', 'Frankfurt','MAENNLICH' , 'Neuhaus',  '2023-12-09',  'Horst',  10);
INSERT INTO TRAINER (ID, GEBDATUM,    GEBORT,   GESCHLECHT,   NACHNAME, TRITTAUSDATUM, VORNAME, LOGIN_ID) VALUES (11, '1979-04-18', 'Giessen','MAENNLICH' , 'Vandersweg',  '2019-12-09',  'Dietrich',  11);


-- Create some Termin entries
--Karate
INSERT INTO TERMIN (ID, DATUM) VALUES (1, '2018-04-07');
INSERT INTO TERMIN (ID, DATUM) VALUES (2, '2017-03-26');
INSERT INTO TERMIN (ID, DATUM) VALUES (3, '2018-09-18');
INSERT INTO TERMIN (ID, DATUM) VALUES (4, '2018-08-09');
INSERT INTO TERMIN (ID, DATUM) VALUES (5, '2018-09-05');
INSERT INTO TERMIN (ID, DATUM) VALUES (6, '2017-11-06');
INSERT INTO TERMIN (ID, DATUM) VALUES (7, '2017-02-03');
INSERT INTO TERMIN (ID, DATUM) VALUES (8, '2017-08-22');
INSERT INTO TERMIN (ID, DATUM) VALUES (9, '2018-04-05');
INSERT INTO TERMIN (ID, DATUM) VALUES (10, '2017-09-10');
--Fußball
INSERT INTO TERMIN (ID, DATUM) VALUES (11, '2018-05-09');
INSERT INTO TERMIN (ID, DATUM) VALUES (12, '2017-10-28');
INSERT INTO TERMIN (ID, DATUM) VALUES (13, '2018-06-06');
INSERT INTO TERMIN (ID, DATUM) VALUES (14, '2018-11-23');
INSERT INTO TERMIN (ID, DATUM) VALUES (15, '2017-06-16');
INSERT INTO TERMIN (ID, DATUM) VALUES (16, '2018-03-15');
INSERT INTO TERMIN (ID, DATUM) VALUES (17, '2017-09-25');
INSERT INTO TERMIN (ID, DATUM) VALUES (18, '2017-01-19');
INSERT INTO TERMIN (ID, DATUM) VALUES (19, '2018-05-17');
INSERT INTO TERMIN (ID, DATUM) VALUES (20, '2018-11-18');
--Handball
INSERT INTO TERMIN (ID, DATUM) VALUES (21, '2017-06-01');
INSERT INTO TERMIN (ID, DATUM) VALUES (22, '2018-03-19');
INSERT INTO TERMIN (ID, DATUM) VALUES (23, '2017-06-21');
INSERT INTO TERMIN (ID, DATUM) VALUES (24, '2018-12-11');
INSERT INTO TERMIN (ID, DATUM) VALUES (25, '2017-04-27');
INSERT INTO TERMIN (ID, DATUM) VALUES (26, '2017-04-24');
INSERT INTO TERMIN (ID, DATUM) VALUES (27, '2018-12-18');
INSERT INTO TERMIN (ID, DATUM) VALUES (28, '2017-04-12');
INSERT INTO TERMIN (ID, DATUM) VALUES (29, '2017-08-06');
INSERT INTO TERMIN (ID, DATUM) VALUES (30, '2017-12-19');
--Tennis
INSERT INTO TERMIN (ID, DATUM) VALUES (31, '2018-05-06');
INSERT INTO TERMIN (ID, DATUM) VALUES (32, '2017-01-17');
INSERT INTO TERMIN (ID, DATUM) VALUES (33, '2018-03-20');
INSERT INTO TERMIN (ID, DATUM) VALUES (34, '2017-07-21');
INSERT INTO TERMIN (ID, DATUM) VALUES (35, '2018-06-02');
INSERT INTO TERMIN (ID, DATUM) VALUES (36, '2018-10-14');
INSERT INTO TERMIN (ID, DATUM) VALUES (37, '2018-07-08');
INSERT INTO TERMIN (ID, DATUM) VALUES (38, '2017-06-16');
INSERT INTO TERMIN (ID, DATUM) VALUES (39, '2017-05-14');
INSERT INTO TERMIN (ID, DATUM) VALUES (40, '2018-10-01');
--Tischtennis
INSERT INTO TERMIN (ID, DATUM) VALUES (41, '2017-11-10');
INSERT INTO TERMIN (ID, DATUM) VALUES (42, '2018-05-17');
INSERT INTO TERMIN (ID, DATUM) VALUES (43, '2018-08-25');
INSERT INTO TERMIN (ID, DATUM) VALUES (44, '2017-05-21');
INSERT INTO TERMIN (ID, DATUM) VALUES (45, '2018-05-25');
INSERT INTO TERMIN (ID, DATUM) VALUES (46, '2018-10-28');
INSERT INTO TERMIN (ID, DATUM) VALUES (47, '2018-02-26');
INSERT INTO TERMIN (ID, DATUM) VALUES (48, '2018-09-09');
INSERT INTO TERMIN (ID, DATUM) VALUES (49, '2017-06-07');
INSERT INTO TERMIN (ID, DATUM) VALUES (50, '2018-09-16');
--Basketball
INSERT INTO TERMIN (ID, DATUM) VALUES (51, '2018-07-22');
INSERT INTO TERMIN (ID, DATUM) VALUES (52, '2017-10-08');
INSERT INTO TERMIN (ID, DATUM) VALUES (53, '2017-04-15');
INSERT INTO TERMIN (ID, DATUM) VALUES (54, '2018-10-02');
INSERT INTO TERMIN (ID, DATUM) VALUES (55, '2018-03-03');
INSERT INTO TERMIN (ID, DATUM) VALUES (56, '2017-09-03');
INSERT INTO TERMIN (ID, DATUM) VALUES (57, '2018-12-22');
INSERT INTO TERMIN (ID, DATUM) VALUES (58, '2018-04-15');
INSERT INTO TERMIN (ID, DATUM) VALUES (59, '2018-04-20');
INSERT INTO TERMIN (ID, DATUM) VALUES (60, '2018-06-09');
--Bogenschießen
INSERT INTO TERMIN (ID, DATUM) VALUES (61, '2017-03-09');
INSERT INTO TERMIN (ID, DATUM) VALUES (62, '2018-02-16');
INSERT INTO TERMIN (ID, DATUM) VALUES (63, '2017-02-26');
INSERT INTO TERMIN (ID, DATUM) VALUES (64, '2018-10-26');
INSERT INTO TERMIN (ID, DATUM) VALUES (65, '2017-06-17');
INSERT INTO TERMIN (ID, DATUM) VALUES (66, '2018-11-03');
INSERT INTO TERMIN (ID, DATUM) VALUES (67, '2018-04-28');
INSERT INTO TERMIN (ID, DATUM) VALUES (68, '2018-01-23');
INSERT INTO TERMIN (ID, DATUM) VALUES (69, '2018-09-12');
INSERT INTO TERMIN (ID, DATUM) VALUES (70, '2018-07-16');
--Bowling
INSERT INTO TERMIN (ID, DATUM) VALUES (71, '2017-06-02');
INSERT INTO TERMIN (ID, DATUM) VALUES (72, '2018-04-13');
INSERT INTO TERMIN (ID, DATUM) VALUES (73, '2018-08-23');
INSERT INTO TERMIN (ID, DATUM) VALUES (74, '2018-03-17');
INSERT INTO TERMIN (ID, DATUM) VALUES (75, '2018-08-27');
INSERT INTO TERMIN (ID, DATUM) VALUES (76, '2017-11-25');
INSERT INTO TERMIN (ID, DATUM) VALUES (77, '2017-09-10');
INSERT INTO TERMIN (ID, DATUM) VALUES (78, '2017-10-25');
INSERT INTO TERMIN (ID, DATUM) VALUES (79, '2017-03-01');
INSERT INTO TERMIN (ID, DATUM) VALUES (80, '2017-04-17');
--Eishockey
INSERT INTO TERMIN (ID, DATUM) VALUES (81, '2017-07-26');
INSERT INTO TERMIN (ID, DATUM) VALUES (82, '2017-09-01');
INSERT INTO TERMIN (ID, DATUM) VALUES (83, '2017-04-07');
INSERT INTO TERMIN (ID, DATUM) VALUES (84, '2017-04-14');
INSERT INTO TERMIN (ID, DATUM) VALUES (85, '2017-03-26');
INSERT INTO TERMIN (ID, DATUM) VALUES (86, '2018-01-23');
INSERT INTO TERMIN (ID, DATUM) VALUES (87, '2017-07-01');
INSERT INTO TERMIN (ID, DATUM) VALUES (88, '2018-09-25');
INSERT INTO TERMIN (ID, DATUM) VALUES (89, '2017-05-11');
INSERT INTO TERMIN (ID, DATUM) VALUES (90, '2018-07-16');
--Federball
INSERT INTO TERMIN (ID, DATUM) VALUES (91, '2017-04-09');
INSERT INTO TERMIN (ID, DATUM) VALUES (92, '2017-01-25');
INSERT INTO TERMIN (ID, DATUM) VALUES (93, '2017-03-03');
INSERT INTO TERMIN (ID, DATUM) VALUES (94, '2017-03-26');
INSERT INTO TERMIN (ID, DATUM) VALUES (95, '2018-09-08');
INSERT INTO TERMIN (ID, DATUM) VALUES (96, '2018-10-15');
INSERT INTO TERMIN (ID, DATUM) VALUES (97, '2018-09-01');
INSERT INTO TERMIN (ID, DATUM) VALUES (98, '2017-08-19');
INSERT INTO TERMIN (ID, DATUM) VALUES (99, '2018-10-25');
INSERT INTO TERMIN (ID, DATUM) VALUES (100, '2017-09-22');
--Golf
INSERT INTO TERMIN (ID, DATUM) VALUES (101, '2017-04-27');
INSERT INTO TERMIN (ID, DATUM) VALUES (102, '2017-05-15');
INSERT INTO TERMIN (ID, DATUM) VALUES (103, '2018-03-28');
INSERT INTO TERMIN (ID, DATUM) VALUES (104, '2018-06-14');
INSERT INTO TERMIN (ID, DATUM) VALUES (105, '2017-05-03');
INSERT INTO TERMIN (ID, DATUM) VALUES (106, '2018-12-06');
INSERT INTO TERMIN (ID, DATUM) VALUES (107, '2018-10-11');
INSERT INTO TERMIN (ID, DATUM) VALUES (108, '2017-06-13');
INSERT INTO TERMIN (ID, DATUM) VALUES (109, '2017-02-10');
INSERT INTO TERMIN (ID, DATUM) VALUES (110, '2017-01-18');
--Yoga
INSERT INTO TERMIN (ID, DATUM) VALUES (111, '2017-09-06');
INSERT INTO TERMIN (ID, DATUM) VALUES (112, '2018-11-02');
INSERT INTO TERMIN (ID, DATUM) VALUES (113, '2017-06-21');
INSERT INTO TERMIN (ID, DATUM) VALUES (114, '2017-01-12');
INSERT INTO TERMIN (ID, DATUM) VALUES (115, '2017-06-19');
INSERT INTO TERMIN (ID, DATUM) VALUES (116, '2018-06-10');
INSERT INTO TERMIN (ID, DATUM) VALUES (117, '2017-09-09');
INSERT INTO TERMIN (ID, DATUM) VALUES (118, '2018-12-12');
INSERT INTO TERMIN (ID, DATUM) VALUES (119, '2018-03-18');
INSERT INTO TERMIN (ID, DATUM) VALUES (120, '2017-02-14');

-- Create some Trainer_Kurs entries
INSERT INTO TRAINER_KURS (TRAINER_ID, KURSE_ID) VALUES (2, 1);
INSERT INTO TRAINER_KURS (TRAINER_ID, KURSE_ID) VALUES (2, 2);
INSERT INTO TRAINER_KURS (TRAINER_ID, KURSE_ID) VALUES (2, 3);
INSERT INTO TRAINER_KURS (TRAINER_ID, KURSE_ID) VALUES (3, 4);
INSERT INTO TRAINER_KURS (TRAINER_ID, KURSE_ID) VALUES (4, 5);
INSERT INTO TRAINER_KURS (TRAINER_ID, KURSE_ID) VALUES (5, 6);
INSERT INTO TRAINER_KURS (TRAINER_ID, KURSE_ID) VALUES (6, 7);
INSERT INTO TRAINER_KURS (TRAINER_ID, KURSE_ID) VALUES (7, 8);
INSERT INTO TRAINER_KURS (TRAINER_ID, KURSE_ID) VALUES (8, 9);
INSERT INTO TRAINER_KURS (TRAINER_ID, KURSE_ID) VALUES (9, 10);
INSERT INTO TRAINER_KURS (TRAINER_ID, KURSE_ID) VALUES (10, 11);
INSERT INTO TRAINER_KURS (TRAINER_ID, KURSE_ID) VALUES (11, 12);


INSERT INTO KURS_TERMIN (KURS_ID, TERMINE_ID) VALUES (1, 2);
INSERT INTO KURS_TERMIN (KURS_ID, TERMINE_ID) VALUES (1, 7);


INSERT INTO KURS_MITGLIED (KURSE_ID, MITGLIEDERANGEMELDET_ID) VALUES (1, 2);

-- Create some Person entries

-- Create some Person_Kurs entries

-- Create some Kurs_Mitglied entries



-- Create some Kurs_Person entries

-- Create some Kurs_Termin entries

-- Create some Termin_Mitglied entries

-- Create some Termin_Person entries

