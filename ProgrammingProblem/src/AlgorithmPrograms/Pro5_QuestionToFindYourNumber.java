package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Pro5_QuestionToFindYourNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter any number");
		int k = sc.nextInt();
		int n = (int) Math.pow(2, k);
		System.out.println("Think of an integer between 0 and " + (n - 1));
		int secret = Utility.searchYourNum(0, n);
		System.out.println("Your number is " + secret);
	}
}
