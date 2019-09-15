package com.intervie.code.tree.treeview;

public class RightView {
	Node root;
	int max_level = 0;

	void rightViewUtil(Node root, int level) {
		if (root == null)
			return;
		if (max_level < level) {
			System.out.print(" " + root.data);
			max_level = level;
		}
		rightViewUtil(root.right, level + 1);
		rightViewUtil(root.left, level + 1);
	}

	void rightView() {
		rightViewUtil(root, 1);
	}

	public static void main(String[] args) {
		RightView leftView = new RightView();
		leftView.root = new Node(12);
		leftView.root.left = new Node(10);
		leftView.root.right = new Node(30);
		leftView.root.right.left = new Node(25);
		leftView.root.right.right = new Node(40);
		leftView.rightView();
	}

}
