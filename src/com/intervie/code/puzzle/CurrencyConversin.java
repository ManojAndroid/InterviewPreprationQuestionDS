package com.intervie.code.puzzle;

public class CurrencyConversin {
	static void currencyConversion(int amount)
	{
		int currencyList []={ 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
		int notes[]=new int[9];
		for(int i=0;i<9;i++)
		{
			if(currencyList[i]<=amount)
			{
				notes[i]=amount/currencyList[i];
		        amount =amount-currencyList[i]*notes[i];
			}
		}
		for(int i=0;i<9;i++)
		{
			System.out.println("currencyList :" +currencyList[i]+" number"+notes[i]);
		}
	}
	
	public static void main(String[] args) {
		CurrencyConversin.currencyConversion(868);
		
	}

}
