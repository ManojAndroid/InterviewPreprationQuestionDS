package com.intervie.code.MostImportantQuestion;

public class SumTree {

	Node root;

	int sumTree(Node node) {
		if (node.left == null || node.right == null )
			return node.data;
		
		int old_data = node.data;
		node.data = sumTree(node.left) + sumTree(node.right);
		return old_data + node.data;

	}

	void printInorder(Node node) {
		if (node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}

	public static void main(String[] args) {
		SumTree tree = new SumTree();
		tree.root = new Node(10);
		tree.root.left = new Node(-2);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(8);
		tree.root.left.right = new Node(-4);
		tree.root.right.left = new Node(7);
		tree.root.right.right = new Node(5);

		tree.sumTree(tree.root);
		tree.printInorder(tree.root);
	}

}

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;

	}
}
