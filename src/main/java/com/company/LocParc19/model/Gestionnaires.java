package com.company.LocParc19.model;

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


public class Gestionnaires extends Utilisateurs{

//    private int numeroGestionnaire;
@GeneratedValue(strategy = GenerationType.AUTO)
private int IdGestionnaire;

    @OneToMany(mappedBy = "gestionnaire")
    private List<Alertes> listeAlertes = new ArrayList<>();

    @OneToMany(mappedBy = "gestionnaire")
    private List<Utilisateurs> listeUtilisateurs = new ArrayList<>();




}
