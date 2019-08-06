package AlgorithmPrograms;

import java.util.Scanner;

public class Pro12_TemperatureConversion {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  celsius ");
		int c=sc.nextInt();
		int f=(c*9/5)+32;
		System.out.println("Celsius To Fahrenheit is "+f);
		int z=(f-32)*5/9;
		System.out.println("Fahrenheit To Celsius is "+z);
		
		
		

	}

}
