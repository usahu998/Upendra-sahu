package DeleteElementCount;
import java.util.Scanner;

public class LaunchDeleteElement 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element number ");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for (int i = 0; i < args.length; i++) 
		{
			a[i]=sc.nextInt();
			
		}
		DeleteElement d=new DeleteElement();
		d.Delete(a);
		
	}

}
