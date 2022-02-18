package DynamicProgramming;

import java.util.*;

public class EqualPartition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// we have to return if two subarrays have same sum or not
		System.out.println();
	}

static boolean equal(int[] arr,int n) {
	int sum=0;
	for(int i=0;i<n;i++) {
		sum+=arr[i];
	}
	//we know if sum is odd we cant divide the sum into half then we cant divide
	if(sum%2!=0) {
		return false;
	}else {
		if(partition(arr,n,sum/2)) {
			return true;
		}else {
			return false;
		}
	}
}


static boolean partition(int[] arr,int n,int sum) {
	boolean[][] dp = new boolean[n+1][sum+1];
	for(int i=1;i<=n;i++) {
		for(int j=0;j<=sum;j++) {
			boolean inc = (j-arr[i-1]<0) ? false : j==0 ? true : dp[i-1][j-arr[i-1]];
			boolean exc = j==0 ? true : dp[i-1][j];
			dp[i][j] = inc || exc;
		}
	}
	return dp[n][sum];
}
}
