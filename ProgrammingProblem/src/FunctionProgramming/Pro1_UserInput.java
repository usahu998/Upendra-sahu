package com.brideglabz.functionprogramming;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro1_UserInput {

	public static void main(String[] args) {
		System.out.println("Enter first name: ");
		String firstName = ScannerInput.strInput();
		System.out.println("Enter last name: ");
		String lastName = ScannerInput.strInput();
		Utility.replaceMsg(firstName, "<<FirstName>>", lastName, "<<LastName>>");
	}
}
