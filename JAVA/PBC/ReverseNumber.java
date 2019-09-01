/*write a program in java to reverse a given number*/
package PBC;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=s.nextInt();
		int rem=0;
		int rev=0;
		
		while(n!=0)
		{
			rem=n%10;           //reminder=number%10   (mod)
			rev=(rev*10)+rem;   //reverse=reverse*10+reminder
			n=n/10;             //number=number/10
		}
		System.out.println("The Reverse Number is ="+rev);
		

	}

}
