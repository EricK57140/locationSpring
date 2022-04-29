package com.company.LocParc19.dao;


import com.company.LocParc19.model.Localisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalistationDao extends JpaRepository<Localisation,Integer> {




}
