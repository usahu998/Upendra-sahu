package BinarySearch;

public class BinarySearch 
{
	public int bsearch(int a[],int key,int low,int high)
	{
		int mid;
		
		while(low <= high)
		{
			mid=(low + high)/2;
			if(key==a[mid])
			{
				return mid;
			}
			else if(key<a[mid])
			{
				high=mid-1;
				low=low;
			}
			else
			{
				low=mid+1;
				high=high;
			}
		}
		return -1;
	}

}
