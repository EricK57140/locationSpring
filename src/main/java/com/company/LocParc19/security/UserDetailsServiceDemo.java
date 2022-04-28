package com.company.LocParc19.security;

import com.company.LocParc19.dao.UtilisateursDao;
import com.company.LocParc19.model.Utilisateurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDetailsServiceDemo implements UserDetailsService {


    private UtilisateursDao utilisateursDao;

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    UserDetailsServiceDemo(UtilisateursDao utilisateursDao) {
        this.utilisateursDao = utilisateursDao;

    }

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return userDetailsDemo;
//    }

   @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       List<Utilisateurs> utilisateurtest = utilisateursDao
               .findAll();
        
       Utilisateurs utilisateur = utilisateursDao
               .findByNom(username)
               .orElseThrow(() -> new UsernameNotFoundException("Mauvais pseudo/Mot de passe"));

       UserDetailsDemo userDetailsDemo = new UserDetailsDemo(utilisateur);



        return userDetailsDemo;
    }
}
