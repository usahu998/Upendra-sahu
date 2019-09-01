package FRACTION;
import java.util.Scanner;

public final class LaunchCandle {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of candle");
	int n=sc.nextInt();
	int a[]=new int[n];
	
	for (int i = 0; i <=a.length-1 ; i++) 
	{
		a[i]=sc.nextInt();
		
	}
	
	Candle c=new Candle();
	c.candlecount(a);
	

	}

}
