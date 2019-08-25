package CLOCK;
import java.util.*;

public class LaunchClock {

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Time");
		
		String s=sc.next();
		
		clock c=new clock();
		String newTime=c.clock(s);
		System.out.println(newTime);

	}

}
