package com.intervie.code.company.Walmart;

public class MaxMumPath {

	static int maxPathh(int m, int n) {
		int count[][] = new int[m][n];

		for (int i = 0; i < m; i++)
			count[i][0] = 1;

		for (int j = 0; j < n; j++)
			count[0][j] = 1;

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				count[i][j] = count[i][j - 1] + count[j - 1][i];
			}
		}

		return count[m - 1][n - 1];

	}

	public static void main(String args[]) {
		System.out.println(maxPathh(3, 3));
	}

}
