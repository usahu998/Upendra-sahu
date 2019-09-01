package SelectionSearch;

public class SelectionSearch 
{
	public void SelectionSort(int a[],int n)
	{
		int min;
		int pos;
		for (int i = 0; i <=n-2; i++) 
		{
			 min=a[i];
			pos=i;
			
			for (int j = i+1; j <=n-1; j++) 
			{
				if (a[j]<min)
				{
					min=a[j];
					pos=j;
				}
				
			}
			a[i]=a[i]+a[pos];
			a[pos]=a[i]-a[pos];
			a[i]=a[i]-a[pos];
		}
	}

}
