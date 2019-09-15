package com.intervie.code.company.BlackBuck;

import java.util.HashSet;
import java.util.Set;

public class findLongestSubstringwithoutduplicate {
	static int longestUniqueSubsttr(String str) {
		int maxLength = 0;
		int i = 0;
		int j = 0;
		int length = str.length();
		Set<Character> set = new HashSet<>();
		while (i < length && j < length) {
			if (!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				j++;
				maxLength = Math.max(maxLength, j - i);
			} else {
				set.remove(str.charAt(i));
				i++;
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		String str = "GEEKSFORGEEKS";
		System.out.println("The input string is " + str);
		int len = longestUniqueSubsttr(str);
		System.out.println("The length of " + "the longest non repeating character is " + len);
	}
}
