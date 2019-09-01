package SUMDIGIT;
/*
     *****
    *****
   *****
  *****
 *****
*/

public class PATTERN9 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 5; j >=i; j--) 
			{
				System.out.print(" ");
			}
			for (int j2 = 1; j2 <=5; j2++) {
				System.out.print("*");
			}
			
			System.out.println();
				
			}

	}

}
