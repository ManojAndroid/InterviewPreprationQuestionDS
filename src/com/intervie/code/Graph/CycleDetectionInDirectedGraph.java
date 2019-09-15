package com.intervie.code.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CycleDetectionInDirectedGraph {
	private int v;
	private List<List<Integer>> adj;

	public CycleDetectionInDirectedGraph(int v) {
		this.v = v;
		adj = new ArrayList<>(v);
		for (int i = 0; i < v; i++)
			adj.add(new LinkedList<>());

	}

	boolean isCycli() {
		boolean visited[] = new boolean[v];
		boolean resStack[] = new boolean[v];

		for (int i = 0; i < v; i++)
			if (isCyclic(i, visited, resStack))
				return true;
		return false;

	}

	private boolean isCyclic(int i, boolean[] visited, boolean[] resStack) {
		if (resStack[i])
			return true;

		visited[i] = true;
		resStack[i] = true;

		List<Integer> chields = adj.get(i);
		for (Integer chield : chields)
			if (isCyclic(chield, visited, resStack))
				return true;
		return false;
	}

	public void addEdge(int source, int destination) {
		adj.get(source).add(destination);
	}

	public static void main(String[] args) {
		CycleDetectionInDirectedGraph graph = new CycleDetectionInDirectedGraph(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);

		if (graph.isCycli())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't " + "contain cycle");
	}

}
