package com.company.LocParc19.dao;


import com.company.LocParc19.model.Modele;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeleDao extends JpaRepository<Modele,Integer> {




}
