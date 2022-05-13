package com.company.LocParc19.controller;

import com.company.LocParc19.dao.MaterielsDao;
import com.company.LocParc19.model.Emprunts;
import com.company.LocParc19.model.Materiels;
import com.company.LocParc19.security.JwtUtils;
import com.company.LocParc19.security.UserDetailsServiceDemo;
import com.company.LocParc19.view.VueEmprunts;
import com.company.LocParc19.view.VueMaterielsParMarques;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@Getter
@Setter
public class MaterielsController {

    private MaterielsDao materielsDao;

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserDetailsServiceDemo userDetailsServiceDemo;



    @Autowired
    PasswordEncoder encoder;

    @Autowired
    public MaterielsController(MaterielsDao materielsDao) {
        this.materielsDao = materielsDao;

    }
    @GetMapping("/liste-materiel")
    public List<Materiels> ListeMateriels() {

        return this.materielsDao.findAll();

    }

    @PostMapping("/admin/enregistrement-materiel")
    public String enregistrementMateriel(@RequestBody Materiels materiel) throws Exception{



        materielsDao.save(materiel);

        return "materiel créé";
   }

    @GetMapping("/liste-materiel-par-marque/{idMateriel}")
    @JsonView(VueMaterielsParMarques.class)
   public List<Materiels> ListeMaterielsParMarques(@PathVariable Integer idMateriel) {
        return this.materielsDao.findMaterielByIdMarque(idMateriel);
  }


   @GetMapping("/liste-materiel-par-etats/{idEtatMateriel}")
   @JsonView(VueMaterielsParMarques.class)
   List<Materiels> ListeMaterielsByIdEtatsMateriel(@PathVariable Integer idEtatMateriel) {
       return this.materielsDao.findMaterielByIdEtatsMateriel(idEtatMateriel);
   }

    @GetMapping("/liste-materiel-par-categories/{idCategorieMateriel}")
    @JsonView(VueMaterielsParMarques.class)
    List<Materiels> ListeMaterielsByidCategorieMateriel(@PathVariable Integer idCategorieMateriel) {
        return this.materielsDao.findMaterielByIdCategorieMateriel(idCategorieMateriel);
    }

    @GetMapping("/liste-materiel-par-localisation/{idLocation}")
    @JsonView(VueMaterielsParMarques.class)
    List<Materiels> ListeMaterielsByidLocation(@PathVariable Integer idLocation) {
        return this.materielsDao.findMaterielByIdLocalisation(idLocation);
    }

//    @GetMapping("/materiel-libre/{date1}/{date2}")
//   @JsonView(VueEmprunts.class)
//    public List<Materiels> ListeMaterielsLibre(@PathVariable String date1,@PathVariable String date2) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate debutReservation = LocalDate.parse(date1, formatter);
//        LocalDate dateFin = LocalDate.parse(date2, formatter);
//
//
//        return this.materielsDao.findAllMaterielsByDisponibiliteBeetweenDate1AndDate2(debutReservation,dateFin);
//
//    }

}