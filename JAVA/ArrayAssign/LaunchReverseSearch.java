/*Wap in java to perform linear search in the reverse direction*/

package ArrayAssign;
import java.util.*;

public class LaunchReverseSearch {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Length Element");
		int n=s.nextInt();
		int a[]=new int[n];
		
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.println("Enter array element");
			a[i]=s.nextInt();
			
		}
		System.out.print("Entered element are=");
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.print(" "+a[i]);
			
			
		}
		System.out.println();
		System.out.println("Enter key number ");
		int key=s.nextInt();
		
		
		ReverseSearch rs=new ReverseSearch();
		int res=rs.linearsearch(a, key);
		
		if(res>=0)
		{
			System.out.println("The Entered "+key + " is present in index "+ res);
		} 
		else
		{
			System.out.println("The Entered key "+key+ " is not found");
		}
		
		
		
		

	}

}
