package LOWMAX;
import java.util.*;

public class LaunchLOWMAX {

	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length element");
		int n=s.nextInt();
		
		int a[]=new int[n];
		for (int i = 0; i <=a.length-1; i++) 
		{
			a[i]=s.nextInt();
			
		}
		
		LOWMAX m=new LOWMAX();
		m.lowmax(a, n);

	}

}
