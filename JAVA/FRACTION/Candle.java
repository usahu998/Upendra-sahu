package FRACTION;

public class Candle 
{int count=0;
int max=0;
 
	public void candlecount(int a[])
	{
		
		for (int i = 0; i <= a.length-1; i++) 
		{
			
			if(a[i]>max)
			{
				max=a[i];
			}
			
			
		}
		for (int i = 0; i <= a.length-1; i++) 
		{
			if (a[i]==max)
			count++;
		}
		
		System.out.println(count);
	}

}
