package com.brideglabz.functionprogramming;


import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro12_PermutationString 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter any string");
		String str=ScannerInput.strInput();
		//String s=new String("123");
		//System.out.println(s.substring(0, 2) + s.substring(2+1,s.length()));
		//System.out.println(s.substring(0,1));  
		//System.out.println(s.substring(1+1, s.length()));
		/*Ram*/
		permutation(str);
	}
	
	public static void permutation(String input)
	{
		Utility.permutation("",input);
	}
}
