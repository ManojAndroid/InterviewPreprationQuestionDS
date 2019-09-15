package com.intervie.code.DpProgram;

public class SubsetSumProblem {

	static boolean isSubSetSum(int arr[], int n, int sum) {
		boolean subset[][] = new boolean[sum + 1][n + 1];

		for (int i = 0; i <= n; i++)
			subset[0][i] = true;

		for (int j = 0; j <= n; j++)
			subset[j][0] = false;

		for (int i = 1; i <= sum; i++) {
			for (int j = 1; j <= n; j++) {
				subset[i][j] = subset[i][j - 1];
				if (i >= arr[j - 1])
					subset[i][j] = subset[i][j] || subset[i - arr[j - 1]][j - 1];
			}
		}
		return subset[sum][n];
	}

	public static void main(String args[]) {
		int set[] = { 3, 34, 4, 12, 5, 2 };
		int sum = 9;
		int n = set.length;
		if (isSubSetSum(set, n, sum) == true)
			System.out.println("Found a subset" + " with given sum");
		else
			System.out.println("No subset with" + " given sum");
	}

}
