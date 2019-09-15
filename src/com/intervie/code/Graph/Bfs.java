package com.intervie.code.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Bfs {
	private int V;
	private LinkedList<Integer> adj[];

	@SuppressWarnings("unchecked")
	public Bfs(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<>();

		}
	}

	void addEdge(int v, int E) {
		adj[v].add(E);
	}

	void bfsTraversal(int s) {
		boolean visited[] = new boolean[V];
		LinkedList<Integer> qu = new LinkedList<>();

		visited[s] = true;
		qu.add(s);
		while (qu.size() != 0) {
			s = qu.poll();
			System.out.println(s + "");
			Iterator<Integer> i = adj[s].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    qu.add(n); 
                } 
            } 
		}
	}

	public static void main(String[] args) {
		Bfs bfs = new Bfs(4);
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 0);
		bfs.addEdge(2, 3);
		bfs.addEdge(3, 3);
		System.out.println("Following is Breadth First Traversal "+ 
                "(starting from vertex 2)"); 

		bfs.bfsTraversal(2); 
	}

}
