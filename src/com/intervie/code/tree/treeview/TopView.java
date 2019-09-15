package com.intervie.code.tree.treeview;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {
	Node root;

	void topView(Node root) {
		class QueObject {
			Node node;
			int hd;

			QueObject(Node node, int hd) {
				this.node = node;
				this.hd = hd;
			}
		}
		Queue<QueObject> que = new LinkedList<QueObject>();
		Map<Integer, Node> mp = new TreeMap<>();

		if (root == null)
			return;
		else
			que.add(new QueObject(root, 0));

		while (!que.isEmpty()) {
			QueObject tempObj = que.poll();
			if (!mp.containsKey(tempObj.hd)) {
				mp.put(tempObj.hd, tempObj.node);
			}
			if (tempObj.node.left != null) {
				que.add(new QueObject(tempObj.node.left, tempObj.hd - 1));
			}

			if (tempObj.node.right != null) {
				que.add(new QueObject(tempObj.node.right, tempObj.hd + 1));
			}
		}
		for (Map.Entry<Integer, Node> value : mp.entrySet()) {
			System.out.print(" " + value.getValue().data);
		}

	}

	public static void main(String[] args) {
		TopView tree = new TopView();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.right = new Node(4);
		tree.root.left.right.right = new Node(5);
		tree.root.left.right.right.right = new Node(6);
		System.out.println("Following are nodes in top view of Binary Tree");
		tree.topView(tree.root);
	}
}
