package TwoDimensionArray;

import java.util.*;

public class RotateBy90Degree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

//		int[][] ans = rotate(arr, n);
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print(ans[i][j] + " ");
//			}
//			System.out.println();
//		}
		rot(arr,n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void rot(int[][] arr, int n) {
		// first transpose and then reverse the rows
		for (int j = 0; j < n; j++) {
			for (int i = j; i < n; i++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			int s = 0, e = n - 1;
			while (s <= e) {
				int temp = arr[i][s];
				arr[i][s] = arr[i][e];
				arr[i][e] = temp;
				s++;
				e--;
			}
		}
		return;
	}

	static int[][] rotate(int[][] arr, int n) {
		int[][] ans = new int[n][n];
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				ans[j][n - 1 - i] = arr[i][j];
			}
		}
		return ans;
	}
}
