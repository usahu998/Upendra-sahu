/*WAP in java to swap the contains of Mth index of first array with Nth index of 2nd Array*/
package ArrayAssign;
import java.util.*;

public class LaunchMfirstNsecond {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array length");
		int l=s.nextInt();
		int a1[]=new int[l];
		int a2[]=new int[a1.length];
		
		
		for (int i = 0; i <=a1.length-1; i++) 
		{
			System.out.println("Enter Array1 element");
			a1[i]=s.nextInt();
			
		}
		
		for (int i = 0; i <=a2.length-1; i++) 
		{
			System.out.println("Enter Array2 element");
			a2[i]=s.nextInt();
			
		}
		System.out.print("Entered Array1 element are=");
		for (int i = 0; i <=a1.length-1; i++) 
		{
			System.out.print(" "+a1[i]);
			
		}
		System.out.println();
		System.out.print("Entered Array2 element are=");
		for (int i = 0; i <= a2.length-1; i++) 
		{
			System.out.print(" "+a2[i]);
		}
		System.out.println();
		System.out.println("Entered Mth index of element is");
		int m=s.nextInt();
		
		System.out.println("Entered Nth index of element is");
		int n=s.nextInt();
		
		MfirstNsecond mn=new MfirstNsecond();
		mn.array1swaparray2(m, n, a1, a2);

	}

}
