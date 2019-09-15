package com.intervie.code.MostImportantQuestion;

import java.util.ArrayList;
import java.util.List;

public class StockBuySell {
	static void sotckAndBuyCell(int price[], int n) {
		if (n == 1)
			return;
		int count = 0;
		List<Interval> intervals = new ArrayList<>();

		int i = 0;
		while (i < n - 1) {
			while (i < n - 1 && price[i + 1] <= price[i])
				i++;
			if (i == n - 1)
				break;
			Interval interval = new Interval();
			interval.buy = i++;

			while (i < n && price[i] >= price[i-1])
				i++;
			interval.sell = i - 1;
			count++;
			intervals.add(interval);

		}
		if (count == 0)
			System.out.println("There is no day when buying the stock " + "will make profit");
		else
			for (int j = 0; j < count; j++)
				System.out.println(
						"Buy on day: " + intervals.get(j).buy + "        " + "Sell on day : " + intervals.get(j).sell);

		return;
	}

	public static void main(String[] args) {
		StockBuySell stock = new StockBuySell();

		// stock prices on consecutive days
		int price[] = { 100, 180, 260, 310, 40, 535, 695 };
		int n = price.length;

		// fucntion call
		sotckAndBuyCell(price, n);
	}

}

class Interval {
	int buy, sell;
}
