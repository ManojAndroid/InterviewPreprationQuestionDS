package com.intervie.code.MostImportantQuestion;

public class PrintAllSubstringofGivenString {
	static void printString(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length() - 1; j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

	public static void main(String[] args) {
		printString("abcd");
	}

}
