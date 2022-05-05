package com.company.LocParc19.dao;

import com.company.LocParc19.model.Emprunts;
import com.company.LocParc19.model.Materiels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielsDao extends JpaRepository<Materiels,Integer> {




}
