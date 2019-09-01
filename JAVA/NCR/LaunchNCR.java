package NCR;
import java.util.*;

public class LaunchNCR {

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of N");
		int n=sc.nextInt();
		
		System.out.println("Enter value of R");
		int r=sc.nextInt();
		
		NCR z=new NCR();
		int res=z.NCR(n, r);
		System.out.println("the result of NCR is"+res);

	}

}
