package test1.AddressBooknew.com.bridgeit.service;

import java.util.ArrayList;

import com.bridgelabz.utility.ScanInput;

import test1.AddressBooknew.com.bridgeit.model.Person;


public class AddressBookOpen {
	ArrayList<Person> list=new ArrayList<Person>();
	AddressBookImp book;
	String bookName;
	AddressBookOpen(ArrayList<Person> list,String bookName){
		
		this.list=list;
		this.bookName=bookName;
		book=new AddressBookImp(list);
	}
	
	public void actions(){
		JsonPerform perform = new JsonPerform();
		System.out.println("Press the following numbers to perform actions:- ");
		System.out.println(" 1.Add person \n 2.Edit person \n 3.remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
		int need=ScanInput.intInput();
		

		while(need==1||need==2||need==3||need==4||need==5||need==6){
		
		switch(need){
		case 1:{
			
			book.addPerson();
			book.print(book.list);
			System.out.println(" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
			 need=ScanInput.intInput();
			 break;
		}
		case 2:{
			
			book.print(	book.list);
			System.out.println("Enter the person first name to edit");
			String names=ScanInput.strInput();
			book.editPerson(names);
			System.out.println(" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
			need=ScanInput.intInput();
			break;
		}
		case 3:{
			
			System.out.println("Enter the person first name to delete");
			String names=ScanInput.strInput();
			book.deletePerson(names);
			System.out.println(" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
			need=ScanInput.intInput();
			break;
			
		}
		case 4:{
			
			ArrayList<Person> nameList= book.sortByLastName(book.list);
			book.print(nameList);
			System.out.println(" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
			need=ScanInput.intInput();
			break;
		}
		case 5:{
		
			ArrayList<Person> zipList=book.sortByZip(book.list);
			book.print(zipList);
			System.out.println(" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
			need=ScanInput.intInput();
			break;
		}
		case 6:{
			
			perform.writeToFile(bookName,book.list);
			need=7;
			break;
		}
			
		
		}
		
		
		
	}
	
	
} 
}
