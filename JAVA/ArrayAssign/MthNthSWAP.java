package ArrayAssign;

public class MthNthSWAP 
{
	public void MNSwap(int m,int n,int a[])
	{
		System.out.println("Swapping Mth and Nth index of element");
		for (int i = 0; i <= a.length-1; i++) 
		{
			if(i!=m )
			{
				System.out.print(" "+a[i]);
			}
			else
			{
				a[m]=a[m]+a[n];
				a[n]=a[m]-a[n];
				a[m]=a[m]-a[n];
				System.out.print(" "+a[m]);
			}
			
			
		}
	}
	
	

}
