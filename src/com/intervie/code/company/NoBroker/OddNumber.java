package com.intervie.code.company.NoBroker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OddNumber {
	static int number(List<Integer> badNumber, int l, int r) {
		Collections.sort(badNumber);

		int testNumber = 0;
		int difference = 0;
		int max = 0;
		int left = l;
		int right = 0;
		for (int i = 0; i < badNumber.size(); i++) {
			testNumber = badNumber.get(i);
			if (l < testNumber && r > testNumber) {
				left = l;
				right = testNumber - 1;
				difference = right - left;
				if (difference > max)
					max = difference;

			}
			l = right + 2;
		}
		if (l < r && l > testNumber)
			return (r - l);
		return max;
	}

	public static void main(String[] args) {
		List<Integer> badNumber = Arrays.asList(1, 3, 7, 10);
		// System.out.println(badNumber.contains(7));
		System.out.println(OddNumber.number(badNumber, 0, 20));
	}

}
