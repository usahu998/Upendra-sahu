package com.bridgelabz.data_structure;

import com.bridgelabz.utility.Utility;

public class Pro11_PrimeRange2D {

	public static boolean prime(int n)
	{
		if(n < 2)
			return false;
		if(n == 2)
			return true;
		for(int i = 2; i*i < n; i++)
			if(n%i == 0)
				return false;
		return true;
	}
	public static void main(String[] args)
	{
		
		int [][] mat = new int[10][100];
		int p = 1;
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 100; j++) {
				if(prime(p) == true)
					mat[i][j] = 1;
				p++;
			}
		}
		 p = 1;
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 100; j++) {
				if(mat[i][j] == 1)
					System.out.print(p+" ");
				p++;
			}
			System.out.print("\n");
		}
//
//		int[] arr = Utility.isPrime();
//		System.out.print(" ");
		/*
		 * int[][] arr1 = new int[10][167];
		 * 
		 * for (int i = 0; i < 10; i++) { for (int j = 0; j < 167; j++) { if (arr[j] >
		 * ((i) * 100) && arr[j] < ((i + 1) * 100)) {
		 * 
		 * arr1[i][j] = arr[j]; System.out.print(arr1[i][j] + " "); }
		 * 
		 * } System.out.println(); }
		 */
		
	}
}
