package com.company.LocParc19.dao;

import com.company.LocParc19.model.Gestionnaires;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GestionnairesDao extends JpaRepository<Gestionnaires,Integer> {

    @Query("FROM Gestionnaires g WHERE g.idUtilisateurs = :idUtilisateurs")
    Optional<Gestionnaires> findByIdUtilisateurs(@Param("idUtilisateurs") int idUtilisateurs);

    @Query("FROM Gestionnaires g WHERE g.idUtilisateurs = :idUtilisateurs")
    Gestionnaires getByIdUtilisateurs(@Param("idUtilisateur") int idUtilisateurs);
  
}
