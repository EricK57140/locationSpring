package com.company.LocParc19.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Modele {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idModele;
    private  String nomModele;

    @ManyToOne
    private CategoriesMateriels categoriesMateriels;

    @ManyToOne
    private Gestionnaires gestionnaire;

    @ManyToOne
    private Marques marques;
}
