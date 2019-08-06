package FunctionProgramming;

import java.util.Scanner;

public class Pro12_PermutationString 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String str=sc.nextLine();
		//String s=new String("123");
		//System.out.println(s.substring(0, 2) + s.substring(2+1,s.length()));
		//System.out.println(s.substring(0,1));  
		//System.out.println(s.substring(1+1, s.length()));
		/*Ram*/
		permutation(str);
	}
	
	public static void permutation(String input)
	{
		permutation("",input);
	}
	

	private static void permutation(String perm,String word) 
	{
		if(word.isEmpty())
		{
			System.err.println(perm+word);
		}
		else
		{	for (int i = 0; i <word.length(); i++)
			{
				permutation(perm+word.charAt(i),word.substring(0, i) + word.substring(i+1,word.length()));	
			}
		}
	}        

	

}
