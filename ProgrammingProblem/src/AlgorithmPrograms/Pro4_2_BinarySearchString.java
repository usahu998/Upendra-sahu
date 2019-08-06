package AlgorithmPrograms;

import java.util.Scanner;

public class Pro4_2_BinarySearchString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long startTime=System.currentTimeMillis();
		System.out.println("Enter any String");
		String s=sc.nextLine();
		System.out.println("Enter search word");
		String w=sc.nextLine();
		String str[]=s.split(" ");
		
		Utility u=new Utility();
		int ans=u.BinarySearchString(str,w);
		if(ans==-1)
			System.out.println("Word is not present");
		else
		System.out.println(w+" is present in index of "+ans);
		
		long stopTime=System.currentTimeMillis();
		long Time=stopTime-startTime;
		System.out.println(" elapsed time performance  "+ Time);		

	}



}
