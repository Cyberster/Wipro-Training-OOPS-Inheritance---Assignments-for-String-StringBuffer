/*
 * Return a version of the given string, where for every star (*) in the 
 * string the star and the chars immediately to its left and right are gone. 
 * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 * */

package com.w3epic.wiprotraining.assignment9;

public class Assignment9 {

	public static void main(String[] args) {
		String str = "ab*cd";
		
		String[] strs = str.split(".[\\*]+.");
		
		StringBuffer sb = new StringBuffer();
		
		for (String x : strs)
			sb.append(x);
		
		System.out.println(sb);

	}

}
