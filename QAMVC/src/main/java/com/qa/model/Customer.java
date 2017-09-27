package com.qa.model;

import java.util.Date;

public class Customer {
	
	// attributes
	private String firstName;
	private String surname;
	private String address;
	private String city;
	private String postCode;
	private String phoneNo;
	private String email;
	private String cardName;
	private String cardNumber;
	private int securityNo;
	private Date expiryDate;
	
	// constructor
	public Customer(){
		
	}
	
	// overloaded constructor
	public Customer(String firstName, String surname, String address, String city, String postCode, String phoneNo,
			String email, String cardName, String cardNumber, int securityNo, Date expiryDate) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.address = address;
		this.city = city;
		this.postCode = postCode;
		this.phoneNo = phoneNo;
		this.email = email;
		this.cardName = cardName;
		this.cardNumber = cardNumber;
		this.securityNo = securityNo;
		this.expiryDate = expiryDate;
	}



	// ----------------------------- getters and setters ------------------
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getSecurityNo() {
		return securityNo;
	}
	public void setSecurityNo(int securityNo) {
		this.securityNo = securityNo;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	

}
