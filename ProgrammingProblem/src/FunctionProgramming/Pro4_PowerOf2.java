package FunctionProgramming;

import java.util.Scanner;

public class Pro4_PowerOf2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		power(n);
		

	}
	
	static void power(int n)
	{
		if(0<=n && n <31)
		{
		
			int pow=1;
			for(int i=0;i<=n;i++)
			{
			System.out.println("2^"+i+"  "+pow);   //ans=Math.pow(2,power)
			pow=2*pow;                             //System.out.println(power+" "+ans);

			}
			
			
		
		}
		else 
			System.out.println("invalid number");
	}

}
