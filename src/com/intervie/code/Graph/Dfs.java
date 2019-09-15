package com.intervie.code.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Dfs {
	private int V;
	private LinkedList<Integer> adj[];

	@SuppressWarnings("unchecked")
	public Dfs(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	void addEdge(int v, int E) {
		adj[v].add(E);
	}

	void dfsTraversal(int s, boolean visited[]) {
		visited[s] = true;
		System.out.println(s + "");
		Iterator<Integer> i = adj[s].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n]) {
				dfsTraversal(n, visited);
			}

		}

	}

	void dfs(int s) {
		boolean visited[] = new boolean[V];
		dfsTraversal(s, visited);
	}

	public static void main(String[] args) {
		Dfs g = new Dfs(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");

		g.dfs(2);

	}

}
