package com.company.LocParc19.model;

import com.company.LocParc19.view.VueEmprunts;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Emprunts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmprunt;
    private LocalDate dateDemande;

    private LocalDate dateDebutReservation;
    private LocalDate dateFinReservation ;
    private LocalDate validationDemande;
    private LocalDate retraitMateriel;
    private LocalDate retourTheorique;
    private LocalDate retourMateriel;

    @ManyToOne
    private MotifRetour motifRetour;

    @ManyToOne
    private MotifEmprunt motifREmprunt;

    @ManyToOne
    private Gestionnaires gestionnaire;

    @ManyToOne
    @JsonView(VueEmprunts.class)
    private Materiels materiel;

    @ManyToOne
    private Utilisateurs utilisateur;

}
