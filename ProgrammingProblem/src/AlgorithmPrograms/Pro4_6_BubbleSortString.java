package AlgorithmPrograms;

import java.util.Scanner;

public class Pro4_6_BubbleSortString 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long startTime=System.currentTimeMillis();
		System.out.println("Enter any String");
		String str=sc.nextLine();
		String a[]=str.split(" ");
		Utility u=new Utility();
		u.bubbleSortString(a);
		
		String temp;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i].compareToIgnoreCase(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		System.out.println("After Sorting");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
			
		}
		
		long stopTime=System.currentTimeMillis();
		long Time=stopTime-startTime;
		System.out.println(" elapsed time performance  "+ Time);

	}

}
