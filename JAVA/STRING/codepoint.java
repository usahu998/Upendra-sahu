package STRING;
import java.util.*;

public class codepoint {

	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter any String");
		String s1=s.nextLine();
		
		for (int i = 0; i <=s1.length()-1; i++)
		{
			System.out.println("The UniCode of = "+s1.charAt(i)+"="+s1.codePointAt(i));
			
		}
	}

}
