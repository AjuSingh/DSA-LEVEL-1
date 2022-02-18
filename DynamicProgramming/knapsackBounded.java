package DynamicProgramming;
import java.util.*;
public class knapsackBounded {
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
	System.out.println(knap(wt, val, 0, w, dp));
}

//we have to think the smallest input and we make it base case in memoization and initialization in tabulation
static int tabulation(int[] wt,int[] val,int weight,int n) {
	int[][] dp = new int[n+1][weight+1];
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=weight;j++) {
			if(wt[i-1]<=weight) {
				dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]],dp[i-1][j]);
			}else {
				dp[i][j] = dp[i-1][j];			
			}
		}
	}
	return dp[n][weight];
}


 static int knap2(int weight,int[] wt,int[] val,int n,int[][] dp){
     if(n==0 || weight==0){
         return 0;
    } 
    
     if(dp[n-1][weight]!=-1){
         return dp[n-1][weight];
     }
    
     if(wt[n-1]>weight){
     return  dp[n-1][weight] = knap2(weight,wt,val,n-1,dp);
     }else{
     return  dp[n-1][weight] =Math.max(val[n-1]+knap2(weight-wt[n-1],wt,val,n-1,dp),knap2(weight,wt,val,n-1,dp));
     }

 }


 				


static int knap(int[] wt,int[] val,int i,int w,int[][] dp) {
	if(i==wt.length || w==0){
		return 0;
	}
	
	if(dp[i][w]!=-1) {
		return dp[i][w];
	}
	
	if(wt[i]<=w) {	
		return dp[i][w] = Math.max(knap(wt,val,i+1,w,dp),val[i]+knap(wt,val,i+1,w-wt[i],dp));
	}else {
        return dp[i][w] = knap(wt,val,i+1,w,dp);
	}
}
}
