package com.brideglabz.functionprogramming;

import java.io.PrintWriter;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Pro9_2DArray 
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args)
	{
		
		System.out.println("Enter Number of Rows ");
		int m=sc.nextInt();
		System.out.println("Enter Number of Columns ");
		int n=sc.nextInt();
		
		int[][] intArray=new int[m][n];
		double[][] doubleArray=new double[m][n];
		String[][] stringArray=new String[m][n];
		
		Utility.isIntegerArray(intArray);
		Utility.isDoubleArray(doubleArray);
		Utility.isBooleanArray(stringArray);
		
		display(intArray,doubleArray,stringArray);
	}
	
	
	 
	 static void display(int[][] intArray,double[][] doubleArray,String[][] stringArray)
	 {
		 PrintWriter pw=new PrintWriter(System.out,true);
		 
		 pw.println("2D Integer Array Element are");
		 for (int i = 0; i < intArray.length; i++) 
		 {
			 for (int j = 0; j < intArray.length; j++) 
			 {
				 pw.print(intArray[i][j]+" ");
			}
			pw.println();
			
		}
		 pw.println("2D Double Array Element are");
		 for (int i = 0; i < doubleArray.length; i++) 
		 {
			 for (int j = 0; j < doubleArray.length; j++) 
			 {
				 pw.print(doubleArray[i][j]+" ");
			}
			pw.println();
			
		}
		 pw.println("2D Boolean Array Element are");
		 for (int i = 0; i < stringArray.length; i++) 
		 {
			 for (int j = 0; j < stringArray.length; j++) 
			 {
				 pw.print(stringArray[i][j]+" ");
			}
			pw.println();
			
		}
	 }
	 

}
