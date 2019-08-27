package com.brideglabz.functionprogramming;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro16_WindChill {
	public static void main(String[] args) 
	{
		
		System.out.println("Enter temperature in fahrenheit");
		double temperature=ScannerInput.doubleInput();
		System.out.println("Enter wind speed");
		double speed=ScannerInput.doubleInput();
		double windChill=Utility.isWindChill(temperature,speed);
		
		System.out.println("Temperature = "+temperature);
		System.out.println("Wind Speed = "+speed);
		System.out.println("Wind Chill = "+windChill);

	}

}
