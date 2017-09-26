package com.qa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home")
	public String home() {
		
		return "home";
	}
	
<<<<<<< HEAD
=======
	@RequestMapping(value="/cart")
	public String cart() {
		
		return "cart";
	}
	
	
>>>>>>> 5594b584745465bdb72aa488ebd668e33e4400d5
}
