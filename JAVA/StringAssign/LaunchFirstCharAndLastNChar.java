package StringAssign;
import java.util.Scanner;

public class LaunchFirstCharAndLastNChar {

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.nextLine();
		
		System.out.println("Enter any number");
		int a=sc.nextInt();
		
		FirstCharAndLastNChar f=new FirstCharAndLastNChar();
		f.firstandlastN(s,a);		
		

	}

}
