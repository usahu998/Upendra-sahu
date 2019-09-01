package STRING;
import java.util.*;

public class REVERSESTRING {
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.nextLine();
		
		System.out.println("Before Swapping");
		System.out.println(s);
		
		 
		 char a[]=s.toCharArray();
		 char b[]=new char[s.length()];
		 int j=0;
	for (int i =  s.length()-1; i >=0; i--) 
	{
		b[j]=a[i];
		j++;
	}
	              s=new String(b);
		System.out.println("After Swapping");
		System.out.println(s);
		
	
		 
		
	
	
	}
}
