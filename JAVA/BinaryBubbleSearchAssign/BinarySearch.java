package BinaryBubbleSearchAssign;

public class BinarySearch 
{
	public int Bsearch(int a[],int key,int low,int high)
	{
		int mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(key==a[mid])
			{
				return mid;
			}
			else if(key<=a[mid])
			{
				low=low;
				high=mid-1;
			}
			else
			{
				high=high;
				low=mid+1;
			}
		}
		return -1;
		
	}

}
