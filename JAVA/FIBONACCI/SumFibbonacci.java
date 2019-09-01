package FIBONACCI;

public class SumFibbonacci 
{
	public void printseries(int x)
	{
		int a=0;
		int b=1;
		int next;
		int sum=0;
		System.out.println(x);
		
		for (int i = 1; i <=x ; i++) 
		{
			 System.out.print(a+" ");
			 sum=sum+a;
			next=a+b;
			
			a=b;
			b=next;
			
			
			
		}
		System.out.println();
		System.out.println("sum of fibonacci series is="+sum);
	}

}
