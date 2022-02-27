package DynamicProgramming;
import java.util.*;
public class MinimumSumPartition {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] arr = new int[n];
  for(int i=0;i<n;i++) {
	 arr[i] = sc.nextInt();
  }
  
}


//Algorithms be like we will get the all possible sum from last row of the dp table
//we know if the S1 is sum of one subset then another subset has some TotalSum-s1;
//then second subset is total-s1;
//like wise we will create dp table for range and check for minimum difference
static int getMinDiff(int[] arr,int n) {
	int range=0;
	for(int i=0;i<n;i++) {
		range+=arr[i];
	}
	boolean[][] dp = new boolean[n+1][range+1];
	//setting the first column as true because every array set can make sum 0
	for(int i=0;i<=n;i++) {
		dp[i][0] = true;
	}
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=range;j++) {
			if(arr[i-1]<=j) {
				dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
			}else {
				dp[i][j] = dp[i-1][j];
			}
		}
	}
	
	//checking the last row to get the answer
	int min=range;
	for(int i=0;i<=range;i++) {
		if(dp[n][i]) {			
			min = Math.abs(range-i-i)<min ? Math.abs(range-i-i) : min;
		}
	}
	return min;
}
}
