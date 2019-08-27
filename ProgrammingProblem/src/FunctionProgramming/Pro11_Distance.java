package com.brideglabz.functionprogramming;

import com.bridgelabz.utility.ScannerInput;

public class Pro11_Distance {

	public static void main(String[] args) 
	{
			System.out.println("Enter the point X");
			int x=ScannerInput.intInput();
			System.out.println("Enter the point Y");
			int y=ScannerInput.intInput();

			double d = Math.sqrt((x*x) + (y*y));

			System.out.println("Euclidean Distance= " + d);
	}
}
