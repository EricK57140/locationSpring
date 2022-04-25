package com.company.LocParc19.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Alertes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlerte;
    private Date dateAlerte;

    @ManyToOne
    private Utilisateurs utilisateur;

    @ManyToOne
    private Gestionnaires gestionnaire;


    @ManyToOne
    @JsonIgnore
    private Emprunts emprunt;

}
