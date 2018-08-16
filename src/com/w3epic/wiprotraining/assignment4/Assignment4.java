/*
 * Given a string of even length, return the first half. So the string "CatDog" 
 * yields "Cat". If the string length is odd number then return null.
 * */
package com.w3epic.wiprotraining.assignment4;

public class Assignment4 {

	public static void main(String[] args) {
		String str = "CatDogs";
		
		String output;
		
		if (str.length() % 2 == 0) {
			output = str.substring(0, str.length() / 2);
		} else {
			output = null;
		}
		
		System.out.println(output);
	}

}
