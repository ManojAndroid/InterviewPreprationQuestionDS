package com.intervie.code.company.Walmart;

public class MirrorTree {

	public static Node mirro(Node root) {
		if (root == null) {
			return root;
		}
		Node left = mirro(root.left);
		Node right = mirro(root.right);
		root.left = right;
		root.right = left;

		return root;
	}

	public static void inOrder(Node node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);

	}

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		System.out.println("befor");
		inOrder(root);
		mirro(root);
		System.out.println("after");
		inOrder(root);
	}

}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}