package com.company.LocParc19.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class EtatsMateriel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtatMateriel;
    private String etatMateriel;

}
