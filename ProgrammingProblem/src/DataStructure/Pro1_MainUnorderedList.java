package DataStructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Pro1_MainUnorderedList {

	public static void main(String[] args) throws IOException
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word you want to search");
		String key=sc.nextLine();
//		String a[]=str.split(" ");
		
		File file = new File("D:\\BL\\List.txt"); 
		  
		  @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		  String str="";
		  String add="";
		//  str=br.readLine();
		  while((str = br.readLine())!= null) 
		  {
			 add=add+str;
		  }
		  String a[]=add.split(" ");     	//splitting String
		
		Pro1_UnorderdList<String> uol=new Pro1_UnorderdList<String>();
		
		for (int i = 0; i < a.length; i++) 
		{
			uol.add(a[i]);
		}
		uol.display();
		boolean b=istocheck(a,key);
		if(b)
		{
			System.out.println("the word is already found");
			System.out.println("It is remove from the list");
		}
		else
		{
			uol.add(key);
			System.out.println("the not founded word is added to the file");
		     System.out.println("file saved");	
		}
		uol.pop();
		uol.size();
		uol.isEmpty();
		uol.display();
	}
	
	static boolean istocheck(String a[],String key)
	{
		for (int i = 0; i < a.length; i++)
		{
			if(key.equals(a[i]))
			return true;	
		}
		return false;
	}
}
