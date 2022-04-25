package com.company.LocParc19.security;

import com.company.LocParc19.dao.UtilisateursDao;
import com.company.LocParc19.model.Utilisateurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceDemo implements UserDetailsService {


    private UtilisateursDao utilisateursDao;

//    @Autowired
//    private JwtUtils jwtUtils;

    @Autowired
    UserDetailsServiceDemo(UtilisateursDao utilisateursDao) {
        this.utilisateursDao = utilisateursDao;

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//        Utilisateurs utilisateur = utilisateursDao
//                .findByNomWithRoles(username)
//                .orElseThrow(() -> new UsernameNotFoundException("Mauvais pseudo/Mot de passe"));
//        UserDetailsDemo userDetailsDemo = new UserDetailsDemo(utilisateur);


//
//        return userDetailsDemo;
//    }
}
