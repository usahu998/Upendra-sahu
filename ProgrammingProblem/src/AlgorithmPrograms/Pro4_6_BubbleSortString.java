package com.bridgelabz.algorithm;


import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro4_6_BubbleSortString 
{
	public static void main(String[] args) 
	{
		long startTime=System.currentTimeMillis();
		System.out.println("Enter any String");
		String str=ScannerInput.strInput();
		String[] stringArray=str.split(" ");
		
		String[] bubbleSortArrayUtility=Utility.bubbleSortString(stringArray);
		
		System.out.println("After Sorting");
		for (int i = 0; i < bubbleSortArrayUtility.length; i++) 
		{
			System.out.print(bubbleSortArrayUtility[i]+" ");
		}
		
		long stopTime=System.currentTimeMillis();
		long time=stopTime-startTime;
		System.out.println(" elapsed time performance  "+ time);
	}
}
