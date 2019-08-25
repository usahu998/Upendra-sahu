package ClassRoom;

import java.util.Scanner;

public class Launch_Reverse_Strings_Words 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an String: ");
		String a = sc.nextLine();
		
		Reverse_Strings_Words rsw = new Reverse_Strings_Words();
		rsw.revString_Words(a);
	}

}
