package com.brideglabz.functionprogramming;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro5_HarmonicNumber {
	public static void main(String[] args) 
	{
		System.out.println("Enter any number");
		int num=ScannerInput.intInput();
		
		double sum=Utility.isHarmonicNumber(num);
		if(sum>0)
		System.out.println("The Nth Harmonic Value is = "+ sum);
		else
		System.out.println("Number should be greater than zero");	
	}
	}
	
	


