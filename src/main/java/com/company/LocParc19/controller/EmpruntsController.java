package com.company.LocParc19.controller;

import com.company.LocParc19.dao.EmpruntsDao;
import com.company.LocParc19.dao.UtilisateursDao;
import com.company.LocParc19.model.Emprunts;
import com.company.LocParc19.model.Marques;
import com.company.LocParc19.model.Utilisateurs;
import com.company.LocParc19.security.JwtUtils;
import com.company.LocParc19.security.UserDetailsServiceDemo;
import com.company.LocParc19.view.VueEmprunts;
import com.company.LocParc19.view.VueMarques;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@Getter
@Setter
public class EmpruntsController {

    private EmpruntsDao empruntsDao;

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserDetailsServiceDemo userDetailsServiceDemo;



    @Autowired
    PasswordEncoder encoder;

    @Autowired
    public EmpruntsController(EmpruntsDao empruntsDao) {
        this.empruntsDao = empruntsDao;

    }
    @PostMapping("/demande-emprunt")
    public String demandeEmprunt(@RequestBody Emprunts emprunt) throws Exception{



        empruntsDao.save(emprunt);

        return "emprunt enregistrer";
    }
//    @GetMapping("/materiel-libre/{id}")
//    @JsonView(VueEmprunts.class)
//    public List<Emprunts> emprunts(@PathVariable Integer id) {
//
//
//
//        return this.empruntsDao.findByIdMarque(id);
//
//    }


}