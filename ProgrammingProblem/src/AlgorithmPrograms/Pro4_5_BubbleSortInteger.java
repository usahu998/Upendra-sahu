package AlgorithmPrograms;

import java.util.Scanner;

public class Pro4_5_BubbleSortInteger {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		long startTime=System.currentTimeMillis();
		System.out.println("Enter array length");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter "+n+" element");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
			
		}
		Utility u=new Utility();
		u.bubbleSort(a);
		
		long stopTime=System.currentTimeMillis();
		long Time=stopTime-startTime;
		System.out.println(" elapsed time performance  "+ Time);
	}
	

}
