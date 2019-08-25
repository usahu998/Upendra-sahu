package ArrayAssign2;
import java .util.Scanner;

public class LaunchDiagonalMatrix 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a[][]=new int[3][3];
		
		System.out.println("Enter 3*3 Matrix element");
		for (int i = 0; i <= a.length-1; i++) 
		{
			for (int j = 0; j <= a[i].length-1; j++) 
			{
				
						a[i][j]=s.nextInt();
				
			}
			
		}
		System.out.println("Matrix Element Are=");
		for (int i = 0; i <= a.length-1; i++) 
		{
			for (int j = 0; j <= a[i].length-1; j++) 
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
			
		}
		DiagonalMatrix d=new DiagonalMatrix();
		d.Diagonalelement(a);
	}
	

}
