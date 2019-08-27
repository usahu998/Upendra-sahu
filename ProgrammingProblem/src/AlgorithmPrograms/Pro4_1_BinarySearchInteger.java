package com.bridgelabz.algorithm;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro4_1_BinarySearchInteger {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Enter array length");
		int arraySize = ScannerInput.intInput();
		int[] a = new int[arraySize];

		for (int i = 0; i < a.length; i++) {
			a[i] = ScannerInput.intInput();
		}
		System.out.println("Enter key you want to search");
		int key = ScannerInput.intInput();

		int ans = Utility.isBinarySearch(a, key, 0, arraySize);
		if (ans >= 0) {
			System.out.println(key + " is present in index of " + ans);
		} else {
			System.out.println(key + " is not found");
		}
		long stopTime = System.currentTimeMillis();
		long time = stopTime - startTime;
		System.out.println(" elapsed time performance  " + time);
	}
}
