INSERT INTO type_cours(nom) VALUES
                               ("Mathematique"),
                               ("SVT"),
                               ("Physique Chimie"),
                               ("Anglais"),
                               ("Francais"),
                               ("Geographie"),
                               ("Informatique"),
                               ("SVT"),
                               ("Histoire");

INSERT INTO cours(nom, type_cours_id) VALUES
("Cours de Math",1),
("Cours d'anglais",4);

INSERT INTO utilisateur(email, mot_de_passe, admin) VALUES
                                                    ("a@a","$2a$10$VkDtjvpKEJc6WCgtCDsCCuv1hFZHdEqoFTeWGTIq6MA9b/IIDKa4y", 1),
                                                    ("b@b","$2a$10$VkDtjvpKEJc6WCgtCDsCCuv1hFZHdEqoFTeWGTIq6MA9b/IIDKa4y", 1);

INSERT INTO cours_utilisateur(utilisateur_id,cours_id) VALUES (1,1),(1,2),(2,2);



