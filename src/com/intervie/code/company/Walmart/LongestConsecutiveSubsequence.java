package com.intervie.code.company.Walmart;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {
	static int findLongestConseqSubseq(int arr[], int n) {
		int ans = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++)
			set.add(arr[i]);

		for (int i = 0; i < n; i++) {
			if (!set.contains(arr[i] - 1)) {
				int j = arr[i];
				while (set.contains(j))
					j++;
				if (ans < j - arr[i])
					ans = j - arr[i];

			}
		}
		return ans;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 9, 11, 10, 4, 20, 7 };
		int n = arr.length;
		System.out.println("Length of the Longest consecutive subsequence is " + findLongestConseqSubseq(arr, n));
	}

}
