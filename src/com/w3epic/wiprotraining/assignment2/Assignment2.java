/*
 * Given two strings, append them together (known as "concatenation") 
 * and return the result. However, if the concatenation creates a double-char, 
 * then omit one of the chars. If the inputs are “Mark” and “Kate” then the 
 * output should be “markate”. (The output should be in lowercase)
 * */

package com.w3epic.wiprotraining.assignment2;

public class Assignment2 {

	public static void main(String[] args) {
		
		String str1 = "Mark";
		String str2 = "Kate";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		
		if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
			sb.append(str2.substring(1, str2.length()));
		} else {
			sb.append(str2);
		}
		
		System.out.println(sb);		
		
		sb.append(str1);
		
	}

}
