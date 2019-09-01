package StringAssign;
import java.util.Scanner;

public class LaunchGenOTP 
{

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter  Name:");
		String s=sc.nextLine();
		
		System.out.println("Enter PhoneNumber:  ");
		String a=sc.nextLine();
		
		GenOTP g=new GenOTP();
		g.generateOTP(s, a);
		

	}

}
