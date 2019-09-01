package COMPLEXNUMBER;
import java.util.*;

public class complexnumbert {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the real and imaginary if 1st number");
		int a=s.nextInt();
		int b=s.nextInt();
		
		System.out.println("Enter the real and imaginary if 2st number");
		int c=s.nextInt();
		int d=s.nextInt();
		
		System.out.println("the 1st complex no is =");
		System.out.println(a+"+"+b+"i");
		
		System.out.println("the 2st complex no is =");
		System.out.println(c+"+"+d+"i");
		
		System.out.println("the sum of complex is");
		System.out.println((a+c)+"+"+(b+d)+"i");
		
		
		
	}

}
