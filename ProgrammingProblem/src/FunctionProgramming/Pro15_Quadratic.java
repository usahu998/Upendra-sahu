package FunctionProgramming;

import java.util.Scanner;

public class Pro15_Quadratic {

	
		
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value of a");
			int a=sc.nextInt();
			System.out.println("Enter value of b");
			int b=sc.nextInt();
			System.out.println("Enter value of c");
			int c=sc.nextInt();
			
			isQuadratic(a,b,c);

		}
		
		static void isQuadratic(int a,int b,int c)
		{
			double delta=Math.sqrt(b*b-(4*a*c));
			System.out.println("Root 1 of x ="+(-b+delta)/(2*a));
			System.out.println("Root 2 of x ="+(-b-delta)/(2*a));
			
			
		}
		


	

}
