package AlgorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Pro4_3_InsertionSortInteger
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long startTime=System.currentTimeMillis();
		System.out.println("Enter number of element ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" element");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		Utility u = new Utility();
		u.insertionSortInteger(a);
		long stopTime=System.currentTimeMillis();
		long Time=stopTime-startTime;
		System.out.println(" elapsed time performance  "+ Time);

	}

}

/*
 static int[] insertionSort(int a[])
 {
 for (int i = 1; i < a.length; i++)
 {
	 int t=a[i];
	 int j=i-1;
	 while(j>=0 && a[j]>t)
	 {
		 a[j+1]=a[j];
		 j--;
	 }
	 a[j+1]=t;
	 
		
	}
	
}
 
 }
 
  */
