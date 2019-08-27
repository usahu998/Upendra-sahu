package com.brideglabz.functionprogramming;
import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro3_LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter year it is a 4 digit number ");
		int year = ScannerInput.intInput();
		
		if (Utility.leapYear(year))
			System.out.println(year + "is a leap year");
		else
			System.out.println(year + "is a not leap year ");
	}
}
