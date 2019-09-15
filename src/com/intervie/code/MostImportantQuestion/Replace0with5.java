package com.intervie.code.MostImportantQuestion;

public class Replace0with5 {
	static int replace(int number) {
		if (number == 0)
			return 0;
		int temp = number % 10;
		if (temp == 0)
			temp = 5;

		return replace(number / 10) * 10 + temp;
	}

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("number" + Replace0with5.replace(2020));
	}

}
