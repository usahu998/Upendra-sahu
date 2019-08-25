package ArrayAssign2;

public class CombineTwoArray 
{
	public void CTA(int a[],int b[],int c[])
	{
		System.out.println();
		System.out.println("Combine array are ");
	
		for (int i = 0; i <= a.length-1; i++) 
		{
			c[i]=a[i];
			
		}
		for (int i =0; i <= b.length-1; i++) 
		{
			c[i+a.length]=b[i];
			
		}
		
		for (int i = 0; i <= c.length-1; i++) 
		{
			System.out.print(c[i]+" ");
			
		}
		
		
	}

	
	

}
