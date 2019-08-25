/*WAP in java to swap the contains of the Mth and Nth index of an array*/ 

package ArrayAssign;
import java.util.*;

public class LaunchMthNthSWAP {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Element Length");
		int z=s.nextInt();
		int a[]=new int[z];
		
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.println("Enter any number");
			a[i]=s.nextInt();
			
		}
		System.out.print("Enterd element are=");
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.print(" "+a[i]);
			
		}
		System.out.println();
		System.out.println("Enter M th index element=");
		int m=s.nextInt();
		System.out.println("Enter n th index element=");
		int n=s.nextInt();
		
		MthNthSWAP mn=new MthNthSWAP();
		mn.MNSwap(m, n, a);
		
		
		

	}

}
