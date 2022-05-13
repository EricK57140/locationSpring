package com.company.LocParc19.model;

import com.company.LocParc19.view.VueMarques;
import com.company.LocParc19.view.VueMaterielsParMarques;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class EtatsMateriel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtatMateriel;
    @JsonView({VueMaterielsParMarques.class, VueMarques.class})
    private String etatMateriel;

//    @OneToMany(mappedBy = "etatsMateriel")
//    @JsonView(VueMarques.class)
//    private List<Materiels> listeMateriels = new ArrayList<>();


}
