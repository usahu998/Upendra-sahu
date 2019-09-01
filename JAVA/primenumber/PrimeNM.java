/* WAP in java to print prime number from m to n? */
package primenumber;
import java.util.*;

public class PrimeNM {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter inital number");
		int a=s.nextInt();
		System.out.println("Enter final number");
		int b=s.nextInt();
		
		Prime1 p=new Prime1();
		p.printprime(a,b);
		

	}

}
