/*
 * Given a string and a non-empty word string, return a string made of each 
 * char just before and just after every appearance of the word in the string. 
 * Ignore cases where there is no char before or after the word, and a char 
 * may be included twice if it is between two words.
 * 	If inputs are "abcXY123XYijk" and "XY", output should be "c13i".
 * 	If inputs are "XY123XY" and "XY", output should be "13".
 * 	If inputs are "XY1XY" and "XY", output should be "11".
 * */

package com.w3epic.wiprotraining.assignment13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment13 {

	public static void main(String[] args) {
		String str1 = "abcXY123XYijk"; // "XY123XY"
		String str2 = "XY";
		
		StringBuffer sb = new StringBuffer();
		
		while (str1.indexOf(str2) != -1) {	
			int index = str1.indexOf(str2);
			
			if (index == 0 && index + str2.length() < str1.length() - 1) {
				sb.append(str1.charAt(index + str2.length()));
				str1 = str1.replaceFirst(str2, "");
				continue;
			}
			
			if (index - 1 >= 0 && index + str2.length() >= str1.length()) {
				sb.append(str1.charAt(index - 1));
				str1 = str1.replaceFirst(str2, "");
				continue;
			}
			
			if (index + str2.length() < str1.length() - 1 && index - 1 >= 0) {
				sb.append(str1.charAt(index - 1));
				sb.append(str1.charAt(index + str2.length()));
				str1 = str1.replaceFirst(str2, "");
			}
		}

		System.out.println(sb);
	}

}
