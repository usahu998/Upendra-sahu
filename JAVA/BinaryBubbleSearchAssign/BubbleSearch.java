package BinaryBubbleSearchAssign;

public class BubbleSearch 
{
	public void BubbleSearch(int a[],int n)
	{
		for (int i = 0; i <=n-2; i++) 
		{
			for (int j = 0; j <=n-2-i; j++) 
			{
				if(a[j]<a[j+1])
				{
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j]^a[j+1];
					a[j]=a[j]^a[j+1];
				}
				
			}
			
		}
	}

}
