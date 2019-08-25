package ArrayAssign2;

public class DuplicateReplace999 {
	public void checkduplicate(int a[])
	{ System.out.println("Replaced duplicate in array");
		for (int i = 0; i <= a.length-1; i++) 
		{
			for (int j =i+1; j <= a.length-1; j++) 
			{
				  if (a[i]==a[j])
						{
					       a[j]=-999;
					       	
			             }
			 }
		}
		for (int i = 0; i <= a.length-1; i++) 
		{
			System.out.print(" "+a[i]);
		}
	}

}
