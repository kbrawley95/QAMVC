package com.qa.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.qa.model.Customer;
import com.qa.model.Product;


public class CustomerRowMapper implements  RowMapper<Product> {

	public Product mapRow(ResultSet rs, int row) throws SQLException {
		
		Customer customer = new Customer();
		customer.setFirstName(rs.getString("FirstName"));
		customer.setSurname(rs.getString("Surname"));
		customer.setAddress(rs.getString("Address"));
		customer.setCity(rs.getString("City"));
		customer.setPostCode(rs.getString("Postcode"));
		return null;
	}
	

}
