package com.intervie.code.company.MyGate;

public class findClosettoZero {
	static int closest(int[] array) {

		int num = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] < num) {
				num = array[i];

			}

		}

		return num;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 11, 1, 3, 4, 4, 4, 4, 9 };
		System.out.println(closest(arr));
	}

}
