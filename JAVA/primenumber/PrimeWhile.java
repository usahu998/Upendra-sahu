package primenumber;
import java.util.*;
public class PrimeWhile {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter initial number=");
		int a=s.nextInt();
		System.out.println("Enter final number");
		int b=s.nextInt();
		
		prime2 p=new prime2();
		p.printprime(a, b);
		

	}

}
