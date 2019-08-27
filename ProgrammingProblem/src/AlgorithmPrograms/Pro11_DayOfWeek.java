package com.bridgelabz.algorithm;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro11_DayOfWeek {

	public static void main(String[] args) {

		System.out.println("Enter date format (dd mm yyyy)");
		int dd = ScannerInput.intInput();
		int mm = ScannerInput.intInput();
		int yyyy = ScannerInput.intInput();

		String dayName = Utility.isDayofWeek(dd, mm, yyyy);
		System.out.println(dayName);

	}

}
