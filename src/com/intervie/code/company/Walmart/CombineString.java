package com.intervie.code.company.Walmart;

public class CombineString {
	static String merge(String str1, String str2) {
		StringBuilder result = new StringBuilder();
		int i = 0, j = 0;
		while (i < str1.length() && j < str2.length()) {
			result.append(str1.charAt(i++));
			result.append(str2.charAt(j++));
		}
		if (i != str1.length())
			result.append(str1.substring(i));
		if (j != str2.length())
			result.append(str2.substring(j));
		return result.toString();
	}
public static void main(String[] args) {
	String s1 = "geeks"; 
    String s2 = "forgeeks"; 
    System.out.println(merge(s1, s2)); 
}
}
