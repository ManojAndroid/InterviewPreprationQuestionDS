package com.intervie.code.MostImportantQuestion;

import java.util.Vector;

public class knightProblem {
	static class cell {
		int x, y;
		int dist;

		public cell(int x, int y, int dis) {
			this.x = x;
			this.y = y;
			this.dist = dis;
		}
	}

	static boolean isInside(int x, int y, int n) {
		if (x >= 1 && x <= n && y >= 1 && y <= n)
			return true;
		return false;
	}

	static int minStepToReachTarget(int knightPosition[], int targetPosition[], int n) {
		int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
		int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
		Vector<cell> q = new Vector<>();
		q.add(new cell(knightPosition[0], knightPosition[1], 0));
		cell t;
		int x, y;
		boolean visited[][] = new boolean[n + 1][n + 1];
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++)
				visited[i][j] = false;

		visited[knightPosition[0]][knightPosition[1]] = true;
		while (!q.isEmpty()) {
			t = q.firstElement();
			q.remove(0);

			if (t.x == targetPosition[0] && t.y == targetPosition[1])
				return t.dist;

			for (int i = 0; i < 8; i++) {
				x = t.x + dx[i];
				y = t.y + dy[i];
				if (isInside(x, y, n) && !visited[x][y]) {
					visited[x][y] = true;
					q.add(new cell(x, y, t.dist + 1));
				}
			}
		}
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		int N = 30;
		int knightPos[] = { 1, 1 };
		int targetPos[] = { 30, 30 };
		System.out.println(minStepToReachTarget(knightPos, targetPos, N));
	}

}
