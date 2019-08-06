package AlgorithmPrograms;


import java.util.Scanner;

public class Pro4_4_InsertionSortString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long startTime=System.currentTimeMillis();
		System.out.println("Enter any string");
		String str=sc.nextLine();
		String a[]=str.split(" ");
		Utility u=new Utility();
		u.isInsertionSortString(a);
	
		long stopTime=System.currentTimeMillis();
		long Time=stopTime-startTime;
		System.out.println(" elapsed time performance  "+ Time);
	}

}
