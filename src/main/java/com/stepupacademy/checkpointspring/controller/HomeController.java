package com.stepupacademy.checkpointspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String getAccueil() {
		return "home";
	}
}
