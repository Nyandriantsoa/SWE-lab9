package edu.mum.cs.cs425.eregistar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value = {"", "/", "/home", "/eregistar" , "/home/eregistar"})
	public String displayHomePage() {

		return "home/index";
	}

}
