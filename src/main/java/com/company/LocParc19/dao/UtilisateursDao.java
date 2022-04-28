package com.company.LocParc19.dao;

import com.company.LocParc19.model.Utilisateurs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtilisateursDao extends JpaRepository<Utilisateurs,Integer> {

    Optional<Utilisateurs> findByNom(String nom);

//    @Query("from Utilisateurs u join fetch u.listeRole where u.nom = :nom")
//    Optional<Utilisateurs> findByNomWithRoles(@Param("nom")String nom);

}
