package com.bridgelabz.algorithm;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro4_2_BinarySearchString {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Enter any String");
		String s = ScannerInput.strInput();
		System.out.println("Enter search word");
		String w = ScannerInput.strInput();
		String[] str = s.split(" ");

		Utility u = new Utility();
		int ans = u.BinarySearchString(str, w);
		if (ans == -1)
			System.out.println("Word is not present");
		else
			System.out.println(w + " is present in index of " + ans);

		long stopTime = System.currentTimeMillis();
		long time = stopTime - startTime;
		System.out.println(" elapsed time performance  " + time);
	}
}
