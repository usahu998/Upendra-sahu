/*write a program to check the number is palindrome or not? */
package PBC;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any to check palindrome");
		int n=s.nextInt();
		int original=n;
		int rem=0;
		int rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(original==rev)
		{
			System.out.println(original+"=number is a palindrome");
		}
		else
		{
			System.out.println(original+"= number is not a palindrome");
		}
				
	}

}
