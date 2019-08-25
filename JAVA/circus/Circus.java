package circus;
import java.util.*;

public class Circus {

	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter kangaroo one x1 and v1");
		System.out.println("Enter kangaroo one x2 and v2");
		int a=s.nextInt();
		int b=s.nextInt();
		
		int c=s.nextInt();
		int d=s.nextInt();
		
		kangaroo k=new kangaroo();
		boolean res=k.kangaroo(a, b, c, d);
		
		if(res=true)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
