package com.example.FitnessChallengeApp_Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String showAbout(Model model) {
        model.addAttribute("pageTitle", "Welcome to the FitSquad Hub!");
        model.addAttribute("description", "FitSquad Hub brings people together through community workout challenges. Members can choose a fitness quest, track its duration, and work toward earning XP reward points. Challenges range from Beginner to Advanced, so there is something for people with different fitness levels.");
        return "about";
    }
}
