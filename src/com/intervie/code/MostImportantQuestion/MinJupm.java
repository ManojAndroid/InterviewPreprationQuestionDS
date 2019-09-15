package com.intervie.code.MostImportantQuestion;

public class MinJupm {

	static int minJump(int arr[]) {
		if (arr.length <= 1)
			return 0;

		int maxReach = arr[0];
		int step = arr[0];
		int jump = 1;
		for (int i = 1; i < arr.length; i++) {
			if (i == arr.length - 1)
				return jump;

			maxReach = Math.max(maxReach, i + arr[i]);
			step--;
			if (step == 0) {
				jump++;
				if (i >= maxReach)
					return -1;
				jump = maxReach - i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		System.out.println(minJump(arr));
	}

}
