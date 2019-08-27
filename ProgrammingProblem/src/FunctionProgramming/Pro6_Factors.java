package com.brideglabz.functionprogramming;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro6_Factors {

	public static void main(String[] args)
	{
		
		System.out.println("Enter any number ");
		int num=ScannerInput.intInput();
		 
		int[] numArray= Utility.isFactors(num);
		for (int i = 0; i < numArray.length; i++) 
		{	if(numArray[i]!=0)
			System.out.print(numArray[i]+" ");
		}

	}
	
	

}
