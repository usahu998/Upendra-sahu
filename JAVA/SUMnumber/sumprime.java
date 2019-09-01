package SUMnumber;

public class sumprime {
	public void printsum()
	{
		boolean isprime;
		int sum=0;
		
		for (int i = 1; i < 100; i++) 
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
			sum=sum+i;
		}
		if(isprime==true){
		System.out.println("the sum="+sum);
		}
	}

}
