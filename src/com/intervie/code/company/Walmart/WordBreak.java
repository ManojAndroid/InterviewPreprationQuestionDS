package com.intervie.code.company.Walmart;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {

	static Set<String> dictnary = new HashSet<String>();

	public static void main(String[] args) {
		String temp_dictionary[] = { "mobile", "samsung", "sam", "sung", "man", "mango", "icecream", "and", "go", "i",
				"like", "ice", "cream" };

		for (String value : temp_dictionary) {
			dictnary.add(value);
		}
		System.out.println(wordBreak("ilikesamsung"));
		System.out.println(wordBreak("iiiiiiii"));
		System.out.println(wordBreak(""));
		System.out.println(wordBreak("ilikelikeimangoiii"));
		System.out.println(wordBreak("samsungandmango"));
		System.out.println(wordBreak("samsungandmangok"));
	}

	static boolean wordBreak(String str) {
		int size = str.length();
		if (size == 0)
			return true;
		for (int i = 1; i <= size; i++) {
			if (dictnary.contains(str.substring(0, i))&& wordBreak(str.substring(i, size)))
				return true;
		}
		return false;

	}

}
