import java.util.Scanner;
public class palindrome
{

	public static void main(String args[])
	{
         Scanner s=new Scanner(System.in); 
	 
         int reverse=0,digit=0,copynum,num;
	 System.out.println("Enter any number to check the number is palindrome");
	 num = s.nextInt();
	 copynum=num;
         while(copynum > 0)
	 {
	  digit=copynum%10;
	  copynum=copynum/10;
	  reverse=(reverse*10)+digit;
	 }
	if(reverse==num)
	{
	System.out.println(+num+"=number is palindrome");
	}	
	else
	{
	System.out.println(+num+"=number is not palindrome");
	}
	}
}