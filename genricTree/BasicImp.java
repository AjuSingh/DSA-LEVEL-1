package genricTree;

import java.util.*;

public class BasicImp {

	public static void main(String[] args) {
//		Node root = new Node(10);
//		Node twenty = new Node(20);
//		root.children.add(twenty);
//		
//		Node thirty = new Node(30);
//		root.children.add(thirty);
//		
//		Node fourty = new Node(40);
//		root.children.add(fourty);
//		
//		Node fifty = new Node(50);
//		twenty.children.add(fifty);
//		
//		Node sixty = new Node(60);
//		twenty.children.add(sixty);
//		
//		Node seventy = new Node(70);
//		thirty.children.add(seventy);
//		
//		Node eighty = new Node(80);
//		thirty.children.add(eighty);
//		
//		Node ninty = new Node(90);
//		thirty.children.add(ninty);
//		
//		Node hundered = new Node(100);
//		fourty.children.add(hundered);
		int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
				-1 };
		Node root = construct(arr);
//		printInOrderLinewise(root);
//		printInOrderLinewiseZigZag(root);
//		ArrayList<Integer> list = new ArrayList<>();
//		seralize(root, list);
//		System.out.println(list);
//		System.out.println(size(root));
//		display(root);
//		linearize2(root);
//		display(root);
		find(root, 120, "");
	}

	static void display(Node root) {
		String ans = root.data + "-> ";
		for (Node node : root.children) {
			ans += node.data + ", ";
		}
		System.out.println(ans);
		for (Node node : root.children) {
			display(node);
		}

//		10-> 20, 30, 40, 
//		20-> 50, 60, 
//		50-> 
//		60-> 
//		30-> 70, 80, 90, 
//		70-> 
//		80-> 110, 120, 
//		110-> 
//		120-> 
//		90-> 
//		40-> 100, 
//		100-> 
	}

	static int size(Node root) {
		int size = 0;
		for (Node node : root.children) {
			size += size(node);
		}
		return size + 1;
	}

	public static int max(Node root) {
		int mx = root.data;
		for (Node node : root.children) {
			mx = Math.max(mx, max(node));
		}
		return mx;
	}

	public static int height(Node root) {
		int cnt = 0;
		for (Node node : root.children) {
			cnt = Math.max(cnt, height(node) + 1);
		}
		return cnt;
	}

	public static void mirror(Node root) {
		for (Node node : root.children) {
			mirror(node);
		}
		Collections.reverse(root.children);
	}

	public static void printInOrder(Node root) {
		Queue<Node> qu = new LinkedList<>();
		qu.add(root);
		while (!qu.isEmpty()) {
			Node peek = qu.remove();
			System.out.println(peek.data);
			for (Node node : peek.children) {
				qu.add(node);
			}
		}
	}

	public static Node construct(int[] arr) {
		Stack<Node> stack = new Stack<>();
		Node root = new Node(arr[0]);
		stack.add(root);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == -1) {
				stack.pop();
			} else {
				Node temp = new Node(arr[i]);
				stack.peek().children.add(temp);
				stack.add(temp);
			}
		}
		return root;
	}

	public static void seralize(Node root, ArrayList<Integer> list) {
		list.add(root.data);
		for (Node node : root.children) {
			seralize(node, list);
		}
		list.add(-1);
	}

	public static void linearize(Node root) {
		for (Node node : root.children) {
			linearize(node);
		}

		while (root.children.size() > 1) {
			Node last = root.children.remove(root.children.size() - 1);
			Node secLast = root.children.get(root.children.size() - 1);
			Node tail = getTail(secLast);
			tail.children.add(last);
		}
	}

	public static Node linearize2(Node root) {
		if (root.children.size() == 0) {
			return root;
		}

		// basically it travels to the end of the last node and return at the end
		// after completing the who travel

		// what we are doing first get the tail of last node which we want to return at
		// the end
		// then remove the last node to make the second last as last
		// then get the tail of the last and add the last we get at the tail of second
		// last
		Node lastNodeTail = linearize2(root.children.get(root.children.size() - 1));
		while (root.children.size() > 1) {
			Node last = root.children.remove(root.children.size() - 1);
			Node secLast = root.children.get(root.children.size() - 1);
			Node secLastTail = linearize2(secLast);
			secLastTail.children.add(last);
		}
		return lastNodeTail;
	}

	public static Node getTail(Node root) {
		Node tail = root;
		while (tail.children.size() != 0) {
			tail = tail.children.get(0);
		}
		return tail;
	}

	public static void printInOrderLinewise(Node root) {
		Queue<Node> qu = new LinkedList<>();
		Queue<Node> childQu = new LinkedList<>();
		qu.add(root);
		while (!qu.isEmpty()) {
			Node peek = qu.remove();
			System.out.print(peek.data + " ");
			for (Node node : peek.children) {
				childQu.add(node);
			}

			if (qu.isEmpty()) {
				qu = childQu;
				childQu = new LinkedList<>();
				System.out.println(".");
			}
		}
	}

	public static boolean find(Node root, int data, String str) {
		if (root.data == data) {
			str += root.data;
			System.out.println(str);
			return true;
		}

		boolean ans = false;
		str += root.data + "->";
		for (Node node : root.children) {
			ans = ans || find(node, data, str);
			if (ans)
				return true;
		}
		return ans;
	}

	public static ArrayList<Integer> rootToNodePath(Node node, int data) {
		if (node.data == data) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(data);
			return list;
		}

		for (Node child : node.children) {
			ArrayList<Integer> ntr = rootToNodePath(child, data);
			// we are working in the past we only put our answer after we get the result
			// if size > 0 means some thing is put inside the list which is answer
			if (ntr.size() > 0) {
				ntr.add(node.data);
				return ntr;
			}
		}
		return new ArrayList<>();
	}

	static int lca(Node root, int d1, int d2) {
		ArrayList<Integer> list1 = rootToNodePath(root, d1);
		ArrayList<Integer> list2 = rootToNodePath(root, d2);
		int i = list1.size() - 1;
		int j = list2.size() - 1;
		while (i >= 0 && j >= 0 && list1.get(i) == list2.get(j)) {
			i--;
			j--;
		}
		// last same node is the lca of both
		return list1.get(i + 1);
	}

	static int distanceBtwTwoNode(Node root, int d1, int d2) {
		ArrayList<Integer> list1 = rootToNodePath(root, d1);
		ArrayList<Integer> list2 = rootToNodePath(root, d2);
		int i = list1.size() - 1;
		int j = list2.size() - 1;
		while (i >= 0 && j >= 0 && list1.get(i) == list2.get(j)) {
			i--;
			j--;
		}
		return i + j + 2;
	}

	public static void removeLeaves(Node root) {
		for (int i = root.children.size() - 1; i >= 0; i--) {
			Node peek = root.children.get(i);
			if (peek.children.size() == 0) {
				root.children.remove(i);
			} else {
				removeLeaves(peek);
			}
		}
		return;
	}

	public static boolean areSimilar(Node n1, Node n2) {
		// here if the children size is not same means shape is not same
		if (n1.children.size() != n2.children.size())
			return false;

		for (int i = 0; i < n1.children.size(); i++) {
			// now in between when we have the false we return from that
			if (!areSimilar(n1.children.get(i), n2.children.get(i)))
				return false;
		}
		return true;
	}

	public static boolean areMirror(Node n1, Node n2) {
		// now check if both the tress are mirror in shape not in the data..
		if (n1.children.size() != n2.children.size())
			return false;
		// comparing the first child of tree one and last child of tree two
		for (int i = 0, j = n1.children.size() - 1; i < n1.children.size() && j >= 0; i++, j--) {
			if (!areMirror(n1.children.get(i), n2.children.get(j)))
				return false;
		}
		return true;
	}

	public static boolean IsSymmetric(Node node) {
		// symmetric means mirror image of itself so if the left node and right node are
		// not mirror image of itself
		// then it is not symmetric
		int i = 0, j = node.children.size() - 1;
		while (i <= j) {
			if (!areMirror(node.children.get(i++), node.children.get(j--)))
				return false;
		}
		return true;

		// return areMirror(node,node) is also the same thing..
	}

	public static void printInOrderLinewise2(Node root) {
		Queue<Node> qu = new LinkedList<>();
		qu.add(root);
		while (!qu.isEmpty()) {
			// at level i we have x elements
			int cursize = qu.size();
			while (cursize-- > 0) {
				// now from that x element has y child so this loop run x times and each has
				// diffrent child so
				// x*y will become the new level
				Node peek = qu.remove();
				System.out.print(peek.data + " ");
				for (Node node : peek.children) {
					qu.add(node);
				}
			}
			System.out.println();
		}
	}

	static Node predecessor = null;
	static Node successor = null;
	static int flag = 0;

	public static void predecessorAndSuccessor(Node node, int data) {

		if (flag == 0 && node.data != data)
			predecessor = node;
		if (flag == 1) {
			successor = node;
		}

		if (node.data == data || flag > 0)
			flag++;

		for (Node child : node.children) {
			predecessorAndSuccessor(child, data);
		}
	}

	static int ceil = Integer.MAX_VALUE;
	static int floor = Integer.MIN_VALUE;

	public static void ceilAndFloor(Node node, int data) {
		// Write your code here
		if (node.data >= floor && node.data < data)
			floor = node.data;
		if (node.data > data && node.data <= ceil)
			ceil = node.data;

		for (Node child : node.children) {
			ceilAndFloor(child, data);
		}
	}

	public static void printInOrderLinewiseZigZag(Node root) {
		int cnt = 0;
		Stack<Node> parent = new Stack<>();
		Stack<Node> child = new Stack<>();
		parent.add(root);
		while (!parent.empty()) {
			Node temp = parent.pop();
			System.out.print(temp.data + " ");
			if (cnt % 2 == 0) {
				// pushing from the forward to get the last next time
				for (int i = 0; i < temp.children.size(); i++) {
					child.add(temp.children.get(i));
				}
			} else {
				// pushing from backward to get the forward while next level
				for (int i = temp.children.size() - 1; i >= 0; i--) {
					child.add(temp.children.get(i));
				}

			}

			if (parent.empty()) {
				parent = child;
				child = new Stack<Node>();
				System.out.println(".");
				cnt++;
			}
		}
	}

	public static class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();

		Node(int data) {
			this.data = data;
		}
	}

}
