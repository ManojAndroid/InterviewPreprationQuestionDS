package com.intervie.code.MostImportantQuestion;

public class Sort102 {
	static void sort(int arr[]) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		int middle = 0;

		while (high >= middle) {
			switch (arr[middle]) {
			case 0:
				{int temp = arr[middle];
				arr[middle] = arr[low];
				arr[low] = temp;
				low++;
				middle++;
				break;
				}
			case 1:
				middle++;
				break;

			case 2:
			{
				int tema = arr[middle];
				arr[middle] = arr[high];
				arr[high] = tema;
				high--;
				break;
			}

			}
		}
	}
	static void printArray(int arr[]) 
    { 
        int i; 
        for (i = 0; i < arr.length; i++) 
            System.out.print(arr[i]+" "); 
        System.out.println(""); 
    } 

	public static void main(String[] args) {
		 int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}; 
	        sort(arr); 
	        System.out.println("Array after seggregation "); 
	        printArray(arr);
	}

}
