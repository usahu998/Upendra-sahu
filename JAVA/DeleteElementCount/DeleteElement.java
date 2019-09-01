package DeleteElementCount;

public class DeleteElement 
{
	public void Delete(int a[])
	{
		int count=0;
		for (int i = 0; i <= a.length-1; i++) 
		{
			for (int j = i+1; j <= a.length-1; j++) 
			{
				if(a[i]!=a[j])
				{
					count++;
				}
				
			}
			
		}
	}

}
