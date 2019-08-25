package Arithmathicprogression;

public class SQUARE 
{
	public void sqr(int a)
	{int sum=0;int z=0;
		for (int i = 1; i <=a; i++) 
		{
			System.out.print((z=i*i)+" ");
			sum=sum+z;
		}
		System.out.println();
		System.out.println("sum of series is "+sum);
	}

}
