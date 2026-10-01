package com.example.FitnessChallengeApp_Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String showAbout(Model model) {

        model.addAttribute("pageTitle", "About FitSquad Hub");

        model.addAttribute("aboutText",
                "FitSquad Hub is a fitness challenge platform that helps users stay active and motivated. "
                + "Users can explore different fitness challenges based on their goals and difficulty level. "
                + "The platform makes fitness more enjoyable by encouraging users to build healthy habits.");

        return "about";
    }
}