package hashmap;

import java.util.*;

public class Compare {
	public static void main(String[] args) throws Exception {
		Student[] arr = new Student[5];
		arr[0] = new Student("Ajvinder", 152, 65, 5);
		arr[1] = new Student("Sukhman", 143, 63, 1);
		arr[2] = new Student("Kaman", 156, 77, 3);
		arr[3] = new Student("Ravi", 100, 67, 2);
		arr[4] = new Student("Raja", 55, 256, 8);
		CustomPriorityQueue<Student> pqHeight = new CustomPriorityQueue<>(); // this class use the simple compare to
		CustomPriorityQueue<Student> pqWeight = new CustomPriorityQueue<>(new WeightComparitor()); // will use the weight comparator
		CustomPriorityQueue<Student> pqRoll = new CustomPriorityQueue<>(new RollComparitor()); // this will use the roll comparator
		CustomPriorityQueue<Student> pqRollReverse = new CustomPriorityQueue<>(Collections.reverseOrder(new RollComparitor())); 

		for (Student x : arr) {
			pqHeight.add(x);
			pqWeight.add(x);
			pqRoll.add(x);
		}

		System.out.println("Sorted on the basis of Height.");
		while (pqHeight.size()>0) {
			System.out.println(pqHeight.remove());
		}
//		 pqHeight.remove();
		System.out.println();
		System.out.println("Sorted on the basis of Weight.");
		while (pqWeight.size()>0) {
			System.out.println(pqWeight.remove());
		}
		System.out.println();

		System.out.println("Sorted on the basis of Roll No.");
		while (pqRoll.size()>0) {
			System.out.println(pqRoll.remove());
		}

	}
	
	
	
	public static class CustomPriorityQueue<T> {
		ArrayList<T> data;
		Comparator cmprt;

		public CustomPriorityQueue() {
			data = new ArrayList<>();
			cmprt=null;
		}
		
		
		public CustomPriorityQueue(Comparator cmprt) {
			data = new ArrayList<>();
			this.cmprt = cmprt;
		}

		public void add(T val) {
			data.add(val);
			upheapify(size() - 1);
		}
		
//		public void addOptimize(int[] arr) {
//			for(int x:arr) {
//				data.add(x);
//			}
//			
//			for(int i=size()/2-1;i>=0;i++) {
//				downheapify(i);
//			}
//		}

		public T remove() {
			if (size() == 0) {
				throw new Error("Priority Queue is Empty.");
			}

			T ans = peek();
			Collections.swap(data, 0, size() - 1);
			data.remove(size() - 1);
			downheapify(0);
			return ans;
		}

		public T peek() {
			if (size() == 0) {
				throw new Error("Priority Queue is Empty.");
			}

			return data.get(0);
		}

		public int size() {
			return data.size();
		}

		public void upheapify(int ci) {
			int pi = (ci - 1) / 2;
			while (ci != 0 && isSmaller(ci,pi)) {
				Collections.swap(data, ci, pi);
				ci = pi;
				pi = (ci - 1) / 2;
			}
		}

		public void downheapify(int pi) {
			int min = pi;
			int lci = 2 * pi + 1;
			int rci = 2 * pi + 2;
			if (lci < size() && isSmaller(lci,min)) {
				min = lci;
			}

			if (rci < size() && isSmaller(rci,min)) {
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
		public boolean isSmaller(int i,int j) {
			T ith = data.get(i);
			T jth = data.get(j);
			if(cmprt!=null) {
			 return cmprt.compare(ith, jth)< 0 ? true : false;	
			}else {
				Comparable c1 = (Comparable)ith;
				Comparable c2  = (Comparable)jth;
				return c1.compareTo(c2)<0 ? true : false;
			}
		}
	}

	// let say want to sort on the basis of one class on diffrent criteria so here
	// we need comparator

	static class Student implements Comparable<Student> {
		String name;
		int height;
		int weight;
		int roll;

		Student(String name, int height, int weight, int roll) {
			this.name = name;
			this.height = height;
			this.weight = weight;
			this.roll = roll;
		}

		public int compareTo(Student other) {
			return this.height - other.height;
		}

		public String toString() {
			return this.name + "," + this.height + "," + this.weight + "," + this.roll;
		}

	}

	static class WeightComparitor implements Comparator<Student> {
		public int compare(Student s1, Student s2) {
			return s1.weight - s2.weight;
		}
	}

	static class RollComparitor implements Comparator<Student> {
		public int compare(Student s1, Student s2) {
			return s1.roll - s2.roll;
		}
	}
}
