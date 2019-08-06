package AlgorithmPrograms;

import java.util.Scanner;

public class Pro13_MonthlyPayment {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal");
		int p=sc.nextInt();
		System.out.println("Enter Rate");
		double R=sc.nextDouble();
		System.out.println("Enter year");
		int y=sc.nextInt();
		
		Utility u=new Utility();
		u.isMonthlySalary(p,R,y);
	}

}
