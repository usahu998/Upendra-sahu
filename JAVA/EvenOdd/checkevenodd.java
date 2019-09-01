package EvenOdd;

public class checkevenodd {
	public void check(int a[])
	{
		int count1=0,count2=0;
		for (int i = 0; i <= a.length-1; i++) 
		{
			
			if(a[i]%2==0)
			{
				count1++;
			}
			else
			{
				count2++;
			}
			
			
		}
		System.out.println("Even no is "+count1);
		System.out.println("Odd no is "+count2);
		
	}

}
