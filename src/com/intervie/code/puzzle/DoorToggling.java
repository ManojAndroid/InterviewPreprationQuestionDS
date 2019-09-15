package com.intervie.code.puzzle;

public class DoorToggling {

	static void toggling() {
		int dooSize = 101;
		boolean doors[] = new boolean[dooSize];
		for (int student_id = 1; student_id < dooSize; student_id++)
			for (int doorNum = 1; doorNum < dooSize; doorNum++)
				if (doorNum % student_id == 0)
					doors[doorNum] = !doors[doorNum];
		for (int i = 1; i < dooSize; i++)
			if (doors[i])
				System.out.println(i);
	}

	public static void main(String[] args) {
		toggling();
	}

}
