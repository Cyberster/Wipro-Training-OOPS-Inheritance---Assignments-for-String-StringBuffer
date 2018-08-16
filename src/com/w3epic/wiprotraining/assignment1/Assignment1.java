/*
 *  Write a Program that will check whether a given String is Palindrome or not
 * */

package com.w3epic.wiprotraining.assignment1;

public class Assignment1 {
	
	public static boolean isPalindrome (String input1) {
		int digitCount = input1.length();
		boolean isPalindrome = true;
		
		int range = digitCount / 2;
		if (digitCount % 2 == 0) range--;
		
		for (int i = 0; i <= range; i++) {
			if (input1.charAt(i) != input1.charAt(digitCount - i - 1)) isPalindrome = false;
		}
		
		return isPalindrome;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("MADAM"));
		System.out.println(isPalindrome("MOM"));
		System.out.println(isPalindrome("MOTHER"));

	}

}
