package primenumber;

public class prime2 
{
	boolean isprime;
	int i;
	int j;
	
	public void printprime(int m,int n)
	{
		i=m;
		while (i<n) 
		{
			isprime=true;
			
			j=2;
			while (j<i)
			{
				if(i%j==0)
				{
					isprime=false;
				}
				j++;
			}
			
			i++;
			if(isprime=true)
			{
				System.out.println(i);
			}
		}
		
		
	}

}
