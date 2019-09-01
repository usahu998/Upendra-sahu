package SUMDIGIT;
/*
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 
*/

public class PATTERN28 {

	
	public static void main(String[] args)
	{
		for (int i = 1; i <=5; i++) 
		{int k=i;
			for (int j =1; j <=i ;j++) 
			{
				
					System.out.print(k+" ");
				k=k+5-j;
				
			}
			System.out.println();
		}

	}

}
