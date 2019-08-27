package com.bridgelabz.algorithm;


import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro13_MonthlyPayment {

	public static void main(String[] args) 
	{
		System.out.println("Enter principal");
		int p=ScannerInput.intInput();
		System.out.println("Enter Rate");
		double r=ScannerInput.doubleInput();
		System.out.println("Enter year");
		int y=ScannerInput.intInput();
		
		System.out.println("Monthly payment is = " + Utility.isMonthlySalary(p,r,y));
	}
}
