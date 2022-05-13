package com.company.LocParc19.model;

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
public class Marques {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMarque;
    @JsonView({VueMaterielsParMarques.class,VueMarques.class})

    private String nomMarque;
    private Date dateEnregistrementMarque;


    @ManyToOne
    private Gestionnaires gestionnaire;
    @OneToMany(mappedBy = "marques")
    @JsonView(VueMarques.class)
    private List<Modele> listeModele = new ArrayList<>();
}
