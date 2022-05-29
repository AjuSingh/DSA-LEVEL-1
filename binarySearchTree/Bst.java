package binarySearchTree;

import java.util.*;

import binarytree.BinaryTree.Node;

public class Bst {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Node root = construct(arr, 0, arr.length - 1);
		display(root);
	}

	static void display(Node node) {
		if (node == null)
			return;
		System.out.println(node.data);
		display(node.left);
		display(node.right);
	}

	static Node construct(int[] arr, int l, int h) {
		// special property of bst is that in inorder the array is sorted so we will
		// take advantage of that
		if (l > h)
			return null;

		int mid = l + (h - l) / 2;
		Node node = new Node(arr[mid]);
		node.left = construct(arr, l, mid - 1);
		node.right = construct(arr, mid + 1, h);
		return node;
	}

	// we will define range in which the current node need to be within
	// initial range will be the -infinity to infinity
	// while moving left we need to change the max because the node need to be
	// within that range
	// while moving right we need to change the min because the node need to be
	// smaller that that
	static boolean isBst(Node node, int min, int max) {
		if (node == null)
			return true;

		if (node.data <= min || node.data >= max)
			return false;
		return isBst(node.left, min, node.data) && isBst(node.right, node.data, max);
	}

	public static int lca(Node node, int d1, int d2) {
		if (node == null)
			return 0;

		// here we need to find the path where both will be change their paths
		if (node.data < d1 && node.data < d2) {
			// follows same path
			return lca(node.right, d1, d2);
		} else if (node.data > d1 && node.data > d2) {
			// follow same path to left
			return lca(node.left, d1, d2);
		} else {
			// here path changes as they are required to get another direction
			return node.data;
		}
	}

	static void tsp(Node node, int x, Node root) {
		if (node == null)
			return;

		tsp(node.left, x, root);
		int left = x - node.data;
		if (node.data < left && findNode(root, left) && node.data != left) {
			System.out.println(node.data + " " + left);
		}
		tsp(node.right, x, root);
	}

	public static boolean findNode(Node node, int data) {
		if (node == null)
			return false;

		if (node.data < data) {
			return findNode(node.right, data);
		} else if (node.data > data) {
			return findNode(node.left, data);
		} else {
			return true;
		}
	}

	public static Node remove(Node node, int data) {
		// we have three case in case of removal
		// having no child simply delete it
		// having one child just point to its next
		// having two child then find max from the left side and put the value in
		// current node
		// then again recursively find that node and delete it
		if (node == null)
			return null;
		if (node.data == data) {
			if (node.left == null && node.right == null) {
				return null;
			} else if (node.left == null || node.right == null) {
				return node.left == null ? node.right : node.left;
			} else {
				int getMax = max(node.left, Integer.MIN_VALUE);
				node.data = getMax;
				node.left = remove(node.left, getMax);
			}
		}

		if (node.data > data) {
			node.left = remove(node.left, data);
		} else {
			node.right = remove(node.right, data);
		}
		return node;
	}

	public static int max(Node node, int max) {
		if (node == null)
			return max;
		return max(node.right, node.data);
	}

	// print in range we need to print the data in the given range
	public static void pir(Node node, int d1, int d2) {
		if (node == null)
			return;

		// we have four conditions let say left =35 and right = 65
		// condition 1 data<35 && data<65
		// condition 2 data>35 && data>65
		// condition 3 data<35 && data>65 it is not possible as it can be one at one
		// time
		// condition 4 data>35 && data<65 satisfying the range so it is desired
		// candidate

		if (node.data < d1 && node.data < d2) {
			// if the data is smaller then both
			pir(node.right, d1, d2);
		} else if (node.data > d1 && node.data > d2) {
			// if the data is greater than both
			pir(node.left, d1, d2);
		} else {
			// here is in the range but we need to check on left first to maintain soritng
			// order
			pir(node.left, d1, d2);
			System.out.println(node.data);
			pir(node.right, d1, d2);
		}
	}

}
