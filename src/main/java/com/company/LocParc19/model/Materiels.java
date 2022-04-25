package com.company.LocParc19.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Materiels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMateriel;
    private int numeroSerie;
    private boolean disponibilite;

    @ManyToOne
    private Gestionnaires gestionnaire;

    @ManyToOne
    private EtatsMateriel etatMateriel;

    @ManyToOne
    private Localisation localisation;

    @ManyToOne
    private Modele modele;

    @ManyToMany

    @JoinTable(
            name = "materiel_document",
            joinColumns = @JoinColumn(name = "id_materiel"),
            inverseJoinColumns = @JoinColumn(name = "id_document"))

         private List<Documentations> listeDocument = new ArrayList<>();



}
