package MountainVally;



public class MV 
{
	public void mv(int s,String a)
	{
		int alt=0;
		int vc=0;
		
		for (int i = 0; i <=s-1; i++) 
		{
			char c=a.charAt(i);
			if(c=='u')
			{
				alt++;
				if(alt==0)
				{
					vc++;
				}
				else{
					alt--;
				}
			}
			System.out.println(vc);
		}
		
	}

}
