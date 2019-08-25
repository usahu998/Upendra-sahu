package ArrayAssign2;
import java.util.*;

public class LaunchDuplicateReplace999 {

	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Element Length");
		int n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter The Array element");
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.println("Enter an element");
			a[i]=s.nextInt();
			
		}
		
		System.out.print("Array element are:  ");
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.print(a[i]+" ");
			
			
		}
		System.out.println();
		
		DuplicateReplace999 d=new DuplicateReplace999();
		d.checkduplicate(a);
		

	}

}
