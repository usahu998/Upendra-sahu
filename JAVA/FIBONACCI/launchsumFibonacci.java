package FIBONACCI;

import java.util.Scanner;

public class launchsumFibonacci {


	
		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter any number=");
			int a=s.nextInt();
			SumFibbonacci d=new SumFibbonacci();
			d.printseries(a);

		}
	

}
