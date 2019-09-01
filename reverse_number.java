/*WRITE A PROGRAM TO REVERSING NUMBER*/
import java.util.Scanner;
class reverse_number 
{
	public static void main(String[] args) 
	{
		int number;
		int copynumber;
		int reverse=0;
		int digit;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number you want to be reverse number");
		number=s.nextInt();
		copynumber=number;
		while (copynumber > 0)                  /*CONDITION*/
		{
			digit=copynumber%10;
			copynumber=copynumber/10;
			reverse=(reverse*10)+digit;
        		}
		System.out.println("Original number is ="+number);
		System.out.println("Reverse number is ="+reverse);

	}
}
