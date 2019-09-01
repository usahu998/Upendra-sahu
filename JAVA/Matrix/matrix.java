package Matrix;

public class matrix 
{
	public void matrix(boolean a[][],boolean b[][])
	{ 
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = 0; j < a[i].length-1; j++)
			{
				
				b[j][i]=a[i][j];
				System.out.println(b[j][i]);
				
			}
			System.out.println();
			
		}
	}

}
