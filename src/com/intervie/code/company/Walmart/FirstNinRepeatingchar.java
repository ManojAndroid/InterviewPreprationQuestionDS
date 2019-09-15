package com.intervie.code.company.Walmart;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNinRepeatingchar {
	
	public static char firstNonReopeating(String str)
	{
		Map<Character,Integer> count=new LinkedHashMap<>();
		for(char ch:str.toCharArray())
		{
			count.put(ch, count.containsKey(ch)? count.get(ch)+1:1);
			
		}
		for(Map.Entry<Character,Integer> entry:count.entrySet()){
			if(entry.getValue()==1)
				return entry.getKey();
		}
		return '\1';
	}
	public static void main(String[] args) {
		System.out.print(firstNonReopeating( "geeksforgeeks"));
	}

}
