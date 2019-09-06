package test1.AddressBooknew.com.bridgeit.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.fasterxml.jackson.databind.ObjectMapper;

import test1.AddressBooknew.com.bridgeit.model.Person;

public class JacksonClass {
	public static void main(String[] args) {
		try {
			
			FileWriter filewriter=new FileWriter("/home/mobicomp/eclipse-workspace/good.json");
			PrintWriter printwrite=new PrintWriter(filewriter);
			Person p=new Person();
			p.setLastname("Upendra");
			p.setCity("mumbai");
			ObjectMapper mapping = new ObjectMapper();
			mapping.writeValue(printwrite, p);
			printwrite.flush();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	
	}

}
