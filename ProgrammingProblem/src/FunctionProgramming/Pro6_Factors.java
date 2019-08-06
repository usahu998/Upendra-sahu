package FunctionProgramming;

import java.util.Scanner;

public class Pro6_Factors {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number ");
		int n=sc.nextInt();
		 
		isFactors(n);
		

	}
	
	static void isFactors(int n)
	{
		for (int i = 1; i*i <=n; i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
			
		}
	}

}
