package ArrayAssign;

public class MfirstNsecond 
{
	public void array1swaparray2(int m,int n,int a1[],int a2[])
	{
		System.out.println("Swapped Array1");
		for (int i = 0; i <=a1.length-1 || i<= a2.length-1; i++) 
		{
			if(i!=m )
			{
				System.out.print(" "+a1[i]);
				
			}
			else
			{
				a1[m]=a1[m]+a2[n];
				a2[n]=a1[m]-a2[n];
				a1[m]=a1[m]-a2[n];
				System.out.print(" "+a1[m]);
			}
		}
		
		
		
		
		    System.out.println();
			System.out.println("Swapped Array2");
			for (int i = 0; i <=a1.length-1 || i<= a2.length-1; i++) 
			{
				if(i!=n )
				{
					System.out.print(" "+a2[i]);
					
				}
				else
				{
					a1[m]=a1[m]+a2[n];
					a2[n]=a1[m]-a2[n];
					a1[m]=a1[m]-a2[n];
					System.out.print(" "+a1[m]);
				}
				
			
		}
	}
	

}
