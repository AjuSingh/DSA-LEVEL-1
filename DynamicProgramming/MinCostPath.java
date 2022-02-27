package DynamicProgramming;

import java.util.*;

public class MinCostPath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int dp[][] = new int[n][m];
//		System.out.println(getMinPath(arr, 0, 0, dp));
		System.out.println(tabualation(arr, dp));
	}

	static int max = 10000;

	static int tabualation(int[][] arr, int[][] dp) {
		int n = arr.length;
		int m = arr[0].length;

		// we have to assign cost Integer.max value when there is no value present
		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--) {
				int ver = i==n-1 ? Integer.MAX_VALUE : arr[i][j] + dp[i+1][j];
				int hor = j==m-1 ? Integer.MAX_VALUE : arr[i][j] + dp[i][j+1];
				if(i==n-1 && j==m-1) {
					dp[i][j] = arr[i][j];
				}else {
					dp[i][j] = Math.min(ver, hor);
				}
			}
		}
		return dp[0][0];
	}

	static int getMinPath(int[][] arr, int i, int j, int[][] dp) {
		if (i == arr.length - 1 && j == arr[0].length - 1) {
			return arr[i][j];
		}

		if (i >= arr.length || j >= arr[0].length) {
			return max;
		}

		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int horPath = arr[i][j] + getMinPath(arr, i, j + 1, dp);
		int verPath = arr[i][j] + getMinPath(arr, i + 1, j, dp);
		int min = horPath < verPath ? horPath : verPath;
		dp[i][j] = min;
		return dp[i][j];
	}
}
