package FRACTION;

import java.util.Scanner;

public class Launch_Cat_Mouse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Queries :");
		int q = sc.nextInt();
		
		for(int i = 1; i <= q; i++ )
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			Cat_Mouse cm = new Cat_Mouse();
			String result = cm.catAndMouse(x, y, z);
			System.out.println(result);
		}
	}

}
