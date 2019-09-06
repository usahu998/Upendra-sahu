package test1.AddressBooknew.com.bridgeit.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import test1.AddressBooknew.com.bridgeit.model.Person;


public class JsonPerform {
public void writeToFile(String file,ArrayList<Person> list ){
		
		try {
			
			FileWriter filewriter=new FileWriter("/home/mobicomp/eclipse-workspace/"+file+".json");
			PrintWriter printwrite=new PrintWriter(filewriter);
			ObjectMapper mapping = new ObjectMapper();
			mapping.writeValue(printwrite, list);
			printwrite.flush();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
}
}
