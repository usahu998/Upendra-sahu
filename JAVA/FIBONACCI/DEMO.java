package FIBONACCI;

public class DEMO {
	public void printseries(int x)
	{
		int a=0;
		int b=1;
		int next;
		System.out.println(x);
		
		for (int i = 1; i <=x ; i++) 
		{
			 System.out.print(a+" ");
			next=a+b;
			
			a=b;
			b=next;
			
			
			
		}
	}

}
