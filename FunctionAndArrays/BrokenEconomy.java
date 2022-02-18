package FunctionAndArrays;

import java.util.*;

public class BrokenEconomy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int x = sc.nextInt();
		// in this question he have to find floor and ceil of the x
		// floor is the largest number which is smaller than the x
		// ceil is the smallest number which is larger than the x
		print(arr,x);
	}

	static void print(int[] arr, int x) {
		int s = 0;
		int e = arr.length - 1;
		int floor = Integer.MIN_VALUE;
		int ceil = Integer.MAX_VALUE;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] == x) {
				floor = arr[mid];
				ceil = arr[mid];
				break;
			} else if (arr[mid] < x) {
				floor = arr[mid];
				s = mid + 1;
			} else {
				ceil = arr[mid];
				e = mid - 1;
			}
		}

		if (floor == ceil) {
			System.out.println(floor);
		} else {
			System.out.println(floor);
			System.out.println(ceil);
		}
		return;
	}
}
