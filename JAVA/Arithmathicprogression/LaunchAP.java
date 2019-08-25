package Arithmathicprogression;
import java.util.*;

public class LaunchAP {

	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int a=s.nextInt();
		System.out.println("Enter the number of difference");
		int b=s.nextInt();
		System.out.println("Enter the number of first term");
		int c=s.nextInt();
		
		AP x=new AP();
		x.ap(a, b, c);
		
		

	}

}
