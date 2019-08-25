package Array;
import java.util.*;
public class Array1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n=s.nextInt();
		int a[]=new int[n];
		int sum=0;
		
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.println("enter an element");
			a[i]=s.nextInt();
			
		}
		System.out.println("Array content are");
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(" "+a[i]);
			sum=sum+a[i];
		}
		
		System.out.println( );
		System.out.println("total element are ="+sum);
		

	}

}
