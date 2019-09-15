package com.intervie.code.company.MyGate;

import java.util.Stack;

public class FindNGE {
	public static void findNextGraterElement(int arr[], int n) {
		Stack<Integer> stack = new Stack<Integer>();
		int arr1[] = new int[n];

		for (int i = n - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= arr[i])
				stack.pop();
			if (stack.empty())
				arr1[i] = arr[i];
			else
				arr1[i] = stack.peek();
			stack.push(arr[i]);
		}
		for (int i = 0; i < n; i++)
			System.out.println(arr[i] + " ---> " + arr1[i]);

	}

	public static void main(String[] args) {
		int arr[] = { 11, 13, 21, 3 };
		int n = arr.length;
		findNextGraterElement(arr, n);
	}
}
