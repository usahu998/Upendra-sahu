package EvenOdd;
import java.util.*;

public class Launchcheckevenodd 
{
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter length Element");
	int n=s.nextInt();
	int a[]=new int[n];
	
	
	System.out.println("Enter 1st element");
	for (int i = 0; i <= a.length-1; i++) 
	{
		System.out.println("Enter an element");
		a[i]=s.nextInt();
	}
	System.out.println("Entered element are");
	for (int i = 0; i <= a.length-1; i++) 
	{
		System.out.print(" "+a[i]);
		
	}
	System.out.println();
	
	
	checkevenodd c=new checkevenodd();
	c.check(a);
	}
}
