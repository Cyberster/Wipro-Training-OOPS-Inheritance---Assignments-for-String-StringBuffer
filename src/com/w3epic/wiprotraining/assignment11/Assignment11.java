/*
 * Given two strings, a and b, create a bigger string made of the first char of a, 
 * the first char of b, the second char of a, the second char of b, and so on. Any 
 * leftover chars go at the end of the result. If input is “abc” and “xyz”, then 
 * output should be “axbycz”.
 * */

package com.w3epic.wiprotraining.assignment11;

public class Assignment11 {

	public static void main(String[] args) {
		String a = "abc";
		String b = "xyz";
		
		String bigger = a.length() > b.length() ? a : b;
		String smaller = a.length() < b.length() ? a : b;

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < smaller.length(); i++) {
			sb.append(a.charAt(i)).append(b.charAt(i));
		}
		
		sb.append(bigger.substring(smaller.length(), bigger.length()));
		
		System.out.println(sb);
	}

}
