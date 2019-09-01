/*Write a program to swap two number using temp*/
package PBC;
import java.util.Scanner;

public class Swap1 
{
    public static void main(String[] args) 
	{
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter first number");
    	int a=s.nextInt();
    	System.out.println("Enter second number");
    	int b=s.nextInt();
    	
    	int temp;
    	
    	System.out.println("Before Swapping");
    	System.out.println("a="+a+" b="+b);
    	
    	temp=a;
    	a=b;
    	b=temp;
    	
    	System.out.println("After Swapping");
    	System.out.println("a="+a+" b="+b);
    	
    	

	}

}
