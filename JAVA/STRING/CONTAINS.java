package STRING;

import java.util.*;

public class CONTAINS {

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter any String");
		 String s=sc.nextLine();
		 
		 System.out.println("Enter a character to search");
		String ch=sc.next();
		 
		System.out.println("By Using Contains()");
		
		
		System.out.println("Without Using Contains ");
		 demo d=new demo();
		 boolean res=d.check(s.toCharArray(),ch.charAt(0));
		 
		 if(res==true)
		 {
			 System.out.println(res);
		 }
		 else
		 {
			 System.out.println(res);
		 }
	}
}
