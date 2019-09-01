/*Write a program in java to find the greatest common factor 
 of two number Euclidian algorithm */

package PBC;
import java.util.Scanner;

public class launchGCD 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number=");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		
		GreatestCommonDivision g=new GreatestCommonDivision();
		g.gcd(a,b);
		
	}

}
