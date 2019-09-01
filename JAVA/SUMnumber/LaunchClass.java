package SUMnumber;
import java.util.*;
public class LaunchClass {


	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number=");
		int a=s.nextInt();
		
		sum c=new sum();
		c.printsum(a);

	}

}
