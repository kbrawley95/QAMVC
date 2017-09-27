package com.qa.service;

import java.util.ArrayList;

import com.qa.model.Customer;
import com.qa.model.Product;

public interface ICustomerService {
	
	public ArrayList<Customer> getAllCustomers();
	public Customer getACustomer();
	public Customer addACustomer();
	
	

}
