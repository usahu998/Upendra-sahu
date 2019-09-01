package SUMDIGIT;
/*
Enter any number
6
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
6 5 4 3 2 1 
*/
import java.util.*;

public class PATTERN21 {

	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=s.nextInt();
		for (int i = 1; i <=n; i++)
		{
			for (int j = i; j >=1; j--)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}

	}

}
