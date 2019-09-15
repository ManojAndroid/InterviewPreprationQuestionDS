package com.intervie.code.Array;

public class ReplacewithrightgretestElement {

	static void replace(int arr[], int n) {
		int right_gretest_num = arr[n - 1];

		for (int i = n - 1; i >= 0; i--) {
			if (right_gretest_num > arr[i])
				arr[i] = right_gretest_num;
			else
				right_gretest_num = arr[i];
		}
		for (Integer number : arr) {
			System.out.print(number + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 3, 4, 20, 6, 15, 2, 1, 7 };
		replace(arr, arr.length);
	}

}
