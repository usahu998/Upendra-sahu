package ArrayAssign;

public class ReverseSearch 
{
	public int linearsearch(int a[],int key)
	{
		for (int i = a.length-1; i>=0;i--) 
		{
			if(key==a[i]);
			{
				return i;
			}
			
		}
		return -1;
	}
	

}
