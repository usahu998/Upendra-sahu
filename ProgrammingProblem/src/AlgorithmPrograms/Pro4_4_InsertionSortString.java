package com.bridgelabz.algorithm;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro4_4_InsertionSortString {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Enter any string");
		String str = ScannerInput.strInput();
		String[] strArray = str.split(" ");
		Utility.isInsertionSortString(strArray);

		long stopTime = System.currentTimeMillis();
		long time = stopTime - startTime;
		System.out.println(" elapsed time performance  " + time);
	}

}
