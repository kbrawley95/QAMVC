package com.qa.model;

public class Product {

	String name;
	String size;
	String type;
	String description;
	double price;
	String colour;
	boolean isPromotionalProduct;
	
	public Product() {
		
	}
	
	public Product(String name, String size, String type, String description, double price, String colour,
			boolean isPromotionalProduct) {
		super();
		this.name = name;
		this.size = size;
		this.type = type;
		this.description = description;
		this.price = price;
		this.colour = colour;
		this.isPromotionalProduct = isPromotionalProduct;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isPromotionalProduct() {
		return isPromotionalProduct;
	}
	public void setPromotionalProduct(boolean isPromotionalProduct) {
		this.isPromotionalProduct = isPromotionalProduct;
	}
	
	
	
}
