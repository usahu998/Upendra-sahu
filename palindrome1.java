/*WAP to find a given number is palindrome or not */
import java.util.Scanner;
class palindrome1              
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int mode,temp,sum=0,n;	
    System.out.println("Enter Any Number=");
	n=s.nextInt();
	temp=n;
	while (n>0)                                   /*condition for number is greater than zero*/
	{ 
	mode=n%10;                                    /*  mode of number */                      
	n=n/10;                                       /*  number divided by 10 */
	sum=(sum*10)+mode;                            /*sum = reverse */
	

	}
    if (sum==temp)                                /*comparing of Reverse number and original number */
	{
		System.out.println("palindrome number is= "+sum);       
	}
	else 
	{
		System.out.println("Not a palindrome  is="+sum);
	}
	}
}
