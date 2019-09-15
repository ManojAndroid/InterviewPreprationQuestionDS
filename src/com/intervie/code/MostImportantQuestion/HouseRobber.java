package com.intervie.code.MostImportantQuestion;

public class HouseRobber {
	static int maxValue(int hvalue[],int n)
	{
		if(n==0) 
			return 0;
		int value1=hvalue[0];
		if(n==1)
			return value1;
		int value2=Math.max(hvalue[0],hvalue[1]);
		if(n==2)
			return value2;
		
		 int max_val = 0;
		for(int i=2;i<n;i++)
		{
			max_val=Math.max(hvalue[i]+value1, value2);
			value1=value2;
			value2=max_val;
		}
		return max_val;
	}
	public static void main(String[] args)  { 
        int hval[] = {6, 7, 1, 3, 8, 2, 4}; 
        int n = hval.length; 
        System.out.println("Maximum loot value : " + maxValue(hval, n)); 
    }

}
