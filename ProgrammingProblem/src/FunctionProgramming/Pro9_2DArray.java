package FunctionProgramming;

import java.io.PrintWriter;
import java.util.Scanner;

public class Pro9_2DArray 
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args)
	{
		
		System.out.println("Enter Number of Rows ");
		int m=sc.nextInt();
		System.out.println("Enter Number of Columns ");
		int n=sc.nextInt();
		
		int a[][]=new int[m][n];
		double b[][]=new double[m][n];
		String c[][]=new String[m][n];
		
		isIntegerArray(a);
		isDoubleArray(b);
		isBooleanArray(c);
		
		display(a,b,c);

	}
	
	 public static int[][] isIntegerArray(int a[][])
	{
		 System.out.println("Enter Integer element");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	 
	 public static double[][] isDoubleArray(double b[][])
		{
		 System.out.println("Enter Double Element");
			for (int i = 0; i < b.length; i++) 
			{
				for (int j = 0; j < b.length; j++) 
				{
					b[i][j]=sc.nextDouble();
				}
				
			}
			return b;
		}	
	 
	 public static String[][] isBooleanArray(String c[][])
		{
		 System.out.println("Enter Boolean Element");
			for (int i = 0; i < c.length; i++) 
			{
				for (int j = 0; j < c.length; j++) 
				{
					c[i][j]=sc.next();
				}
				
			}
			return c;
		}	
	 
	 static void display(int a[][],double b[][],String c[][])
	 {
		 PrintWriter pw=new PrintWriter(System.out,true);
		 
		 pw.println("2D Integer Array Element are");
		 for (int i = 0; i < a.length; i++) 
		 {
			 for (int j = 0; j < a.length; j++) 
			 {
				 pw.print(a[i][j]+" ");
			}
			pw.println();
			
		}
		 pw.println("2D Double Array Element are");
		 for (int i = 0; i < b.length; i++) 
		 {
			 for (int j = 0; j < b.length; j++) 
			 {
				 pw.print(b[i][j]+" ");
			}
			pw.println();
			
		}
		 pw.println("2D Boolean Array Element are");
		 for (int i = 0; i < c.length; i++) 
		 {
			 for (int j = 0; j < c.length; j++) 
			 {
				 pw.print(c[i][j]+" ");
			}
			pw.println();
			
		}
	 }
	 

}
