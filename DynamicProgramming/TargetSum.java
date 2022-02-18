package DynamicProgramming;

import java.util.*;

public class TargetSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		// we need to give answer that is it possible that some subset of this will give
		// answer
		// we need to return true or false;
//		System.out.println(targetSum(arr, target, new boolean[target + 1], 0));
		System.out.println(tabulation(arr,target));
	}

	static boolean tabulation(int[] arr, int target) {
		boolean[][] dp = new boolean[arr.length+1][target+1];
		dp[0][0] = true;
		for(int i=1;i<=arr.length;i++) {
			for(int j=0;j<=target;j++){
				boolean exc = (j==0) ? true : dp[i-1][j];
				boolean inc = (j-arr[i-1]<0) ? false :  j==0 ? true : dp[i-1][j-arr[i-1]];
				dp[i][j] = inc || exc;
			}
		}
		return dp[arr.length][target];
	}

	static boolean targetSum(int[] arr, int target, boolean[] dp, int ind) {
		if (target == 0) {
			return true;
		}

		if (target < 0 || ind >= arr.length) {
			return false;
		}

		if (dp[target]) {
			return true;
		}

		dp[target] = targetSum(arr, target - arr[ind], dp, ind + 1) || targetSum(arr, target, dp, ind + 1);
		return dp[target];
	}
}
