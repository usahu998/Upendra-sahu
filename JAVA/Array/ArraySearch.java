package Array;

public class ArraySearch 
{
	public int LinearSearch(int a[],int key)
	{       
		for (int i =0; i <=a.length; i++) 
		{
			if(key==a[i])
			{
				return i;
			}
			
		}
		return -1;
		
	}

}
