package com.qa.service;

import java.util.ArrayList;

import org.springframework.jdbc.core.JdbcTemplate;

import com.qa.model.Customer;

public class CustomerService implements ICustomerService{
	
	 JdbcTemplate jdbcTemplate;
	 
	 public void setJdbcTemplate(JdbcTemplate template) {
			this.jdbcTemplate = template;
		}

	 public JdbcTemplate getJdbcTemplate() {
		return this.jdbcTemplate;
	 }

	public ArrayList<Customer> getAllCustomers() {
		return null;
	}

	public Customer getACustomer() {
		return null;
	}
	
	public Customer addACustomer(){
		return null;
	}


}
