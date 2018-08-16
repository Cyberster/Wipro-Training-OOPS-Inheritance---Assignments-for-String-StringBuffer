/*
 * Given two strings, a and b, create a bigger string made of the first char 
 * of a, the first char of b, the second char of a, the second char of b, 
 * and so on. Any leftover chars go at the end of the result.
 * If the inputs are "Hello" and "World", then the output is "HWeolrllod".
 * */

package com.w3epic.wiprotraining.assignment10;

public class Assignment10 {

	public static void main(String[] args) {
		String a = "Helloo";
		String b = "World123abc";

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
