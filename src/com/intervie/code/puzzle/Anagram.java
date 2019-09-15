package com.intervie.code.puzzle;

import java.util.Arrays;
import java.util.List;

public class Anagram {
	static boolean checkAnagram(String str1,String str2)
	{
		int n1=str1.length();
		int n2=str2.length();
		if(n1!=n2)
			return false;
		Arrays.sort(str1.toCharArray());
		Arrays.sort(str2.toCharArray());
		for(int i=0;i<n1;i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s1="manoj";
		String s2="jonam";
		System.out.println(checkAnagram(s1,s2));
	}

}
