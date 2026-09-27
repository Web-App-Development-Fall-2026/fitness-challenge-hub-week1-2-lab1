package com.example.FitnessChallengeApp_Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AboutController{

    @GetMapping( "/about")
    public String showAbout(Model model) {
        
        // Pass attributes to Spring Model
        model.addAttribute("about", "About created by Gianni Romano");
        model.addAttribute("pageTitle", "FitSquad Hub - Fitness Challenge Platform");
        
        // Return Thymeleaf template view
        return "about";
    } 
    
}


