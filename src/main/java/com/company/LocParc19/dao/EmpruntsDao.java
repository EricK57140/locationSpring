package com.company.LocParc19.dao;

import com.company.LocParc19.model.Emprunts;
import com.company.LocParc19.model.Gestionnaires;
import com.company.LocParc19.model.Marques;
import com.company.LocParc19.model.Materiels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.nio.file.Path;
import java.util.List;

@Repository
public interface EmpruntsDao extends JpaRepository<Emprunts,Integer> {

    @Query("FROM Emprunts e WHERE e.materiel.idMateriel = :idMateriel")
    List<Emprunts> findEmpruntsByIdMarque(@Param("idMateriel")Integer id);

}
