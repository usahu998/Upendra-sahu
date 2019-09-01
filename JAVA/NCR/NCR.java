package NCR;

public class NCR 
{
	public int NCR(int n,int r)
	{
		if(r==0||r==n)
		{
			return 1;
		}
		else if(r==1||r==n-1)
		{
			 return n;
		}
		else
		{
			return NCR(n-1,r)+NCR(n-1,r-1);
		}
	}

}
