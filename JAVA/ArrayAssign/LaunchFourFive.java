/* WAP in java to swap contains of the 4th and 5th index contains of an array */

package ArrayAssign;
import java.util.*;

public class LaunchFourFive {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n=s.nextInt();
		int a[]=new int[n];
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.println("Enter  Any Element");
			a[i]=s.nextInt();
			
		}
		System.out.print("Entered Element Are=");
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.print(" "+a[i]);
			
		}
		System.out.println();
		FourFive f=new FourFive();
		f.swap(a);

	}

}
