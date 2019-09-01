package FRACTION;
import java.util.Scanner;

public class Fraction {



	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number ");
		int n=sc.nextInt();
		float a[]=new float[(int) n];
		for (int i = 0; i <= a.length-1; i++) 
		{
			a[i]=sc.nextInt();
		}
		
		float pc=0;
		float nc=0;
		float zc=0;
		for (int i = 0; i <= a.length-1; i++) 
		{
			if(a[i]>0)
			{
				pc++;
			}
			else if(a[i]<0)
			{
				nc++;
			}
			else 
			{
				zc++;
			}
			
		}
		System.out.printf("%1.6f\n",pc/a.length);
		System.out.printf("%1.6f\n",nc/a.length);
		System.out.printf("%1.6f\n",zc/a.length);
		
		

	}

}
