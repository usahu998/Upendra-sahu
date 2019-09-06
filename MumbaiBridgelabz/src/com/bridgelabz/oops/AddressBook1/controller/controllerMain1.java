package test1.AddressBooknew.com.bridgeit.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.bridgelabz.utility.ScanInput;

import test1.AddressBooknew.com.bridgeit.model.Person;
import test1.AddressBooknew.com.bridgeit.service.AddressBookImp;
import test1.AddressBooknew.com.bridgeit.service.AddressBookManagerImp;
import test1.AddressBooknew.com.bridgeit.service.JsonPerform;



public class controllerMain1 {
	public static void main(String[] args) throws IOException {

		AddressBookManagerImp create = new AddressBookManagerImp();
		JsonPerform perform = new JsonPerform();
		System.out.println("Press the following numbers to perform actions:- ");
		System.out.println(" 1.Create new address book \n 2.Open existing address book \n 3.Quit");
		int i = 0;
		System.out.println("Enter your choice");
		int choice = ScanInput.intInput();
		while (i == 0) {

			switch (choice) {

			case 1: {

				System.out.println("Enter the Adress book name ");
				String name = ScanInput.wordInput();
				if (create.createFile(name) == true) {

					choice = 1;
					System.out.println("file already exist");
					break;

				}
				AddressBookImp book = new AddressBookImp();
				System.out.println("Press the following numbers to perform actions:- ");
				System.out.println(
						" 1.Add person \n 2.Edit person \n 3.remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
				int need = ScanInput.intInput();

				while (need < 7) {

					switch (need) {
					case 1: {

						book.addPerson();
						book.print(book.list);
						System.out.println(
								" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
						need = ScanInput.intInput();
						break;
					}
					case 2: {

						book.print(book.list);
						System.out.println("Enter the person first name to edit");
						String names = ScanInput.strInput();
						book.editPerson(names);
						System.out.println(
								" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
						need = ScanInput.intInput();
						break;
					}
					case 3: {

						System.out.println("Enter the person first name to delete");
						String firstname=ScanInput.strInput();
						book.deletePerson(firstname);
						System.out.println(
								" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
						need = ScanInput.intInput();
						break;

					}
					case 4: {

						ArrayList<Person> nameList = book.sortByLastName(book.list);
						book.print(nameList);
						System.out.println(
								" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
						need = ScanInput.intInput();
						break;
					}
					case 5: {

						ArrayList<Person> zipList = book.sortByZip(book.list);
						book.print(zipList);
						System.out.println(
								" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
						need = ScanInput.intInput();
						break;
					}
					case 6: {

						System.out.println(name);

						perform.writeToFile(name, book.list);
						System.out.println(" 1.Create new address book \n 2.Open existing address book \n 3.Quit");
						choice = ScanInput.intInput();
						need = 7;
						break;
					}

					}
				}
				break;
			}
			case 2: {

				create.readFile();
				System.out.println(" 1.Create new address book \n 2.Open existing address book \n 3.Quit");
				choice = ScanInput.intInput();
				break;

			}
			case 3: {

				System.exit(0);
				break;

			}

			}

		}

}
}
