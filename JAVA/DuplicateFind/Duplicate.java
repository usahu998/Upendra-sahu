package DuplicateFind;

public class Duplicate {
	public void checkduplicate(int a[])
	{
		for (int i = 0; i <= a.length-1; i++) 
		{
			for (int j =i+1; j <= a.length-1; j++) {
				
			
			{
				if (a[i]==a[j])
						{
				System.out.println(" "+a[i]);
				
						}
			}
			}
			
			
		}
	}

}
