package InsertSort;
import java.util.*;

public class LaunchInsertionSearch 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter length Element");
		int n=s.nextInt();
		int a[]=new int[n];
		
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.println("Enter an element");
			a[i]=s.nextInt();
		}
		System.out.println("Before Swapping");
		System.out.println("Entered element are: ");
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.print(" "+a[i]);
			
		}
		System.out.println();
		
		
		
		InsertionSearch is=new InsertionSearch();
		is.InsertSort(a, n);
		
		System.out.println("After Swapping");
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.print(" "+a[i]);
			
		}
		System.out.println();
		System.out.print("Minimun value is ");
		System.out.print(a[0]);
		System.out.println();
		
		System.out.print("Maximum value is ");
		System.out.print(a[a.length-1]);
		System.out.println();
			
		System.out.print("2ndMaximum value is ");
		System.out.print(a[a.length-2]);
		System.out.println();
			
		System.out.print("2ndminimum  value is ");
		System.out.print(a[1]);
			
		
		

	}

}
