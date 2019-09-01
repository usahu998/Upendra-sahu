package primenumber;

public class Prime1 
{
	public void printprime(int m,int n)
	{
		boolean isprime;
		for (int i = m; i < n; i++) 
		{
			isprime=true;
			for (int j = 2; j < i; j++) 
			{
				if(i%j==0)
				{
					isprime=false;
					break;
				}
				
			}
			if (isprime==true) 
			{
				System.out.println(i);
				
			}
		}
	}

}
