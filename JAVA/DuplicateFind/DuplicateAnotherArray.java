package DuplicateFind;

public class DuplicateAnotherArray {
	public boolean Array(int a[],int a1[])
	{
		System.out.println();
		System.out.println("");
		for (int i = 0; i <=a.length-1 || i<= a1.length-1; i++)
		{
			//for (int j = 0; j <=a.length-1 || j<= a1.length-1; j++)
			{
			
				if(a[i]!=a1[i])
				{
				//	System.out.println(a[i]);
					return false;
				}
				
			}	
			
		}
		return true;
		
	}

}
