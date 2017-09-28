package com.qa.model;

public class Product {

	private int id;
	private String name;
	private String size;
	private String type;
	private String description;
	private double price;
	private String colour;
	private boolean isPromotionalProduct;
	
	public Product() {
		
	}
	
	public Product(int id, String name, String size, String type, String description, double price, String colour,
			boolean isPromotionalProduct) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.type = type;
		this.description = description;
		this.price = price;
		this.colour = colour;
		this.isPromotionalProduct = isPromotionalProduct;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
