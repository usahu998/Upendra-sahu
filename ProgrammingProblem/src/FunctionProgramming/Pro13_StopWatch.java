package com.brideglabz.functionprogramming;


import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro13_StopWatch 
{

	public static void main(String[] args) 
	{
		System.out.println("press any button to start and end");
		ScannerInput.wordInput();
		long time=Utility.stopwatchSimulator();
		System.out.println("total time required "+time+" millisecond");
		System.out.println("total time required "+time/1000+" second");

	}
	


	

}
