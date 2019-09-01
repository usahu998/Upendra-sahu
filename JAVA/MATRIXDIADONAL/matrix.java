package MATRIXDIADONAL;
import java.util.*;

public class matrix {

	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter matrix length");
		int n=s.nextInt();
		int a[][]=new int[n][n];
		
		System.out.println("Enter the element of matrix");
for (int i = 0; i <= a.length-1; i++) 
{
	for (int j = 0; j <= a[i].length-1; j++) 
	{
		a[i][j]=s.nextInt();
		
	}
	
}

System.out.println("the principal diagonl matrix is");
System.out.println(a[0][0]+" "+a[1][1]+" "+a[2][2]);
System.out.println("the secondary diagonal element is ");
System.out.println(a[0][2]+" "+a[1][1]+" "+a[2][0]);

System.out.println("the absolute difference is");
System.out.println(Math.abs((a[0][0]+a[1][1]+a[2][2])-(a[0][2]+a[1][1]+a[2][0])));



	}

}
