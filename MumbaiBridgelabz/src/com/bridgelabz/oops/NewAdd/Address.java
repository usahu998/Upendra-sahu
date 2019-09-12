package com.bridgelabz.oops.AddressBook;

public class Address {

	String city;
	String state;
	double zip;


	public Address() {
		
	}

	public Address(String city, String state, double zip) {
		super();
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getZip() {
		return zip;
	}

	public void setZip(double zip) {
		this.zip = zip;
	}
	
	
	
}
