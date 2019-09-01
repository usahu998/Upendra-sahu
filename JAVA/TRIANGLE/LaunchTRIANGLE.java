package TRIANGLE;
import java.util.*;

public class LaunchTRIANGLE {

	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter first side length");
		int a=s.nextInt();
		System.out.println("Enter second side length");
		int b=s.nextInt();
		System.out.println("Enter third side length");
		int c=s.nextInt();
		
		if (a+b >  c && a+c > b && b+c>a )
		{
			System.out.println("its form triangle");
		}
		else{
			System.out.println("its not form triangle");
		}

	}

}
