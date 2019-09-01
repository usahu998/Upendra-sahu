package GCD;
import java.util.*;
public final class LaunchGCD {

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first value");
		int a=sc.nextInt();
		System.out.println("Enter Second value");
		int b=sc.nextInt();
		
		gcd g=new gcd();
		int res=g.gcd(a, b);
		
		System.out.println(" the GCD number is "+res);
		
	}

}
