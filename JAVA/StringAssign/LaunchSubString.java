package StringAssign;
import java.util.*;

public class LaunchSubString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any string");
		String s=sc.nextLine();
		
		SubString ss=new SubString();
		ss.selectString(s);

	}

}
