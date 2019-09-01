package SUMDIGIT;
import java.util.*;

public class LaunchfindRowColumn {

	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter matrix length");
		int n=s.nextInt();
		int a[][]=new int [n][n];
		System.out.println("Enter an element");
		for (int i = 0; i <= a.length-1; i++) 
		{
			for (int j = 0; j <= a[i].length-1; j++) 
			{
				a[i][j]=s.nextInt();
				
			}
		}
		System.out.println("Enter a number to search");
		int z=s.nextInt();
		findRowColumn c=new findRowColumn();
		c.findRC(a,z);
		

	}

}
