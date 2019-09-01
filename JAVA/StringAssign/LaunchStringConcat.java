package StringAssign;
import java.util.*;

public class LaunchStringConcat {

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any string");
		String s=sc.nextLine();
		
		StringConcat x=new StringConcat();
		x.combineString(s);
		

	}

}
