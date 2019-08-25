package BinarySearch;
import java.util.*;

public class LaunchBinarySearch {

	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length array");
		int n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter an element");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter An Element");
			a[i]=s.nextInt();
			
		}
		System.out.println("Enter the element to be searched");
		int key=s.nextInt();
		
		BinarySearch b=new BinarySearch();
		int res=b.bsearch(a, key, 0, n-1);
		if(res>=0)
		{
			System.out.println("the entered "+key+ " is present at the index "+res);
			
		}
		else
		{
			System.out.println("the entered "+key+ "is not found");
		}

	}

}
