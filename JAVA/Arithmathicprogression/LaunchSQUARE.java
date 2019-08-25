package Arithmathicprogression;
import java.util.*;

public class LaunchSQUARE {

	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of terms");
		int a=s.nextInt();
		
		SQUARE sq = new SQUARE(); 
		sq.sqr(a);

	}

}
