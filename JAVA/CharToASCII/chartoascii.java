package CharToASCII;
import java.util.Scanner;
public class chartoascii 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number= ");
		String a=s.nextLine();
		
		char c=a.charAt(0);
		char v=a.charAt(1);
		int ascii1=(int)c;
		int ascii2=(int)v;
		
		System.out.println("value of "+c+" is "+ascii1);
		System.out.println("value of "+v+" is "+ascii2);
		
		int z=ascii1+ascii2;
		
		char x=(char)z;
		System.out.println("Sum of two character value of "+z+" is = "+x);
		
		

	}

}
