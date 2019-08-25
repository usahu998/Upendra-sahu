package Array;
import java.util.*;
public class LaunchSearch {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Length");
		int n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter element into Array");
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.println("Enter an Element");
			a[i]=s.nextInt();
			
		}
		System.out.println("Enter The Key");
		int key=s.nextInt();
		
		ArraySearch as=new ArraySearch();
		int res=as.LinearSearch(a, key);
		if(res>=0)
		{
			System.out.println("The Element "+key+"is present at the index "+res);
		}
		else
		{
			System.out.println("The Entered Key "+key+"is not found");
		}
		

	}

}
