package com.bridgelabz.data_structure;

import java.util.Scanner;

import com.bridgelabz.data_structure.utility.Queue;
import com.bridgelabz.utility.Utility;

public class Pro9_CalanderQueue 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue q = new Queue(100);

		String[] months = { "", "January", "February", "March", "April", "May", " June", "July", "August", "September",
				"October", "November", "December" };
		int[] date = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("Enter Date mm/dd/yyyy ");
		int month =sc.nextInt();
		int d = sc.nextInt();
		int year = sc.nextInt();

		if (month == 2 && Utility.isLeapYear(year)) {
			date[month] = 29;
		}

		int day = Utility.day(month, 1, year);
		int arr[][] = new int[6][7];
		int x = 1;

		for (int i = 0; i < 6; i++) {
			for (int j = day; j < 7; j++) {
				if (x <= date[month]) {
					arr[i][j] = x;
					x++;

				}
			}
			day = 0;
		}
		System.out.println("  " + months[month] + " " + d + " " + year);
		System.out.println("  Su  Mon Tue Wed Thu Fri Sat");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {

				if (arr[i][j] != 0) {
					System.out.printf("%4d", arr[i][j]);

					q.enqueue(arr[i][j]);
				} else
					System.out.printf("    ");
			}
			System.out.println();
		}

	}


}
