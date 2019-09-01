package StringAssign;
import java.util.Scanner;
public class LaunchendAR {

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.nextLine();
		
		endAR e=new endAR();
		e.endwithAR(s);

	}

}
