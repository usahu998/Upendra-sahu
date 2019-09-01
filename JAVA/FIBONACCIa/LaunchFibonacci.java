package FIBONACCIa;
import java.util.*;

public class LaunchFibonacci {

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number=");
		int n=sc.nextInt();
		
		fibonacci f=new fibonacci();
		int res=f.fib(n);
		System.out.println("the Fibonacci "+n+" number is "+res);

	}

}
