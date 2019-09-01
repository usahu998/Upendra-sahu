package SelectionSearch;
import java.util.*;

public class LaunchSelectionSearch {

	
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the length");
		int n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter The element");
		for (int i = 0; i <= a.length-1; i++) 
		{
			a[i]=s.nextInt();
			
		}
		System.out.println("Entered Element are");
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.print(" "+a[i]);
			
		}
		System.out.println();
		SelectionSearch ss=new SelectionSearch();
		ss.SelectionSort(a, n);
		
		System.out.println("After SelectionSort");
		for (int i = 0; i <= a.length-1; i++) 
		{
		System.out.print(" "+a[i]);	
		}
		

	}

}
