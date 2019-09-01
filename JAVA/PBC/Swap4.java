/* Write a Program in java to Swap two number without using temp
 * and addition
 * and subtraction
 * and multiplication
 * and division*/
package PBC;
import java.util.Scanner;


public class Swap4 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter First Number=");
		int a=s.nextInt();
		System.out.println("Enter Second Number=");
		int b=s.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println("a="+a+" b="+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After Swapping");
		System.out.println("a="+a+" b="+b);

	}

}
