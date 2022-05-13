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
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Modele {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idModele;
    @JsonView({VueMaterielsParMarques.class, VueMarques.class,VueEmprunts.class})
    private  String nomModele;

    @ManyToOne
    @JsonView({VueMaterielsParMarques.class,VueEmprunts.class})
    private CategoriesMateriels categoriesMateriels;

    @ManyToOne
    private Gestionnaires gestionnaire;

    @ManyToOne
    @JsonView(VueMaterielsParMarques.class)
    private Marques marques;
    @OneToMany(mappedBy = "modele")
    @JsonView(VueMarques.class)
    private List<Materiels> listeMateriels = new ArrayList<>();
}
