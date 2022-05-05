package com.company.LocParc19.controller;

import com.company.LocParc19.dao.EmpruntsDao;
import com.company.LocParc19.dao.MaterielsDao;
import com.company.LocParc19.dao.ModeleDao;
import com.company.LocParc19.model.Emprunts;
import com.company.LocParc19.model.Materiels;
import com.company.LocParc19.model.Utilisateurs;
import com.company.LocParc19.security.JwtUtils;
import com.company.LocParc19.security.UserDetailsServiceDemo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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




}