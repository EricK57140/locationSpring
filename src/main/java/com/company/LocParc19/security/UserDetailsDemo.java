package com.company.LocParc19.security;

import com.company.LocParc19.dao.GestionnairesDao;
import com.company.LocParc19.model.Utilisateurs;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class UserDetailsDemo implements UserDetails {

        private Utilisateurs utilisateurs;
        private boolean isGestionnaire;
        private GestionnairesDao gestionnairesDao;

        public UserDetailsDemo(Utilisateurs utilisateurs, boolean isGestionnaire){
            this.utilisateurs = utilisateurs;
            this.isGestionnaire = isGestionnaire;

    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        ArrayList<SimpleGrantedAuthority> listeAuthority = new ArrayList<>();
        //si l'utilisateur est gestionnaire, je lui donne les droits d'administrateur
//        Optional<Gestionnaires> admin = gestionnairesDao.findByIdUtilisateurs(utilisateurs.getIdUtilisateurs());

        if(isGestionnaire && utilisateurs.isActif()) {
            listeAuthority.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }
        else {
            listeAuthority.add(new SimpleGrantedAuthority("ROLE_UTILISATEUR"));
        }

        return listeAuthority;
    }

    //récupération de l'utilisateur contenu dans le UserDetailsLocParc
    public Utilisateurs getUtilisateur() {
        return utilisateurs;
    }
    //récupération info si gestionnaire ou non
    public boolean isGestionnaire() {
        return isGestionnaire;
    }
    @Override
    public String getPassword() {
        return utilisateurs.getMotDePasse();
    }

    @Override
    public String getUsername() {
        return utilisateurs.getNom();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return utilisateurs.isActif();
    }
}
