package com.company.LocParc19.model;

import com.company.LocParc19.view.VueEmprunts;
import com.company.LocParc19.view.VueMarques;
import com.company.LocParc19.view.VueMaterielsParMarques;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Materiels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView({VueMaterielsParMarques.class,VueMarques.class,VueEmprunts.class})
    private Integer idMateriel;
    private int numeroSerie;
    @JsonView({VueMaterielsParMarques.class, VueMarques.class})
    private boolean disponibilite;
    private Date dateEnregistrementMateriel;

    @ManyToOne
    private Gestionnaires gestionnaire;

    @ManyToOne
    @JsonView({VueMaterielsParMarques.class ,VueMarques.class})
    private EtatsMateriel etatsMateriel;

    @ManyToOne
    @JsonView({VueMaterielsParMarques.class ,VueMarques.class})
    private Localisation localisation;
    // déclaration d'une table d'association

    @ManyToOne
//    @JsonView({VueMaterielsParMarques.class,VueMarques.class})
    @JsonView({VueMaterielsParMarques.class,VueEmprunts.class})
    private Modele modele;

    @ManyToMany

    @JoinTable(
            name = "materiel_document",
            joinColumns = @JoinColumn(name = "id_materiel"),
            inverseJoinColumns = @JoinColumn(name = "id_document"))

         private List<Documentations> listeDocument = new ArrayList<>();

    @OneToMany(mappedBy = "materiel")

    private List<Emprunts> listeEmprunts = new ArrayList<>();

}
