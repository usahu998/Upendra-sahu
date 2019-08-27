package com.bridgelabz.algorithm;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro4_5_BubbleSortInteger {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Enter array length");
		int arraySize = ScannerInput.intInput();
		int[] a = new int[arraySize];

		System.out.println("Enter " + arraySize + " element");
		for (int i = 0; i < a.length; i++) {
			a[i] = ScannerInput.intInput();

		}
		Utility.bubbleSort(a);

		long stopTime = System.currentTimeMillis();
		long time = stopTime - startTime;
		System.out.println(" elapsed time performance  " + time);
	}

}
