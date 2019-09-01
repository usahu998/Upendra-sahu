package SUMDIGIT;
import java.util.*;

public class sumdigit {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number=");
		int n=s.nextInt();
		
		while(n>9)
		{
			int sum=0;
			int rem=0;
			while(n!=0)
			{
				rem=n%10;
				sum=sum+rem;
				n=n/10;
			}
			n=sum;
		}
		System.out.println(n);
		

		
		
		

	}

}
