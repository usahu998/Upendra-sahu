package com.bridgelabz.data_structure;

import java.util.Scanner;
import java.util.Stack;



public class Pro3_BalancedParantheses {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter any string");
		String st=sc.nextLine();
		Stack<Character> stk=new Stack<Character>();
		for (int i = 0; i < st.length(); i++) 
		{
			char ch=st.charAt(i);
			if(ch=='[' || ch=='{' || ch=='(')
				stk.push(ch);
			else if(ch==']' || ch=='}' || ch==')')
			{
				stk.pop();
			}
			}
				
		boolean b=stk.isEmpty();
		if(b)
		{
			System.out.println("String is balanced");
		}
		else
		{
			System.out.println("String is not balanced");
		}

	}

}
