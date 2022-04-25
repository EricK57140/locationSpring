package com.company.LocParc19.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class MotifEmprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idMotifEmprunt;
    private String NomMotifEmprunt;
    private int annee;
    private String mois;

    @ManyToOne
    @JoinColumn(name = "ID_Utilisateur")
    @JsonIgnore
    private Utilisateurs utilisateur;

    @ManyToOne
    private Gestionnaires gestionnaire;
}
