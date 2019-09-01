package primenumber;

public class Prime 
{
	public void printprime()
	{
		boolean isprime;
		for (int i =200; i < 400; i++) 
		{
			isprime=true;
			for (int j = 2; j<i; j++) 
			{
				if (i%j==0) 
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
