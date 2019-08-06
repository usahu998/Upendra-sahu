package AlgorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Pro1_Anagram {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String str1=sc.nextLine();
		System.out.println("Enter second String");
		String str2=sc.nextLine();
		
		
		Utility u=new Utility();
		boolean ans=u.isAnagram(str1,str2);
		if(ans)
			System.out.println("Two string are anagram");
		else
			System.out.println("Two string are not anagram");
	}
	
	
}
