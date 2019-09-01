package STRING;

public class demo 
{ 
	public boolean check(char s[],char ch)
	
	{
		for (int i = 0; i <= s.length-1; i++) 
		{
			if(s[i]== ch)
			{
				return true;
			}
			
			
		}
		return false;
		
	}

}
