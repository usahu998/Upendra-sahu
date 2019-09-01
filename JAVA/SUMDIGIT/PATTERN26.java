package SUMDIGIT;
/*

1
10
101
1010
10101
*/

public class PATTERN26 {

	
	public static void main(String[] args)
	{
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(j%2);
				
		/*	//	if(j==1 || j==3 || j==5)
					if(j%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
				*/
			}
			System.out.println();
			
		}

	}

}
