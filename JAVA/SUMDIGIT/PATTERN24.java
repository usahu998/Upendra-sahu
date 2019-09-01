package SUMDIGIT;
/*
     5
    45
   345
  2345
 12345
*/


public class PATTERN24 {

	
	public static void main(String[] args) 
	{
		for (int i = 5; i >=1; i--) 
		{
			for (int j = i; j >=1; j--) 
			{
				System.out.print(" ");
				
			}
			for (int j = i; j <=5; j++) 
			{
				System.out.print(j);
				
			}
			System.out.println();
			
		}
		

	}

}
