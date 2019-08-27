package com.brideglabz.functionprogramming;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro8_CoupenNumber {
	public static void main(String[] args) {
		System.out.println("Enter number of coupon");
		int coupon = ScannerInput.intInput();

		int ar[] = Utility.generateCoupon(coupon);
		System.out.println("coupen number");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
