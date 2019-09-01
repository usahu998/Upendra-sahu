package SUMDIGIT;
/*
Enter any number
6
6 5 4 3 2 1 
6 5 4 3 2 
6 5 4 3 
6 5 4 
6 5 
6 
*/
import java.util.*;

public class PATTERN18 {

	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=s.nextInt();
		
		for (int i = 1; i <=n; i++) 
		{
			for (int j = n; j >=i; j--)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}

	}

}
