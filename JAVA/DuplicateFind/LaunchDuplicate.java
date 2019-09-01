package DuplicateFind;
import java.util.*;

public class LaunchDuplicate {


	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter length Element");
		int n=s.nextInt();
		int a[]=new int[n];
		int a1[]=new int[n];
		
		System.out.println("Enter 1st element");
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.println("Enter an element");
			a[i]=s.nextInt();
		}
		System.out.println("Enter 2nd element");
		for (int i = 0; i <= a1.length-1; i++) 
		{
			System.out.println("Enter an element");
			a1[i]=s.nextInt();
		}
		System.out.println("Entered element are array 1");
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.print(" "+a[i]);
			
		}
		System.out.println();
		System.out.println("Entered element are array 2");
		
		
		for (int i = 0; i <= a1.length-1; i++) 
		{
			System.out.print(" "+a1[i]);
			
		}
		
		
		
		DuplicateAnotherArray d=new DuplicateAnotherArray();
		//d.Array(a,a1);
		 boolean res=d.Array(a,a1);
		 
		 if(res==true)
		 {
			 System.out.println("Array 1 and array 2 are same");
		 }
		 else
		 {
			 System.out.println("Array 1 and array 2 are  not same");
		 }
		



	}

}
