package InsertSort;

public class InsertionSearch 
{
	public void InsertSort(int a[],int n)
	{int item,j;
		for (int i = 1; i <=n-1; i++) 
		{
			item=a[i];
			j=i-1;
			while(j>=0 && a[j]>item)
			{
				a[j+1]=a[j];
				j--;
			}
			
			a[j+1]=item;
			
			
		}
		
	}

}
