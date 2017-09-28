package com.qa.model;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class Product {

	private int id;
	private String name;
	private String size;
	private String type;
	private String description;
	private double price;
	private String colour;
	private byte[] image;
	
	private boolean isPromotionalProduct;
	private String imageFileName;
	
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
	
	public void convertImage(byte[] image) {
		imageFileName ="C:/Users/Administrator/Documents/GitHub/QAMVC/QAMVC/src/main/webapp/public-resources/imgs/" +name + ".jpg";
		
		InputStream in = new ByteArrayInputStream(image);
		try {
			BufferedImage bufferedImage = ImageIO.read(in);
			ImageIO.write(bufferedImage, "jpg", new File(imageFileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void convertImage(byte[] image, String imageFileName) {
		imageFileName += name + ".jpg";
		
		InputStream in = new ByteArrayInputStream(image);
		try {
			BufferedImage bufferedImage = ImageIO.read(in);
			ImageIO.write(bufferedImage, "jpg", new File(imageFileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void setImage(byte[] image) {
		this.image = image;
		
		convertImage(this.image);
	}
	
	public void setImageAfterInitialAssignment( String imageFileName ) {
		convertImage(getImage(), imageFileName);
	}
	
	public String getImageFileName() {
		return imageFileName;
	}
	
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	
	public byte[] getImage() {
		return image;
	}
	public boolean isPromotionalProduct() {
		return isPromotionalProduct;
	}
	public void setPromotionalProduct(boolean isPromotionalProduct) {
		this.isPromotionalProduct = isPromotionalProduct;
	}
	
	
	
}
