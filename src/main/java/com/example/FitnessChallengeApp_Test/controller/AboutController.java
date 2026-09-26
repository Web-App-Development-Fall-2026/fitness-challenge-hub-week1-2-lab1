package com.example.FitnessChallengeApp_Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;



@Controller
public class AboutController {

	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("pageTitle", "Welcome to the Fitsquad Hub !");
		return "about";
	}
}
