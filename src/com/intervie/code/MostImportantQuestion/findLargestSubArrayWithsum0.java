package com.intervie.code.MostImportantQuestion;

import java.util.HashMap;
import java.util.Map;

public class findLargestSubArrayWithsum0 {

	static int maxLength(int arr[]) {
		int sum = 0;
		int max_len = 0;

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			/*if (arr[i] == 0 && max_len == 0)
				max_len = 1;
			if (sum == 0)
				max_len = i + 1;*/
			Integer prev = map.get(sum);
			if (prev != null)
				max_len = Math.max(max_len, i - prev);
			else
				map.put(sum, i);
		}
		return max_len;
	}

	public static void main(String[] args) {
		int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
		System.out.println("Length of the longest 0 sum subarray is " + maxLength(arr));
	}

}
