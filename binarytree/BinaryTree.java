package binarytree;

import java.util.*;

public class BinaryTree {

	public static void main(String[] args) {
		Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
				null };
		Node root = construct(arr);
//		display(root);
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		postorder(root);
	}

	public static class Pair {
		Node node;
		int state;

		Pair(Node node, int state) {
			this.node = node;
			this.state = state;
		}
	}

	static class Node {
		Node right;
		Node left;
		int data;

		Node(Node left, Node right, int data) {
			this.left = left;
			this.right = right;
			this.data = data;
		}
	}


	public static Node removeLeaves(Node node) {
		if (node == null)
			return null;
		if (node.left == null && node.right == null)
			return null;

		Node left = removeLeaves(node.left);
		Node right = removeLeaves(node.right);
		node.left = left;
		node.right = right;
		return node;
	}

	static Node construct(Integer[] arr) {
		Node node = new Node(null, null, arr[0]);
		Stack<Pair> stack = new Stack<>();
		stack.push(new Pair(node, 0));
		int ind = 1;
		while (!stack.empty()) {
			Pair peek = stack.peek();
			if (peek.state == 0) {
				if (arr[ind] != null) {
					Node temp = new Node(null, null, arr[ind]);
					peek.node.left = temp;
					stack.add(new Pair(temp, 0));
				}
				peek.state++;
				ind++;
			} else if (peek.state == 1) {
				if (arr[ind] != null) {
					Node temp = new Node(null, null, arr[ind]);
					peek.node.right = temp;
					stack.add(new Pair(temp, 0));
				}
				peek.state++;
				ind++;
			} else {
				stack.pop();
			}
		}
		return node;
	}

	public static ArrayList<Node> ntr(Node node, int data) {
		if (node == null)
			return new ArrayList<>();
		if (node.data == data) {
			ArrayList<Node> list = new ArrayList<>();
			list.add(node);
			return list;
		}

		ArrayList<Node> list = ntr(node.left, data);
		if (list.size() > 0) {
			list.add(node);
			return list;
		}

		ArrayList<Node> list1 = ntr(node.right, data);
		if (list1.size() > 0) {
			list1.add(node);
			return list1;
		}

		return new ArrayList<>();
	}

	public static void printKNodesFar(Node node, int data, int k) {
		ArrayList<Node> ntr = ntr(node, data);
		for (int i = 0; i < ntr.size() && k >= 0; i++, k--) {
			if (i == 0) {
				printAtK(ntr.get(i), new Node(null, null, Integer.MIN_VALUE), k);
			} else {
				printAtK(ntr.get(i), ntr.get(i - 1), k);
			}
		}
	}

	public static Node add(Node node, int data) {

		if (node == null)
			return new Node(null, null, data);

		if (data < node.data) {
			node.left = add(node.left, data);
		} else {
			node.right = add(node.right, data);
		}
		return node;

	}

	public static void printAtK(Node node, Node blocker, int k) {
		if (node == blocker || node == null)
			return;

		printAtK(node.left, blocker, k - 1);
		printAtK(node.right, blocker, k - 1);
		if (k == 0)
			System.out.println(node.data);
	}

	static void display(Node root) {
		if (root == null)
			return;
		System.out.println(root.data);
		display(root.left);
		display(root.right);
	}


	public static int size(Node node) {
		// write your code here
		if (node == null)
			return 0;
		int sum = 0;
		sum += size(node.left);
		sum += size(node.right);
		return sum + 1;
	}

	public static int sum(Node node) {
		// write your code here
		if (node == null)
			return 0;
		int sum = node.data;
		sum += sum(node.left);
		sum += sum(node.right);
		return sum;
	}

	public static int max(Node node) {
		if (node == null)
			return Integer.MIN_VALUE;
		int max = Math.max(node.data, Math.max(max(node.left), max(node.right)));
		return max;
	}

	public static int height(Node node) {
		// write your code here
		if (node == null)
			return 0;

		int left = height(node.left);
		int right = height(node.right);
		return Math.max(left, right) + 1;
	}

	static void preorder(Node root) {
		if (root == null)
			return;
		// NLR
		// data left right
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}

	static void inorder(Node root) {
		// left data right
		if (root == null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}

	static void postorder(Node root) {
		// left right data
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}

	public static void levelOrder(Node node) {
		Queue<Node> qu = new LinkedList<>();
		qu.add(node);
		while (qu.size() > 0) {
			int curSize = qu.size();
			while (curSize-- > 0) {
				Node peek = qu.remove();
				System.out.print(peek.data + " ");
				if (peek.left != null)
					qu.add(peek.left);
				if (peek.right != null)
					qu.add(peek.right);
			}
			System.out.println();
		}
	}

	public static void pathToLeafFromRoot(Node node, String path, int sum, int lo, int hi) {
		if (node == null)
			return;
		if (node.left == null && node.right == null) {
			sum += node.data;
			if (sum >= lo && sum <= hi) {
				System.out.println(path + node.data + " ");
			}
			return;
		}

		pathToLeafFromRoot(node.left, path + node.data + " ", sum + node.data, lo, hi);
		pathToLeafFromRoot(node.right, path + node.data + " ", sum + node.data, lo, hi);
	}

	public static Node createLeftCloneTree(Node node) {
		if (node == null)
			return null;

		// post order work is done because at the end we create new node and attack to
		// the upper answer
		Node left = createLeftCloneTree(node.left);
		Node right = createLeftCloneTree(node.right);

		Node newNode = new Node(left, null, node.data);
		node.left = newNode;
		return node;
	}

	static boolean isBalanced = true;

	static int heightBal(Node node) {
		// this method because we need to find the gap between longest height at left
		// and longest on right
		if (node == null)
			return 0;
		int left = height(node.left);
		int right = height(node.right);
		if (Math.abs(left - right) > 1) {
			isBalanced = false;
			return 0;
		}

		return Math.max(left, right) + 1;

	}

	static void printSingleChildNode(Node node) {
		if (node == null)
			return;

		if (node.left == null && node.right != null) {
			System.out.println(node.right.data);
			printSingleChildNode(node.right);
		} else if (node.left != null && node.right == null) {
			System.out.println(node.left.data);
			printSingleChildNode(node.left);
		} else {
			printSingleChildNode(node.left);
			printSingleChildNode(node.right);
		}
	}

	public static Node transBackFromLeftClonedTree(Node node) {
		if (node == null)
			return null;

		// skip the left node for once and set the new node which is one next
		Node left = transBackFromLeftClonedTree(node.left.left);
		Node right = transBackFromLeftClonedTree(node.right);
		node.left = left;
		return node;
	}

	public static void iterativePrePostInTraversal(Node node) {
		Stack<Pair> stack = new Stack<>();
		stack.push(new Pair(node, -1));
		String pre = "";
		String post = "";
		String inorder = "";
		while (!stack.empty()) {
			Pair peek = stack.peek();
			if (peek.state == -1) {
				pre += peek.node.data + " ";
				peek.state++;
			} else if (peek.state == 0) {
				if (peek.node.left != null) {
					stack.push(new Pair(peek.node.left, -1));
				}
				peek.state++;
			} else if (peek.state == 1) {
				if (peek.node.right != null) {
					stack.push(new Pair(peek.node.right, -1));
				}
				peek.state++;
				inorder += peek.node.data + " ";
			} else {
				post += stack.pop().node.data + " ";
			}
		}
		System.out.println(pre);
		System.out.println(inorder);
		System.out.println(post);
	}

}
