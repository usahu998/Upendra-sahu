package com.bridgelabz.oops.addressbook.main;

import com.bridgelabz.oops.addressbook.service.AddressBookManagement;
import com.bridgelabz.oops.addressbook.service.AddressBookManagementImp;
import com.bridgelabz.utility.ScanInput;


public class AdderssBookApp {

	public static void main(String[] args) throws Exception
	{
		AddressBookManagement addressBook=new AddressBookManagementImp();
		
		System.out.println("========================");
		System.out.println("Press 1 => Add Person");
		System.out.println("Press 2 => Edit Info");
		System.out.println("Press 3 => Delete Person");
		System.out.println("Press 4 => Sort by last name");
		System.out.println("Press 5 => Sort by zip");
		System.out.println("Press 6 => print");
		System.out.println("========================");
		int key;
		key=ScanInput.intInput();
		switch(key)
		{
		case 1:
			System.out.println("Enter first name ");
			String firstName=ScanInput.brstrInput();
			System.out.println("Enter last name");
			String lastName=ScanInput.brstrInput();
			System.out.println("Enter Adderss");
			String address=ScanInput.brstrInput();
			System.out.println("Enter city");
			String city=ScanInput.brstrInput();
			System.out.println("Enter state");
			String state=ScanInput.brstrInput();
			System.out.println("Enter zip code");
			int zip=ScanInput.intInput();
			System.out.println("Enter Phone Number");
			long phoneNumber=ScanInput.longInput();
			addressBook.addPerson(firstName, lastName, address, city, state, zip, phoneNumber);
			break;
		case 2:
			break;
		case 3:
			System.out.println("Enter person name you want to delete");
			String deletePerson;
			deletePerson = ScanInput.brstrInput();
			addressBook.deletePerson(deletePerson);
			
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			System.out.println("Printing the address book list");
			addressBook.fileRead();
			break;
			default:System.out.println("Invalid key");
				break;
		
		}
		
		
	}

}
