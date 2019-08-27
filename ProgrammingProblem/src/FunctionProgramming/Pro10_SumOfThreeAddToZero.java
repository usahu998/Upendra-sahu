package com.brideglabz.functionprogramming;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro10_SumOfThreeAddToZero {

	public static void main(String[] args) {

		System.out.println("Enter Element limit");
		int limit = ScannerInput.intInput();

		int count = Utility.isThreeSumZero(Utility.getIntArray(limit));

		if (count > 0) {
			System.out.println("the no. of such distinct triplepairs are= " + count);
		} else {
			System.out.println(" Not Exist ");
		}
	}
}