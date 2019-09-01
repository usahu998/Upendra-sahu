package STRING;

import java.util.Scanner;

public class ReverseSplit {

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String s=sc.nextLine();
		System.out.println(s);
		
		String a[]=s.split(" ");
		
		for (int i = a.length-1; i >=0 ; i--) 
		{
			System.out.print(a[i]+" ");
			
		}


	}

}
