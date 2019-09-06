package com.bridgelabz.oops.addressbook.service;

import java.util.List;

import com.bridgelabz.oops.addressbook.model.AddressBook;

public interface AddressBookManagement 
{	public List<AddressBook> fileRead();
	public void addPerson(String FirstName,String lastName,String address,String city,String state,int zip,long phoneNumber);
	public void editInfo();
	public void deletePerson(String firstName);
	public void sortByLastName();
	public void sortByZip();
	public void writeJson();
	public void print();

}
