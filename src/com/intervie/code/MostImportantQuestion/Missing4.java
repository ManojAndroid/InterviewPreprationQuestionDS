package com.intervie.code.company.MyGate;

public class Missing4 {
	public static void missing4(int[] arr, int n) {
		boolean[] visited = new boolean[n + 3];

		for (int i = 0; i < arr.length; i++) {
			visited[arr[i] - 1] = true;
		}

		for (int i = 0; i < visited.length; i++) {
			if (!visited[i])
				System.out.println(i + 1);
		}

	}

	public static void main(String[] args) {
		int arr[] = { 7,9,1, 2, 3, 4, 5, 7};
		missing4(arr, arr.length);
	}

}
