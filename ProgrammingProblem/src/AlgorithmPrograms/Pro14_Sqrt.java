package com.bridgelabz.algorithm;

import com.bridgelabz.utility.ScannerInput;

public class Pro14_Sqrt 
{
	public static void main(String[] args) 
	{ 
		double num=ScannerInput.doubleInput();
        double epsilon = 1.0e-15;  // relative error tolerance
        double initial = num;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(initial - num/initial) > epsilon*initial) {
            initial = (num/initial + initial) / 2.0;
        }

        // print out the estimate of the square root of c
        System.out.println("Square root of "+num+" is "+initial);
    }

}
