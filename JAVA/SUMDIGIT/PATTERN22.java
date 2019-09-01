package SUMDIGIT;
/*
1 
2 7 
3 8 13 
4 9 14 19 
5 10 15 20 25 
*/

public class PATTERN22 {

	
	public static void main(String[] args) 
	{
		for (int i = 1; i <=5; i++) 
		{int k=i;
			for (int j =i; j >=1 ;j--) 
			{
				
					System.out.print(k+" ");
				k=k+5;
				
			}
			System.out.println();
		}

	}

}
