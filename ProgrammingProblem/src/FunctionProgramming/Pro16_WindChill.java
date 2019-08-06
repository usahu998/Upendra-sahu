package FunctionProgramming;

import java.util.Scanner;

public class Pro16_WindChill {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter temperature in fahrenheit");
		double t=sc.nextDouble();
		System.out.println("Enter wind speed");
		double v=sc.nextDouble();
		
		double w=35.74+(0.6215*t)+(0.4275*t-35.75)* Math.pow(v, 0.16);
		System.out.println("Temperature = "+t);
		System.out.println("Wind Speed = "+v);
		System.out.println(" Wind Chill = "+w);

	}

}
