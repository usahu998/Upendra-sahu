package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Pro2_PrimeNumber0_1000 
{
	public static void main(String[] args)
	{
		int[] prime=Utility.isPrime();
		
		for (int i = 0; i < prime.length; i++) 
		{
			System.out.print(prime[i]+" ");
		}
	}
}
