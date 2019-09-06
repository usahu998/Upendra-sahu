package test1.AddressBooknew.com.bridgeit.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.ScanInput;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import test1.AddressBooknew.com.bridgeit.model.Person;

public class AddressBookManagerImp implements AddressBookManager {
	@Override
	public void readFile() throws JsonParseException, JsonMappingException, IOException {
	
	//File file= new File("/home/admin1/eclipse-workspace/ObjectOriented_json/Json");
	//String [] st=file.list();
	//System.out.println(Arrays.toString(st));
	System.out.println("Enter the name of book to open");
	String bookName=ScanInput.strInput();
	ObjectMapper map= new ObjectMapper();
	FileReader file1= new FileReader("/home/mobicomp/eclipse-workspace/"+bookName+".json");
	BufferedReader br = new BufferedReader(file1);
	@SuppressWarnings("unchecked")
	ArrayList<Person> persons= (ArrayList<Person>) map.readValue(br,new TypeReference<List<Person>>(){});
	AddressBookOpen openbook= new AddressBookOpen(persons, bookName);
	openbook.actions();
	
	}

	/* function creates file of the username
	 * @see com.bridgeIt.objectOriented.AddressBook.AddressBookManager#createFile(java.lang.String)
	 */
	@Override
	public boolean createFile(String files)  {
	File file= new File("/home/mobicomp/eclipse-workspace/"+files+".json");
	boolean existence=file.exists();
	if(existence){
		
		return true;
	}
	
		try {
			//System.out.println("in try");
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	//	System.out.println("already exist");
		return false;
	}

	public static void main(String[] args) throws IOException {
		
		AddressBookManagerImp book= new AddressBookManagerImp();
		book.createFile("new");
	}
}
