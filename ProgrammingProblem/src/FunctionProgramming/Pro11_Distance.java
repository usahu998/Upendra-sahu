package FunctionProgramming;

import java.util.Scanner;

public class Pro11_Distance {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter th e point X");
			//int x = Integer.parseInt(args[0]);
			int x=sc.nextInt();
			System.out.println("Enter th e point Y");
			//int y = Integer.parseInt(args[1]);
			int y=sc.nextInt();

			double m = Math.pow(x, x);
			double n = Math.pow(y, y);

			double d = Math.sqrt(m + n);

			System.out.println("Euclidean Distance= " + d);

	}

}
