package com.intervie.code.MostImportantQuestion;

public class HighestPowerOft2 {
	static int highestPowerof2(int n) 
	{ 
	      
	    int p=(int)(Math.log(n)/Math.log(2)) ;
	    return (int)Math.pow(2, p);
	}
	public static void main(String[] args) {
		System.out.println(highestPowerof2(10));
	}

}
