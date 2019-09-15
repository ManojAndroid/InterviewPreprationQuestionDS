package com.intervie.code.company.Walmart;

import java.util.PriorityQueue;

public class KLargestNumber {
	static int kLargestElement(int arr[], int k) {
		PriorityQueue<Integer> q = new PriorityQueue<>(k);
		for (Integer numb : arr) {
			q.offer(numb);
			if (q.size() > k) {
				q.poll();
			}
		}
		return q.peek();
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 12, 3, 5, 7, 19 };
		int k = 2;
		System.out.print("K'th smallest element is " + kLargestElement(arr, k));
	}

}
