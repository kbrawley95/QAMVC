package com.qa.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.qa.model.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ProductServiceTest {

	@Autowired
	ProductService productService;
	
	@Before
	public void setUp() throws Exception {
	}

	@Ignore
	public void testSetJdbcTemplate() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testGetJdbcTemplate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllProducts() {
		ArrayList<Product> productsList = new ArrayList<Product>();
		
		Product product = new Product("Star Wars Hat","R2D2 Knitted Hat","One Size","Hat",19.99,"Black",true);
		Product product1 = new Product("Batman T-Shirt","Black Batman T-Shirt","Large","T-Shirt",30.5,"Black",true);
		Product product2 = new Product("Batman Tank Top","RBlack Batman Tank Top","Small","T-Shirt",14.99, "Black",false);
		Product product3 = new Product("IT Poster","Stephen King IT Movie Poster Pennywise","Small","Poster",4.99,"Colour",true);
		Product product4 = new Product("Darth Vadar Signed Helmet", "Darth Vader Signed Helmet", "One Size", "Helmet", 149.00, "Black", true);
		Product product5 = new Product("Swarovski Enchanted Rose Full-Coloured","Swarovski Enchanted Rose Full-Coloured","One Size","Ornament",109.99,"Red",false);
		Product product6 = new Product("Signed Godfather 2 Poster","Al Pacino Signed Godfather 2 Film Poster","One Size","Poster",259.99,"Colour",true);
		Product product7 = new Product("Godfather Cufflinks","Novelty Cufflinks","Accessories","Hat",3.99,"Black",true);
		
		productsList.add(product);
		productsList.add(product1);
		productsList.add(product2);
		productsList.add(product3);
		productsList.add(product4);
		productsList.add(product5);
		productsList.add(product6);
		productsList.add(product7);
		
		assertEquals(productsList.size(), productService.getAllProducts().size());
	}

	@Ignore
	public void testGetAProduct() {
		fail("Not yet implemented");
	}

}
