package com.bridgelabz.oops.AddressBook;

public interface AddressBookInterface {

	public void add(String firstName,String lastName, long phoneNumber,String city,String state,String zip);
	public void edit(String name);
	public void delete(String name);
	public void sortbyname();
	public void sortbyzip();
	
	
	
	
}
