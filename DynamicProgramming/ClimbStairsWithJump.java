package DynamicProgramming;
import java.util.*;
public class ClimbStairsWithJump {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	
	int[] dp = new int[n+1];
//	System.out.println(getJumps(0, n, arr, dp));
	int[] tb = new int[n+1];
	tb[n] = 1;
	for(int i=n-1;i>=0;i--) {
		for(int j=1;j<=arr[i]&&i+j<=n;j++) {
			tb[i]+=tb[i+j];
		}
	}
	System.out.println(Arrays.toString(tb));
}
  
static int getJumps(int i,int n,int[] arr,int[] dp) {
	if(i==n) {
		return 1;
	}
	
	if(i>n) {
		return 0;
	}
	
	if(dp[i]!=0) {
		return dp[i];
	}
	
	
	for(int j=1;j<=arr[i];j++) {
		dp[i]+=getJumps(i+j, n, arr, dp);
	}
	return dp[i];
}

}
