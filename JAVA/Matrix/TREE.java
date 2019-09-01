package Matrix;
import java.util.Scanner;


public class TREE {


	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of trees n = ");
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int sum=0;
		int avg;
		
		System.out.println("Enter an element");
		for (int i = 0; i <= a.length-1; i++) 
		{
			a[i]=s.nextInt();
			b[i]=a[i];
			sum=sum+a[i];
		}
		
		avg=sum/n;
		System.out.println("the average value is"+avg);
		
		for (int i = 0; i < b.length; i++) 
		{
			if(b[i]>avg)
			{
				System.out.print(b[i]+" ");
			}
			
		}


		
	}
	}
