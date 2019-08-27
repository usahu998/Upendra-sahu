package com.bridgelabz.algorithm;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro1_Anagram {

	public static void main(String[] args) {
		System.out.println("Enter first String");
		String str1 = ScannerInput.strInput();
		System.out.println("Enter second String");
		String str2 = ScannerInput.strInput();

		boolean ans = Utility.isAnagram(str1, str2);
		if (ans)
			System.out.println("Two string are anagram");
		else
			System.out.println("Two string are not anagram");
	}
}
