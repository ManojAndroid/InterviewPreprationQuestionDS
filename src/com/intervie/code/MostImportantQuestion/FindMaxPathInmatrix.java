package com.intervie.code.MostImportantQuestion;

public class FindMaxPathInmatrix {
	static int findPath(int m, int n) {
		/*
		 * int count[][] = new int[m][n]; for (int i = 0; i < m; i++)
		 * count[i][0] = 1; for (int j = 0; j < m; j++) count[0][j] = 1;
		 * 
		 * for (int i = 1; i < m; i++) { for (int j = 1; j < n; j++) {
		 * count[i][j] = count[i - 1][j] + count[i][j - 1]; } } return count[m -
		 * 1][n - 1];
		 */
		int[] dp = new int[n];
		dp[0] = 1;

		for (int i = 0; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[j] += dp[j - 1];
			}
		}

		return dp[n - 1];

	}

	public static void main(String[] args) {
		System.out.println(findPath(3, 3));
	}

}
