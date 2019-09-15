package com.intervie.code.tree.treeview;

public class LeftView {
	Node root;
	int max_level = 0;

	void leftViewUtil(Node root, int level) {
		if (root == null)
			return;
		if (max_level < level) {
			System.out.print(" " + root.data);
			max_level = level;
		}
		leftViewUtil(root.left, level + 1);
		leftViewUtil(root.right, level + 1);
	}

	void leftView() {
		leftViewUtil(root, 1);
	}

	public static void main(String[] args) {
		LeftView leftView = new LeftView();
		leftView.root = new Node(12);
		leftView.root.left = new Node(10);
		leftView.root.right = new Node(30);
		leftView.root.right.left = new Node(25);
		leftView.root.right.right = new Node(40);
		leftView.leftView();
	}

}

class Node {
	int data;
	Node left, right;

	public Node(int d) {
		this.data = d;
		this.left = this.right = null;
	}
}
