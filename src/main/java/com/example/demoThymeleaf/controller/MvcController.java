package com.example.demoThymeleaf.controller;

import com.example.demoThymeleaf.metier.Personne;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MvcController {

    List<Personne> personnes = new ArrayList<>();

    @GetMapping("hello")
    public String getHello(Model model, @RequestParam String prenom){

        model.addAttribute("firstName", prenom);

        return "hello.html";
    }

    @GetMapping("personne")
    public String getPersonne(Model model){

        Personne marie = new Personne("Marie", "Dupont", 16);

        model.addAttribute("personne", marie);

        return "personne.html";
    }

    @GetMapping("personnes")
    public String getPersonnes(Model model){


        //personnes.add(new Personne("Marie", "Dupont", 16));
        //personnes.add(new Personne("Alain", "Delon", 16));
        //personnes.add(new Personne("JC", "Dominguez", 16));

        model.addAttribute("personnes", personnes);

        return "personnes.html";
    }

    @PostMapping("personnes")
    public String addPersonne(Personne personne, Model model){

        personnes.add(personne);

        model.addAttribute("personnes", personnes);
        return "personnes.html";
    }
}
