package com.qa.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.qa.model.Product;

public class ProductRowMapper implements  RowMapper<Product> {

	public Product mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		
		Product product = new Product();
		
		product.setName(rs.getString("Name"));
		product.setSize(rs.getString("Size"));
		product.setType(rs.getString("Type"));
		product.setDescription(rs.getString("Description"));
		product.setPrice(rs.getDouble("Price"));
		product.setColour(rs.getString("Colour"));
		product.setImage(rs.getBytes("Image"));
		product.setPromotionalProduct(rs.getBoolean("PromotionalProduct"));

		return product;
	}

}
