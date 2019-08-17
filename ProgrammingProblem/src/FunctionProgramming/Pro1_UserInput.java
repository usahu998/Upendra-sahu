package com.brideglabz.functionprogramming;

import java.util.Scanner;

public class Pro1_UserInput {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserName");
		String str=sc.nextLine();
		if(str.length()>2)
		{
		String st1="Hello <<UserName>> ,How are you?";
		String st[]=st1.split(" ");
		for (int i = 0; i < st.length; i++)
		{
			if(st[i].equals("<<UserName>>"))
					st[i]=str;
		}
		
		
		for (int i = 0; i < st.length; i++) 
		{
			System.out.print(st[i]+" ");
		}
		

	}
		else
			System.err.println("invalid minimum three character  ");


	}
}
