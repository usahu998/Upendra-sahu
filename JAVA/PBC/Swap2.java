/* write a program in java to swap two number without using third variable*/
package PBC;
import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first Number");
		int a=s.nextInt();
		System.out.println("Enter Second Number");
		int b=s.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println("a="+a+" b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping");
		System.out.println("a="+a+" b="+b);
		

	}

}
