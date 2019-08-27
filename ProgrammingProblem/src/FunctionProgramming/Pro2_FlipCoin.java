package com.brideglabz.functionprogramming;



import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro2_FlipCoin {

	public static void main(String[] args) {
		float percentH, percentT;
		int countHead,countTail;
		
		System.out.println("how mant times you want to flip the coin Enter positive number");
		int noOfTimes = ScannerInput.intInput();

		int[] count=Utility.flipCoin(noOfTimes);
		countHead=count[0];
		countTail=count[1];

		System.out.println("Number of head = " + countHead);
		System.out.println("Number of tail = " + countTail);

		percentH = (countHead * 100) / noOfTimes;
		percentT = (countTail * 100) / noOfTimes;

		System.out.println("Percent of head " + percentH + " Percent of Tail" + percentT);
	}
}
