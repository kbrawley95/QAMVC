package com.qa.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.qa.model.Product;
import com.qa.service.IProductService;

@Controller
public class HomeController {
	
	public static ArrayList<Integer> productIDList = new ArrayList<Integer>();
	
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
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String getProductsInCart(@RequestParam(value="cartButton", required = false) Integer id, HttpServletRequest request, final Model model) {
		
		final Product product;
		
		if(id==null) {
			id = 1;
			product = new Product();
			
		}
		else {
		
			product = productservice.getAProduct(id);
		}
			
		request.setAttribute("product", product);
		return "cart";
	}
	
	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public String sendProductsToCheckout(@RequestParam(value="checkoutButton", required = false) Integer id, HttpServletRequest request, final Model model) {
		
		final Product product;
		if(id==null) {
			id = 1;
			
			product = productservice.getAProduct(id);
			
		}
		else {
		
			product = productservice.getAProduct(id);
		}
			
		request.setAttribute("product", product);

		
		return "checkout";
	}
	
	
	
	@RequestMapping(value="/checkout")
	public String checkout() {
		
		return "checkout";
	}
	
	@RequestMapping(value="/contactus")
	public String contactus() {
		
		return "contactus";
	}
	
	@RequestMapping(value="/aboutus")
	public String aboutus() {
		
		return "aboutus";
	}

	@RequestMapping(value="/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value="/confirmation")
	public String confirmation() {
		
		return "confirmation";
	}
	
	

}
