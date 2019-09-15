package com.intervie.code.amazon.easy;

public class BitSet {
	 static String isBit(int n)
	   {
		 //Math.sqrt(8);
		   if(n==0)
			   return "NO";
		   while(n>0)
		   {
			   if((n & 1)==0)
			   return "no";
			   n=n>>1;
		   }
		   return "yes";
	   }
	 public static void main(String[] args) {
		System.out.println(BitSet.isBit(7));
	}
}
  