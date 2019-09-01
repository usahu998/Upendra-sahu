package Stick;
import java.util.*;

public class LaunchStick {

	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of stick n = ");
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		
		
		System.out.println("Enter an element");
		for (int i = 0; i <= a.length-1; i++) 
		{
			a[i]=s.nextInt();
			b[i]=a[i];
			
		}
		
		Stick k=new Stick();
		k.Stick(a,b);
	}

}
