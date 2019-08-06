package AlgorithmPrograms;

import java.util.Scanner;

public class Pro14_Sqrt 
{
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		double c=sc.nextDouble();
        double epsilon = 1.0e-15;  // relative error tolerance
        double t = c;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

        // print out the estimate of the square root of c
        System.out.println("Square root of "+c+" is "+t);
    }

}
