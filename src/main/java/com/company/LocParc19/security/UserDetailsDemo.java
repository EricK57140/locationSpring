package com.company.LocParc19.security;

import com.company.LocParc19.model.Utilisateurs;

import org.hibernate.Hibernate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class UserDetailsDemo implements UserDetails {

        private Utilisateurs utilisateurs;
    public UserDetailsDemo(Utilisateurs utilisateurs){
        this.utilisateurs = utilisateurs;
    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        ArrayList<SimpleGrantedAuthority> listeAuthority = new ArrayList<>();
//        Hibernate.initialize((utilisateurs.getListeRole()));
//        for (Role role : this.utilisateurs.getListeRole()){
//            listeAuthority.add(new SimpleGrantedAuthority(role.getNom()));
//        }



        return listeAuthority;
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
        return true;
    }
}
