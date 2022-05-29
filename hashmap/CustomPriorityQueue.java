package hashmap;

import java.util.*;

public class CustomPriorityQueue {
	ArrayList<Integer> data;

	public CustomPriorityQueue() {
		data = new ArrayList<>();
	}

	public void add(int val) {
		data.add(val);
		upheapify(size() - 1);
	}
	
//	public void addOptimize(int[] arr) {
//		for(int x:arr) {
//			data.add(x);
//		}
//		
//		for(int i=size()/2-1;i>=0;i++) {
//			downheapify(i);
//		}
//	}

	public int remove() {
		if (size() == 0) {
			System.out.println("Underflow");
			return -1;
		}

		int ans = peek();
		Collections.swap(data, 0, size() - 1);
		data.remove(size() - 1);
		downheapify(0);
		return ans;
	}

	public int peek() {
		if (size() == 0) {
			System.out.println("Underflow");
			return -1;
		}

		return data.get(0);
	}

	public int size() {
		return data.size();
	}

	public void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		while (ci != 0 && data.get(pi) > data.get(ci)) {
			Collections.swap(data, ci, pi);
			ci = pi;
			pi = (ci - 1) / 2;
		}
	}

	public void downheapify(int pi) {
		int min = pi;
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		if (lci < size() && data.get(lci) < data.get(min)) {
			min = lci;
		}

		if (rci < size() && data.get(rci) < data.get(min)) {
			min = rci;
		}

		if (pi != min) {
			Collections.swap(data, pi, min);
			downheapify(min);
		}
	}
	
	//we can do the whole operations in O(n)
	//when we have given the data in the array 
	//we will use downheapify from the end because the end level has more node and it take less
   //time to travel is less in down 
   //we will start downheapidy from size/2 - 1 it the node which has nodes it is formula in pq
	

}
