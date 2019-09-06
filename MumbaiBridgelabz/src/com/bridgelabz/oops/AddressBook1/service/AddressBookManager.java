package test1.AddressBooknew.com.bridgeit.service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface AddressBookManager {
	void readFile() throws JsonParseException, JsonMappingException, IOException;
	boolean createFile(String file) throws IOException;
}
