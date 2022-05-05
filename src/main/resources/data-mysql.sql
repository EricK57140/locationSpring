
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
(2,"BIC");
;
Insert into gestionnaires (ID_Utilisateur,IdGestionnaire) values
(5,1),
(6,2);

Insert into emprunts (idEmprunt,dateDemande) values
(1, "2022-04-05");

Insert into materiels (idMateriel,numeroSerie,disponibilite,etatMateriel_idEtatMateriel) values
(1, 123, 1,1),
(2, 1234, 1,1);

Insert into EtatsMateriel(idEtatMateriel,etatMateriel) values
(1, "bon");



