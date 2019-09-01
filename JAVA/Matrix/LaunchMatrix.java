package Matrix;
import java.util.*;

public class LaunchMatrix {


	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number of row");
		int m=s.nextInt();
		System.out.println("Enter number of column");
		int n=s.nextInt();
		
		boolean a[][]=new boolean[m][n];
		boolean b[][]=new boolean[n][m];
		
		for (int i = 0; i <= a.length-1; i++) 
		{
			for (int j = 0; j <= a[i].length-1; j++) 
			{
			a[i][j]=s.hasNextBoolean();
			}
		}
		
		matrix z=new matrix();
		z.matrix(a,b);
		

	}

}
