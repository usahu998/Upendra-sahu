package com.bridgelabz.algorithm;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro4_3_InsertionSortInteger {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Enter number of element ");
		int num = ScannerInput.intInput();

		int[] intArray = Utility.getIntArray(num);
		Utility.insertionSortInteger(intArray);
		long stopTime = System.currentTimeMillis();
		long time = stopTime - startTime;
		System.out.println(" elapsed time performance  " + time);

	}

}

/*
 static int[] insertionSort(int a[])
 {
 for (int i = 1; i < a.length; i++)
 {
	 int t=a[i];
	 int j=i-1;
	 while(j>=0 && a[j]>t)
	 {
		 a[j+1]=a[j];
		 j--;
	 }
	 a[j+1]=t;
	 
		
	}
	
}
 
 }
 
  */
