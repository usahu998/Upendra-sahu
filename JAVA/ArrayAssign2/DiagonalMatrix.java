package ArrayAssign2;

public class DiagonalMatrix 
{
	public void Diagonalelement(int a[][])
	{
		System.out.println("Diagonal Matrix  Element Are");
		for (int i = 0; i <= a.length-1; i++) 
		{
			for (int j = 0; j <= a.length-1; j++) 
			{
				if(i==j)
				{
					System.out.print(a[i][j]+" ");
				}
				
			}
			
		}
		
	}
	

}
