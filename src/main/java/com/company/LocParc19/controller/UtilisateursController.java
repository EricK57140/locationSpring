package com.company.LocParc19.controller;

import com.company.LocParc19.dao.UtilisateursDao;

import com.company.LocParc19.model.Utilisateurs;
import com.company.LocParc19.security.JwtUtils;
import com.company.LocParc19.security.UserDetailsDemo;
import com.company.LocParc19.security.UserDetailsServiceDemo;
import com.company.LocParc19.view.VueGestionnaires;
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
import java.util.Optional;

@CrossOrigin
@RestController
@Getter
@Setter
public class UtilisateursController {

    private UtilisateursDao utilisateursDao;

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired


    UserDetailsServiceDemo userDetailsServiceDemo;



    @Autowired
    PasswordEncoder encoder;

    @Autowired
    public UtilisateursController(UtilisateursDao utilisateursDao) {
        this.utilisateursDao = utilisateursDao;

    }
    @PostMapping("/inscription")
    public String inscription(@RequestBody Utilisateurs utilisateur) throws Exception{

        utilisateur.setMotDePasse(encoder.encode(utilisateur.getMotDePasse()));

        utilisateursDao.save(utilisateur);

        return "utilisateur créé";
    }
    @PostMapping("/connexion")
    public String connexion(@RequestBody Utilisateurs utilisateur) throws Exception {

//       Optional<Utilisateurs> optionalUtilisateur =
//                utilisateursDao.findByNom(utilisateur.getNom());
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            utilisateur.getNom(),
                            utilisateur.getMotDePasse()
                    )
            );
        }catch(BadCredentialsException e){
            throw new Exception(e);
        }

        UserDetails userDetails = userDetailsServiceDemo
                .loadUserByUsername(utilisateur.getNom());
        return jwtUtils.generateToken(userDetails);

    }

    @GetMapping("/admin/liste-utilisateurs")
   @JsonView(VueGestionnaires.class)
    public List<Utilisateurs> listeUtilisateurs(){
        return this.utilisateursDao.findAll();
    }

}