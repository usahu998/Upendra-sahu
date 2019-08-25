package ArrayAssign2;
import java.util.Scanner;

public class LaunchCombineTwoArray {

	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter element length");
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[a.length];
		
		int c[]=new int[a.length+b.length];
		
		System.out.println("Enter the element of 1st array");
		for (int i = 0; i <=a.length-1; i++) 
		{
			System.out.println("Enter an element");
			a[i]=s.nextInt();
		}
		
		
		System.out.println("Enter the element of 2st array");
		for (int i = 0; i <=b.length-1; i++) 
		{
			System.out.println("Enter an element");
			b[i]=s.nextInt();
		}
		
		System.out.print("Element of 1st array =");
		for (int i = 0; i <=a.length-1; i++) 
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		System.out.print("Element of 2st array =");
		for (int i = 0; i <=b.length-1; i++) 
		{
			System.out.print(b[i]+" ");
			
		}
		
		CombineTwoArray z=new CombineTwoArray();
		z.CTA(a, b, c);
		
		
		
		

	}

}
