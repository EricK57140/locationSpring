package com.company.LocParc19.controller;

import com.company.LocParc19.dao.UtilisateursDao;

import com.company.LocParc19.model.Utilisateurs;
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
public class UtilisateursController {

    private UtilisateursDao utilisateursDao;

//    @Autowired
//    JwtUtils jwtUtils;
//
//    @Autowired
//    AuthenticationManager authenticationManager;



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




}