package hashmap;

import java.util.*;

public class MergeKSortedLists {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int k = sc.nextInt();
	 ArrayList<ArrayList<Integer>> list =  new ArrayList<>();
	 for(int i=0;i<k;i++) {
		 int n = sc.nextInt();
		 ArrayList<Integer> arr = new ArrayList<>();
		 for(int j=0;j<n;j++) {
			 arr.add(sc.nextInt());
		 }
		 list.add(arr);
	 }
	 
	 System.out.println(merge(list));
	}

	public static ArrayList<Integer> merge(ArrayList<ArrayList<Integer>> lists) {
		ArrayList<Integer> rv = new ArrayList<>();
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for (int i = 0; i < lists.size(); i++) {
			Pair pair = new Pair(lists.get(i).get(0), i, 0);
			pq.add(pair);
		}

		while (pq.size() > 0) {
			Pair peek = pq.remove();
			rv.add(peek.data);
            int i=peek.i;
            int j=peek.j;
            
			if (peek.j < lists.get(i).size()-1) {
				pq.add(new Pair(lists.get(i).get(j + 1), i, j + 1));
			}
		}
		return rv;
	}

	public static class Pair implements Comparable<Pair> {
		int data;
		int i;
		int j;

		public int compareTo(Pair o) {
			return this.data - o.data;
		}

		Pair(int data, int i, int j) {
			this.data = data;
			this.i = i;
			this.j = j;
		}
	}

}
