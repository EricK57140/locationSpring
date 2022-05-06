package com.company.LocParc19.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// Test server

@RestController
public class AccueilController {

    @GetMapping("/")
    public String hello(){


        return "Serveur Spring OK";
    }

}
