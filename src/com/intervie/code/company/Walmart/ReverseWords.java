package com.intervie.code.company.Walmart;

import java.util.regex.Pattern;

public class ReverseWords {

	static String reverse(String str) {
		Pattern pattern = Pattern.compile("\\s");

		String[] charArray = pattern.split(str);
		String result = "";
		for (int i = 0; i < charArray.length; i++) {
			result = " "+charArray[i] + result;
		}
		return result;
	}
	public static void main(String[] args) {
		String s1 = "Welcome to geeksforgeeks"; 
        System.out.println(reverse(s1)); 
  
        String s2 = "I love Java Programming"; 
        System.out.println(reverse(s2)); 
	}

}
