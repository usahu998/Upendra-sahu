package com.bridgelabz.oops.AddressBook;

import java.util.Comparator;

public class Person implements Comparable<Person>, Comparator<Person>{

	String firstName;
	String lastName;
	long phoneNumber;
	String city;
	String state;
	String zip;



	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
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
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int compareTo(Person o) {
		
		return this.getFirstName().compareTo(o.getFirstName());
	}

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getZip().compareTo(o2.getZip());
	}
	
	
	
	
}
