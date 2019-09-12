package com.bridgelabz.oops.AddressBook;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.Inventory.OopUtility;
import com.bridgelabz.utility.Utility;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

public class AddressBookImplementation {


	public static void main(String[] args) throws IOException {

		AddressBookDetails a = new AddressBookDetails();
		
		//a.readjson();
		
		boolean flag = true;

		do {
			System.out.println("1. Add");
			System.out.println("2. Edit");
			System.out.println("3. Delete");
			System.out.println("4. SortByName");
			System.out.println("5. SortByzip");
			System.out.println("6. Exit");

			System.out.println("enter your choice ");

			int choice = Utility.integerValue();

			switch (choice) {

			case 1:
				
				
				System.out.println("enter the first name");
				String firstName = Utility.bufferStringValue();

				System.out.println("enter the last name");
				String lastName = Utility.bufferStringValue();

				System.out.println("enter the phone number");
				long phoneNumber = Utility.longValue();

				System.out.println("enter the city");
				String city = Utility.bufferStringValue();

				System.out.println("enter the state");
				String state = Utility.bufferStringValue();

				System.out.println("enter the zip code");
				String zip=Utility.bufferStringValue();
				

				a.add(firstName, lastName, phoneNumber, city, state, zip);
				 
				
			break;
			
			case 2:
				System.out.println("enter the name you want to edit");
				String Name=Utility.bufferStringValue();
				
				a.edit(Name);

					break;
				
			case 3:
				
				System.out.println("enter name to delete");
				String name=Utility.bufferStringValue();
				
				a.delete(name);
				
				break;
					
			case 4:
				
				a.sortbyname();
				
				break;
				
			case 5:
				
				a.sortbyzip();
				
				break;	
				
			case 6:
				flag = false;
				break;

				
			default:
				System.out.println("Enter proper input");
				break;
			}
				
		}
		while(flag);
		
	}



}
