package com.wipro.example.repo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@GetMapping("/")
	public String home() {
<<<<<<< HEAD
		return "Welcome to  our home";
=======
		return "Welcome to our home";
>>>>>>> c9cd0e6ee5d4aa4205c35900c94402148149183b
	}
}
