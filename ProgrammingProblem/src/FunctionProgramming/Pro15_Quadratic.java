package com.brideglabz.functionprogramming;


import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro15_Quadratic {

	
		
		public static void main(String[] args) 
		{
			System.out.println("Enter value of a");
			int a=ScannerInput.intInput();
			System.out.println("Enter value of b");
			int b=ScannerInput.intInput();
			System.out.println("Enter value of c");
			int c=ScannerInput.intInput();
			
			double[] root= Utility.isQuadratic(a,b,c);
			
			System.out.println("Root 1 of x ="+root[0]   +"\nRoot 2 of x ="+root[1]);
		}
}
