package FunctionProgramming;

import java.util.Scanner;

public class Pro1_UserInput {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserName");
		String str=sc.nextLine();
		String st1="Hello <<UserName>> ,How are you?";
		String st[]=st1.split(" ");
		for (int i = 0; i < st.length; i++)
		{
			if(st[i].equals("<<UserName>>"))
					st[1]=str;
		}
		
		
		for (int i = 0; i < st.length; i++) 
		{
			System.out.print(st[i]+" ");
		}
		

	}



}
