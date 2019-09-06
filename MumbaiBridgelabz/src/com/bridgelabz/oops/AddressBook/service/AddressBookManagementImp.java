package com.bridgelabz.oops.addressbook.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.oops.addressbook.model.AddressBook;
import com.google.gson.Gson;

public  class AddressBookManagementImp implements AddressBookManagement
{
	List<AddressBook> addBooks = new ArrayList<>();
	JSONParser parser = new JSONParser();
	JSONObject object = new JSONObject();


	@Override
	public void editInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePerson(String firstName) {
		// TODO Auto-generated method stub
		addBooks.removeIf(addressBook1 -> addressBook1.getFirstName().equals(firstName));
		writeJson();

		
	}

	public void writeJson() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		String json = gson.toJson(addBooks);

		try (FileWriter file = new FileWriter(
				"/home/mobicomp/eclipse-workspace/Bridgelabz/src/com/bridgelabz/oops/addressbook/json/AddressBook.json")) {
			file.write(json);
			System.out.println("written to json");
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("Address Book:" + json);

	}
		
	

	@Override
	public void sortByLastName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByZip() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPerson(String firstName, String lastName, String address, String city, String state, int zip,
			long phoneNumber) {
		try {
			fileRead();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			AddressBook adrsBook= new AddressBook();
			adrsBook.setFirstName(firstName);
			adrsBook.setLastName(lastName);
			adrsBook.setAddress(address);
			adrsBook.setCity(city);
			adrsBook.setState(state);
			adrsBook.setZip(zip);
			adrsBook.setPhoneNumber(phoneNumber);
			addBooks.add(adrsBook);
		
			writeJson();
		
	}

	@Override
	public List<AddressBook> fileRead() {
		// TODO Auto-generated method stub
		JSONArray jsonArray;
		{

			try {
				jsonArray = (JSONArray) parser.parse(new FileReader(
						"/home/mobicomp/eclipse-workspace/Bridgelabz/src/com/bridgelabz/oops/addressbook/json/AddressBook.json"));

				for (Object obj : jsonArray) {
					AddressBook adrsBook= new AddressBook();
					JSONObject jobject = (JSONObject) obj;
					String firstName= (String) jobject.get("firstName");
					adrsBook.setFirstName(firstName);
					String lastName=(String) jobject.get("lastName");
					adrsBook.setLastName(lastName);
					String address=(String) jobject.get("address");
					adrsBook.setAddress(address);
					String city=(String) jobject.get("city");
					adrsBook.setCity(city);
					String state=(String) jobject.get("state");
					adrsBook.setState(state);
					int zip=(int) jobject.get("zip");
					adrsBook.setZip(zip);
					long phoneNumber=(long) jobject.get("phoneNmnber");
					adrsBook.setPhoneNumber(phoneNumber);
					addBooks.add(adrsBook);
					// System.out.println(addBooks.toString());
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		return addBooks;
		
	}
	

}
