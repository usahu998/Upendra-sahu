package circus;

public class kangaroo 
{
	public boolean kangaroo(int a,int b,int c,int d)
	{
		if(b>d)
		{
			int rem=(c-a)%(b-d);
			if(rem==0)
			{
			return true;
			}
		}
			return false;
		}
	
}

