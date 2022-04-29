package com.company.LocParc19.model;


import lombok.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter



public class Utilisateurs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Utilisateur")
    private Integer idUtilisateurs;
    private String nom;
    private String prenom;
    private String adressePostale;
    private String adresseMail;
    private String telephone;
    private String motDePasse;
    private boolean actif;



    @OneToMany(mappedBy = "utilisateur")

    private List<Alertes> listeAlertes = new ArrayList<>();

    @ManyToOne
    private Gestionnaires gestionnaire;


    public Utilisateurs() {

    }
}
