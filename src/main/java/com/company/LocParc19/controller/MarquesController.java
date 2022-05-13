package com.company.LocParc19.controller;


import com.company.LocParc19.dao.MarquesDao;
import com.company.LocParc19.dao.MaterielsDao;
import com.company.LocParc19.model.Marques;
import com.company.LocParc19.model.Materiels;
import com.company.LocParc19.view.VueMarques;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class MarquesController {

    private MarquesDao marquesDao;
    private MaterielsDao materielsDao;

    @Autowired
    public MarquesController(MarquesDao marquesDao) {
        this.marquesDao = marquesDao;


    }
    //
    @GetMapping("/admin/Liste-marque")
    @JsonView(VueMarques.class)
    public List<Marques> ListeMarque() {

        return this.marquesDao.findAll();

    }





    @GetMapping("/marque/{id}")
    @JsonView(VueMarques.class)
    public Marques marques(@PathVariable Integer id) {



        return this.marquesDao.findById(id).orElse(null);

    }

    @PostMapping("/admin/marque")
    public String createMarque(@RequestBody Marques marques) {

        this.marquesDao.save(marques);
        System.out.println(marques);
        return "ok";
    }

    @DeleteMapping("/admin/marque/{id}")

    public String deleteMarques(@PathVariable int id) {



        this.marquesDao.deleteById(id);
        return "ok";
    }

}