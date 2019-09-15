package com.intervie.code.company.NoBroker;

import java.util.Arrays;
import java.util.List;

public class MinimuSum {
	public static int minSum(List<Integer> num,int k)
	{
		if(num==null|| k<1)
			return -1;
		int [] converteArray=new int[num.size()];
		for(int i=0;i<converteArray.length;i++)
		{
			converteArray[i]=num.get(i);
		}
		Arrays.sort(converteArray);
		
		for(int j=1;j<=k;j++)
		{
			int halfNumber=(int)Math.round((double)converteArray[converteArray.length-1]/2);
			converteArray[converteArray.length-1]=halfNumber;
			Arrays.sort(converteArray);
		}
		int munSum=0;
		for(int i=0;i<converteArray.length;i++)
		{
			munSum= munSum+converteArray[i];
		}
		return munSum;
	}
	public static void main(String[] args) {
		System.out.println(MinimuSum.minSum(Arrays.asList(10,20,7), 4));
	}

}
