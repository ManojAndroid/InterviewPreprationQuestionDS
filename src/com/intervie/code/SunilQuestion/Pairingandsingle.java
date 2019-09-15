package com.intervie.code.SunilQuestion;

import java.util.HashMap;
import java.util.Map;

public class Pairingandsingle {
	static void checkPair(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.containsKey(arr[i]) ? map.get(arr[i]) + 1 : 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1)
				System.out.println("pair is not available " + entry.getKey());
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5 };
		checkPair(arr);
	}

}
