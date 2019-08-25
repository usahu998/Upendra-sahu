package BinaryBubbleSearchAssign;
import java.util.*;

public class LaunchBinarySearch {

	
	public static void main(String[] args) 
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the array element");
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.println("Enter any element");
			a[i]=s.nextInt();
			
		}
		
		System.out.println("Enter the element you want to search");
		int key=s.nextInt();
		
		BinarySearch b=new BinarySearch();
		int res=b.Bsearch(a, key, 0, n-1);
		
		if (res>=0)
		{
			System.out.println("The Entered "+key+ " is present at the index of "+res);
		}
		else
		{
			System.out.println("The Entered "+key+" is not found");
		}
		
		System.out.println();
		System.out.println("Before Sorting");
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.print(" "+a[i]);
			
		}
		
		System.out.println();
		System.out.println("After sorting");
		System.out.println("Bubble sort by Decreasing order");
		BubbleSearch bs=new BubbleSearch();
		bs.BubbleSearch(a, n);
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
