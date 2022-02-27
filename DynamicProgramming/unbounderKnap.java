package DynamicProgramming;
import java.util.*;
public class unbounderKnap {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] wt = new int[n];
	int[] val = new int[n];
	for(int i=0;i<n;i++) {
		wt[i] = sc.nextInt();
	}
	
	for(int i=0;i<n;i++) {
		val[i] = sc.nextInt();
	}
	int w = sc.nextInt();
	int[][] dp = new int[n+1][w+1];
	for(int[] arr:dp) {
		Arrays.fill(arr, -1);
	}
	}
	
	static int getAns(int[] wt,int[] val,int ind,int[][] dp,int weight) {
		if(ind==wt.length){
			return dp[ind][weight] = 0;
		}
		
		if(dp[ind][weight]!=-1) {
			return dp[ind][weight];
		}
		
		if(wt[ind]<=weight) {
			return dp[ind][weight] = Math.max(getAns(wt, val, ind, dp, weight-wt[ind]) + val[ind], getAns(wt, val, ind+1, dp, weight));
		}else {
			return dp[ind][weight] = getAns(wt, val, ind+1, dp, weight);
		}
	}
	
	static int tabulation(int[] wt,int[] val,int weight) {
		int[][] dp = new int[wt.length+1][weight+1];
		for(int i=1;i<=wt.length;i++) {
			for(int j=1;j<=weight;j++) {
				if(wt[i-1]<=j) {
					dp[i][j] = Math.max(dp[i-1][j], val[i-1]+dp[i][j-wt[i-1]]);
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		return dp[wt.length][weight];
	}
}
