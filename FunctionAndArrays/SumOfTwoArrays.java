package FunctionAndArrays;

import java.util.*;

public class SumOfTwoArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arr1 = new int[m];
		for (int i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();
		}

		int x = n - 1;
		int y = m - 1;
		int carry = 0;
		int max = (n > m) ? n : m;
		int[] ans = new int[max];
		int k = max - 1;
		while (x >= 0 || y >= 0) {
			int endA = (x >= 0) ? arr[x] : 0;
			int endB = (y >= 0) ? arr1[y] : 0;
			int sum = endA + endB + carry;
			carry = sum / 10;
			ans[k] = sum % 10;
			x--;
			y--;
			k--;
		}

		if (carry != 0) {
			System.out.print(carry);
		}

		for (int op : ans) {
			System.out.println(op);
		}
	}
}
