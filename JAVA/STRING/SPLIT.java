package STRING;
import java.util.*;

public class SPLIT {

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String s=sc.nextLine();
		System.out.println(s);
		
		String a[]=s.split(" ");
		
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.println(a[i]);
			
		}

	}

}
