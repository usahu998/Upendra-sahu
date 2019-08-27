package com.bridgelabz.algorithm;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro12_TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Enter  celsius ");
		int celsius = ScannerInput.intInput();

		System.out.println("Celsius To Fahrenheit is " + Utility.CelToFahren(celsius));

		System.out.println("Enter  fahrenheit ");
		int fahrenheit = ScannerInput.intInput();

		System.out.println("Fahrenheit To Celsius is " + Utility.fahrenToCel(fahrenheit));
	}
}
