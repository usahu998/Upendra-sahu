package ArrayAssign;

public class FourFive 
{
	public void swap(int a[])
	{
		System.out.println("Swapping 4th and 5th index are ");
		for (int i = 0; i <= a.length-1; i++) 
		{
			if(i!=3)
			{
				System.out.print(" "+a[i]);
			}
			else //if(a[i]=a[])
			{
				a[3]=a[3]+a[4];
				a[4]=a[3]-a[4];
				a[3]=a[3]-a[4];
				System.out.print(" "+a[3]);
			}
			
		}
	}

}
