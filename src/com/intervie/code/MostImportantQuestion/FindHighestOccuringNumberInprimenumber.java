package com.intervie.code.MostImportantQuestion;

import java.util.Arrays;

public class FindHighestOccuringNumberInprimenumber {
	static void sieve(boolean prime[], int n) {

		for (int p = 2; p * p <= n; p++) {
			if (prime[p] == false)
				for (int i = p * 2; i <= n; i += p)
					prime[i] = true;
		}
	}

	static int maxDigitInPrimes(int L, int R) {

		boolean prime[] = new boolean[R + 1];
		sieve(prime, R);
		int freq[] = new int[10];
		for (int i = L; i <= R; i++) {

			if (!prime[i]) {
				int p = i;

				while (p > 0) {
					freq[p % 10]++;
					p /= 10;
				}
			}
		}

		int max = freq[0], ans = 0;
		for (int j = 1; j < 10; j++) {
			if (max <= freq[j]) {
				max = freq[j];
				ans = j;
			}
		}

		return ans;
	}
	public static void main(String[] args) {
		int L = 1, R = 20;
		System.out.println(maxDigitInPrimes(L, R));
	}

}
