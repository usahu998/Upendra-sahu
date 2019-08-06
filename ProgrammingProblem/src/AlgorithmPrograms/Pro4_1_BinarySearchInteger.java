package AlgorithmPrograms;

import java.util.Scanner;

public class Pro4_1_BinarySearchInteger {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long startTime=System.currentTimeMillis();
		System.out.println("Enter array length");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter key you want to search");
		int key =sc.nextInt();
		Utility u=new Utility(); 
		
		int ans=u.isBinarySearch(a,key,0,n);
		if (ans>=0)
		{
			System.out.println(key+" is present in index of "+ans);
		}
		else
		{
			System.out.println(key+" is not found");
		}
		long stopTime=System.currentTimeMillis();
		long Time=stopTime-startTime;
		System.out.println(" elapsed time performance  "+ Time);
		
	}
	
	

}
