package com.example.demoThymeleaf.controller;

import com.example.demoThymeleaf.metier.Personne;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MvcController {

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
}
