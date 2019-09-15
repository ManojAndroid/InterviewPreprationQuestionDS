package com.intervie.code.company.Walmart;

public class MaxKeybord {

	static int maxKey(int n) {
		int max = 0;

		if (n <= 6)
			return n;
		int b;

		for (b = n - 3; b >= 1; b--) {
			int couu = (n - b - 1) * maxKey(b);
			if (max < couu)
				max = couu;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(maxKey(7));
	}

}
