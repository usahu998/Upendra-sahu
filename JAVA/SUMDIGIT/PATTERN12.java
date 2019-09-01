package SUMDIGIT;
/*
1111112345
222212345
33312345
4412345
512345
*/

public class PATTERN12 {

	
	public static void main(String[] args)
	{
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 5; j >=i; j--) 
			{
				System.out.print(i);
				
			}
			for (int j = 1; j <=5; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		

	}

}
