package com.qa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping(value="/cart")
	public String cart() {
		
		return "cart";
	}
	
	@RequestMapping(value="/checkout")
	public String checkout() {
		
		return "checkout";
	}
	

}
