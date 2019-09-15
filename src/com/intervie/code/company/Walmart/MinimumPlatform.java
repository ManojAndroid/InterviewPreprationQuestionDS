package com.intervie.code.company.Walmart;

import java.util.Arrays;

public class MinimumPlatform {
	static int minimumPlatform(int arr[],int dep[],int n)
	{
		Arrays.sort(arr);
		Arrays.sort(dep);
		int result=1;
		int neede=1;
		int i=1,j=0;
		while(i<n&&j<n)
		{
			if(arr[i]<=dep[j])
			{
				neede++;
			i++;
			
			if(result<neede)
				result=neede;
			}
			else
			{
				neede--;
				j++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[] = {900, 940, 950, 1100, 1500, 1800}; 
	    int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; 
	    int n = arr.length; 
	    System.out.println("Minimum Number of Platforms Required = "
	                        + minimumPlatform(arr, dep, n)); 
	}
	

}
