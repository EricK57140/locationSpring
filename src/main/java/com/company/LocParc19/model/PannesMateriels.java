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
public class PannesMateriels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPanneMateriel;
    private String typePanneMateriel;
    private String JustificatifPanne;

    @ManyToOne
    private Utilisateurs utilisateur;

    @ManyToOne
    private Materiels materiel;

}
