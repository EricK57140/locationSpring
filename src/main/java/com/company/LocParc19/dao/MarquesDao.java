package com.company.LocParc19.dao;

import com.company.LocParc19.model.Marques;

import com.company.LocParc19.model.Materiels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MarquesDao extends JpaRepository<Marques,Integer> {


}
