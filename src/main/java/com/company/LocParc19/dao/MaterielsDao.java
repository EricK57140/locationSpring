package com.company.LocParc19.dao;

import com.company.LocParc19.model.Materiels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface MaterielsDao extends JpaRepository<Materiels,Integer> {


    @Query("FROM Materiels ma WHERE ma.modele.marques.idMarque = :idMarque")
    List<Materiels> findMaterielByIdMarque(@Param("idMarque")Integer idMarque);

    @Query("FROM Materiels ma WHERE ma.etatsMateriel.idEtatMateriel = :idEtatMateriel")
    List<Materiels> findMaterielByIdEtatsMateriel(@Param("idEtatMateriel")Integer idEtatMateriel);

    @Query("FROM Materiels ma WHERE ma.modele.categoriesMateriels.idCategorieMateriel = :idCategorieMateriel")
    List<Materiels> findMaterielByIdCategorieMateriel(@Param("idCategorieMateriel")Integer idCategorieMateriel);

    @Query("FROM Materiels ma WHERE ma.localisation.idLocation = :idLocation")
    List<Materiels> findMaterielByIdLocalisation(@Param("idLocation")Integer idLocation);

//    @Query(value = "FROM Materiels m WHERE idMateriel NOT IN " +
//            "(SELECT e.materiel.idMateriel FROM Emprunts e " +
//            "WHERE ((e.dateDebutReservation < :date1 AND e.dateFinReservation > :date2) " +
//            "OR (e.dateDebutReservation > :date1 AND e.dateFinReservation < :date2) " +
//            "OR (e.dateDebutReservation > :date1 AND e.dateDebutReservation < :date2) " +
//            "OR (e.dateFinReservation > :date1 AND e.dateFinReservation < :date2)))")
//
//    List<Materiels> findAllMaterielsByDisponibiliteBeetweenDate1AndDate2(@Param("date1") LocalDate date1, @Param("date2") LocalDate date2);
//




}


