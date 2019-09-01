package SUMDIGIT;

public class PATTERN29
{

	
	public static void main(String[] args)
	{
		int a=0;
	    int b=1;
	
		for (int i = 1; i<=5; i++) 
		{
			for (int j = 1; j <=i ; j++)
			{
				int c=a+b;
			    a=b;
			    b=c;
				System.out.print(c+" ");
				
			}
			System.out.println();
		}

	}

}




1
12
123
1235
12358








