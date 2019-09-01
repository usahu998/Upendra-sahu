package SUMDIGIT;

public class findRowColumn 
{
	public void findRC(int a[][],int z)
	{
		for (int i = 0; i <= a.length-1; i++) 
		{
			for (int j = 0; j <= a[i].length-1; j++) 
			{
				if(a[i][j]==z)
				{
					System.out.println("("+i+","+j+")");
				}
				
			}
			
		}
	}

}
