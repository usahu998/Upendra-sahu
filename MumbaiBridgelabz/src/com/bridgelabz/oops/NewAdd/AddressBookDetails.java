package com.bridgelabz.oops.AddressBook;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.Basics.Employee;
import com.bridgelabz.utility.Utility;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class AddressBookDetails implements AddressBookInterface {

	List<Person> personInfo = new ArrayList<Person>();

	JSONParser parser = new JSONParser();

	JSONObject object = new JSONObject();

	@Override
	public void add(String firstName, String lastName, long phoneNumber, String city, String state, String zip) {

		/*
		 * try {
		 * 
		 * readjson();
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */
		Person p = new Person();

		p.setFirstName(firstName);
		p.setLastName(lastName);
		p.setCity(city);
		p.setState(state);
		p.setZip(zip);
		p.setPhoneNumber(phoneNumber);

		personInfo.add(p);

		writejson();

	}

	

	@Override
	public void sortbyname() {
		
		
		Collections.sort(personInfo);

		writejson();

	}

	@Override
	public void sortbyzip() {
		
		Collections.sort(personInfo, new Person());
		
		writejson();
		
	}

	public void writejson() {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String json = gson.toJson(personInfo);

		try {

			FileWriter writer = new FileWriter("/home/user/Documents/addressbook.json");

			writer.write(json);

			writer.flush();

		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("written successfully " + json);
	}

	public void readjson() {

		try {

			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("/home/user/Documents/addressbook.json"));

			for (Object object : jsonArray) {

				Person p = new Person();

				JSONObject obj = (JSONObject) object;

				String firstname = (String) obj.get("firstName");
				p.setFirstName(firstname);

				String lastname = (String) obj.get("lastName");
				p.setLastName(lastname);

				long phonenumber = (long) obj.get("phoneNumber");
				p.setPhoneNumber(phonenumber);

				String city = (String) obj.get("city");
				p.setCity(city);

				String state = (String) obj.get("state");
				p.setState(state);

				String zip= (String) obj.get("zip");
				p.setZip(zip);

				personInfo.add(p);

				System.out.println(obj);
				
				

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String name) {

	personInfo.removeIf(person->person.getFirstName().equals(name));
	
	writejson();
		
		
	}

	@Override
	public void edit(String name) {
		
		try {

			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("/home/user/Documents/addressbook.json"));

			for (Object object : jsonArray) {

				Person p = new Person();

				JSONObject obj = (JSONObject) object;

				String firstname = (String) obj.get("firstName");
				
				if(firstname.equals(name))
				{
					
					p.setFirstName(firstname);
					
					delete(firstname);
					
					System.out.println("enter the last name to edit");
					String lname= Utility.bufferStringValue();
					
					String lastname = (String) obj.get("lastName");
					p.setLastName(lname);

					System.out.println("enter the phone Number to edit");
					long number= Utility.longValue();
					
					long phonenumber = (long) obj.get("phoneNumber");
					p.setPhoneNumber(number);

					System.out.println("enter the City to edit");
					String City= Utility.bufferStringValue();
					
					String city = (String) obj.get("city");
					p.setCity(City);

					System.out.println("enter the State to edit");
					String State= Utility.bufferStringValue();
					
					String state = (String) obj.get("state");
					p.setState(State);

					System.out.println("enter the Zip code to edit");
					String Zip= Utility.bufferStringValue();
					
					
					String zip= (String) obj.get("zip");
					p.setZip(Zip);

					personInfo.add(p);

					System.out.println(obj);
					
					//delete(firstname);
					
					writejson();
					
					break;
				}
				
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
