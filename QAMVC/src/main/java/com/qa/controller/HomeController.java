package com.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qa.service.IProductService;

@Controller
public class HomeController {
	
	@Autowired
	IProductService productservice;
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String home(ModelMap model) {
		
		model.addAttribute("products", productservice.getAllProducts());
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
