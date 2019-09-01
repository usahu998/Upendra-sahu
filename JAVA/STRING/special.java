package STRING;

import java.util.Scanner;

public class special {

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String s=sc.nextLine();
				
		Splitting sp=new Splitting();
		sp.revstring(s);
		}


	

}
