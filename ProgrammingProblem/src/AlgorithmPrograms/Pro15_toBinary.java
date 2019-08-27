package com.bridgelabz.algorithm;


import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro15_toBinary {

	public static void main(String[] args) 
	{
		System.out.println("Enter any number");
		int n=ScannerInput.intInput();
		String bi=Integer.toBinaryString(n);
	    System.out.println(bi);
	   Utility.isToBinary(bi);
	   
	}
}
