package designPattern;
import java.util.*;


class Main {
	public static void main(String[] args) {
		MyGenericTree gt = new MyGenericTree();
		int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
				-1 };
		 gt.construct(arr);
//		System.out.println("jello");
		for (int val : gt) {
			System.out.println(val);
		}
	}

	static class MyGenericTree implements Iterable<Integer> {
	     Node root;

		static class Node {
			int data;
			ArrayList<Node> children = new ArrayList<>();
			
			Node(int data){
				this.data= data;
			}
		}
		
		

		public Node construct(int[] arr) {
			 Stack<Node> stack = new Stack<>();
		     root = new Node(arr[0]);
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
		
		public Iterator<Integer> iterator(){
			return new LinkedListIterator(root);
		}
		
		
		static class LinkedListIterator implements Iterator<Integer>{
			Node root;
			Queue<Node> que = new LinkedList<>();
			
			LinkedListIterator(Node root){
			   this.root = root;
			   que.add(root);
			   while(que.size()>0) {
				   Node temp = que.remove();
				   for(Node node:temp.children) {
					   que.add(node);
				   }
			   }
			}
			
			
			
			@Override
			public boolean hasNext() {
				if(que.size()>0) return true;
				return false;
			}

			@Override
			public Integer next() {
				int val = que.remove().data;
				return val;
			}
			
		}

	}

}