package com.qa.service;

import java.util.ArrayList;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.qa.model.Product;
import com.qa.service.ProductRowMapper;

public class ProductService implements IProductService {
	
	 JdbcTemplate jdbcTemplate;
	 
	 public void setJdbcTemplate(JdbcTemplate template) {
			this.jdbcTemplate = template;
		}

	 public JdbcTemplate getJdbcTemplate() {
		return this.jdbcTemplate;
	 }

	public ArrayList<Product> getAllProducts() {
		// TODO Auto-generated method stub
		
		RowMapper<Product> mapper = new ProductRowMapper();
		String sql = "select * from dbo.Products";
		return (ArrayList<Product>) getJdbcTemplate().query(sql, mapper);
	}

	public Product getAProduct() {
		// TODO Auto-generated method stub
		return null;
	}
		    
	 
	 
	
}
