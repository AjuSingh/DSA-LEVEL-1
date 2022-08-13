package DynamicProgramming;

import java.util.*;

public class FrogJump {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] heights = new int[n];
		for (int i = 0; i < n; i++) {
			heights[i] = sc.nextInt();
		}
		System.out.println(frogJump(n, heights));
		;
	}

	// tabulation
	public static int frogJump(int n, int heights[]) {
		int[] dp = new int[n + 1];
		for (int i = 1; i < n; i++) {
			int left = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
			int right = Integer.MAX_VALUE;
			if (i > 1) {
				right = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
			}
			dp[i] = Math.min(left, right);
		}
		return dp[n - 1];
	}

	// most optimal
	public static int frogJump2(int n, int heights[]) {
		int prev = 0;
		int prev2 = 0;
		for (int i = 1; i < n; i++) {
			int left = prev + Math.abs(heights[i] - heights[i - 1]);
			int right = Integer.MAX_VALUE;
			if (i > 1) {
				right = prev2 + Math.abs(heights[i] - heights[i - 2]);
			}
			int cur = Math.min(left, right);
			prev2 = prev;
			prev = cur;
		}
		return prev;
	}

}
