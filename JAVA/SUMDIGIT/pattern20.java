package SUMDIGIT;
/*
Enter any number
6
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
*/
import java.util.*;

public class pattern20 {

	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=s.nextInt();
		int sum=0;
		for (int i = 1; i <=n ; i++) 
		{
			for (int j = 1; j <=i; j++) 
			{
				sum=sum+1;
				System.out.print(sum+" ");
				
				
			}
			System.out.println();
			
		}
		

	}

}
