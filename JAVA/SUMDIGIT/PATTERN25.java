package SUMDIGIT;
/*
 12345
  2345
   345
    45
     5
     5
    45
   345
  2345
 12345
*/


public class PATTERN25 {

	
	public static void main(String[] args) 
	{
		for (int i = 1; i <=5; i++)
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(" ");
				
			}
			for (int j = i; j <=5; j++) 
			{
				System.out.print(j);
				
			}
			System.out.println();
			
		}
		
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
