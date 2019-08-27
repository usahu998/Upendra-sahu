package com.bridgelabz.utility;

import java.util.Scanner;

public class ScannerInput {

	final static Scanner sc = new Scanner(System.in);

	public static int intInput() {
		int number = sc.nextInt();
		return number;
	}

	public static String strInput() {
		String str = sc.nextLine();
		return str;
	}
	
	public static double doubleInput() {
		double dbl = sc.nextDouble();
		return dbl;
	}
	
	public static String wordInput() {
		String word = sc.next();
		return word;
	}
	

	public static boolean booleanInput() {
		boolean bool= sc.nextBoolean();
		return bool;
	}
	
	public static long longInput() {
		long longnum= sc.nextLong();
		return longnum;
	}
	
	
	
	
}
