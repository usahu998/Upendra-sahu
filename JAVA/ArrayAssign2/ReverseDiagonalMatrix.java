package ArrayAssign2;

public class ReverseDiagonalMatrix 
{
	public void ReverseDiagonalelement(int a[][])
	{
		System.out.println("Reverse Diagonal Matrix  Element Are");
		for (int i = a.length-1; i >=0; i--) 
		{
			for (int j = a.length-1; j >=0 ; j-- ) 
			{
				if(i==j)
				{
					System.out.print(a[i][j]+" ");
				}
				
			}
			
		}
		
	}
	

}
