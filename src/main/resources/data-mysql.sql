
INSERT INTO utilisateurs (ID_Utilisateur,nom,prenom,motDePasse,actif,adressePostale) VALUES
(1,"Keibler","Eric","Jesus",1,"32 rue"),
(2,"Codinera","Sarah","Jesus",1,"32 rue"),
(3,"Codi","J","$2a$10$4eXlZXJqIdn/3XuypiVKje4U/V5m8DN.FBefKZdDob6IhqeCOoXb6",1,"32 rue"),
(4,"Tom","S","$2a$10$IkcSz.JoAnsC9Hp9Sh7B/evGp4Yn1b7vEkwm8sU5lrZ95c7kkx.4e",1,"32 rue"),
(5,"moi","S","$2a$10$ig0KvwIzVKWWU5.pvqQ9bOqQAen/Wu3Fx21d/81TK5IDvUHgZxaBe",1,"32 rue"),
  (6,"Munoz","Dolan","$2a$10$ig0KvwIzVKWWU5.pvqQ9bOqQAen/Wu3Fx21d/81TK5IDvUHgZxaBe",1,"Ap #833-7095 Arcu Avenue"),
  (7,"Ramsey","Nomlanga","$2a$10$ig0KvwIzVKWWU5.pvqQ9bOqQAen/Wu3Fx21d/81TK5IDvUHgZxaBe",1,"996-7107 Nunc Avenue"),
  (8,"Velazquez","Tatum","$2a$10$ig0KvwIzVKWWU5.pvqQ9bOqQAen/Wu3Fx21d/81TK5IDvUHgZxaBe",1,"Ap #257-6520 Pharetra Road"),
  (9,"Irwin","Dorian","$2a$10$ig0KvwIzVKWWU5.pvqQ9bOqQAen/Wu3Fx21d/81TK5IDvUHgZxaBe",1,"Ap #889-8622 Eget, Ave"),
  (10,"Hyde","Mercedes","$2a$10$ig0KvwIzVKWWU5.pvqQ9bOqQAen/Wu3Fx21d/81TK5IDvUHgZxaBe",1,"Ap #664-7228 Vitae, Av.");

INSERT INTO marques (idMarque,nomMarque) VALUES
(1,"DELL"),
(2,"BIC"),
(3,"Logitech");
Insert into gestionnaires (ID_Utilisateur,IdGestionnaire) values
(5,1),
(6,2);
Insert into etatsmateriel(idEtatMateriel,etatMateriel) values
(1, "bon"),
(2, "En réparation");


Insert into emprunts (idEmprunt,dateDemande,dateDebutReservation,dateFinReservation,materiel_idMateriel) values
(1, "2022-04-05",null,null,null),
(2, "2022-04-05","2022-05-01","2022-05-30",3),
(3, "2022-04-05","2022-05-01","2022-05-30",4),
(4, "2022-04-05","2022-05-01","2022-05-30",5);



INSERT INTO localisation (idLocation,nomLocalisation) values
(1, "Metz Numeric School"),
(2, "IFA");

Insert into materiels (idMateriel,numeroSerie,disponibilite,etatsMateriel_idEtatMateriel,modele_idModele,localisation_idLocation) values
(1, 123, 1,1,1,2),
(2, 1234, 1,2,2,1),
(3, 12328536984, 0,1,1,1),
(4, 1232853698, 1,1,3,1),
(5, 123285369, 1,1,1,2),
(6, 12328536, 1,1,2,1);

INSERT INTO modele (idModele, nomModele,marques_idMarque,categoriesMateriels_idCategorieMateriel) VALUES
(1, "laptopxxx",1,1),
(2, "webcamxxx",2,2),
(3, "souris gamer",2,2);
INSERT INTO categoriesMateriels (idCategorieMateriel, nomCategorieMateriel,caracteristiques) VALUES
(1, "laptop", "SSD 512"),
(2, "webcam","Full HD"),
(3, "souris","sans fil");

INSERT INTO documentations (idDoc,nomDocument) values
(1, "photo laptopxxx"),
(2, "notice laptopxxx");

INSERT INTO materiel_document (id_materiel,id_document) values
(1, 1),
(1, 2);

