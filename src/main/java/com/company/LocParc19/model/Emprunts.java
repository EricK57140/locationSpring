package com.company.LocParc19.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Emprunts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmprunt;
    private Date dateDemande;
    private Date debutReservation;
    private Date finTheoriqueReservation;
    private Date validationDemande;
    private Date retraitMateriel;
    private Date retourTheorique;
    private Date retourMateriel;

    @ManyToOne
    private MotifRetour motifRetour;

    @ManyToOne
    private MotifEmprunt motifREmprunt;

    @ManyToOne
    private Gestionnaires gestionnaire;

    @ManyToOne
    private Materiels materiel;

    @ManyToOne
    @JsonIgnore
    private Utilisateurs utilisateur;

}
