package com.qa.service;

import java.util.ArrayList;

import com.qa.model.Product;

public interface IProductService {

	public ArrayList<Product> getAllProducts();
	public Product getAProduct(int productID);
	
}
