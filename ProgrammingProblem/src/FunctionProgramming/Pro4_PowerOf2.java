package com.brideglabz.functionprogramming;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro4_PowerOf2 {
	public static void main(String[] args)
	{
		System.out.println("Enter any number");
		int num=ScannerInput.intInput();
		System.out.println(Utility.powerOfTwo(num));
	}
}
