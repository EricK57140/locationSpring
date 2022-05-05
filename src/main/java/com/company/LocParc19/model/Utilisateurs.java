package com.company.LocParc19.model;


import com.company.LocParc19.view.VueGestionnaires;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
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
    @JsonView(VueGestionnaires.class)
    private Integer idUtilisateurs;
    @JsonView(VueGestionnaires.class)
    private String nom;
    @JsonView(VueGestionnaires.class)
    private String prenom;
    @JsonView(VueGestionnaires.class)
    private String adressePostale;
    private String adresseMail;
    private String telephone;

    private String motDePasse;
    private boolean actif;



    @OneToMany(mappedBy = "utilisateur")

    private List<Alertes> listeAlertes = new ArrayList<>();

    @ManyToOne
    @JsonView(VueGestionnaires.class)
    private Gestionnaires gestionnaire;


    public Utilisateurs() {

    }
}
