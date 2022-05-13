package com.company.LocParc19.model;

import com.company.LocParc19.view.VueMarques;
import com.company.LocParc19.view.VueMaterielsParMarques;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Localisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLocation;
    @JsonView({VueMaterielsParMarques.class , VueMarques.class})
    private String nomLocalisation;

    @ManyToOne
    private Gestionnaires gestionnaire;

}
