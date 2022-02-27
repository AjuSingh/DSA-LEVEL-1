package DynamicProgramming;

import java.util.*;
public class CountSubsetWithSumX{
    static int mod = 10000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(subset(arr, n-1,sum,new int[n+1][sum+1]));
        sc.close();
    }

    public static int subset(int[] arr,int n,int sum,int[][] dp){
        if(n<0){
            return 0;
        }
        
        if(n==0){
            if(arr[n]==sum){
                return 1;
            }else{
                return 0;
            }
        }

        if(sum==0){
            return 1;
        }

        if(dp[n][sum]!=0) {
            return dp[n][sum]%mod;
        }

        if(arr[n]<=sum){
           return dp[n][sum] = (subset(arr,n-1,sum-arr[n],dp) + subset(arr,n-1,sum,dp))%mod;
        }else{
            return dp[n][sum] = subset(arr,n-1,sum-arr[n],dp)%mod;
        }
    }

    public static int perfectSum(int arr[],int n, int sum) 
	{ 
	
	    int[][] dp = new int[n+1][sum+1];
	   for(int i=0;i<=n;i++){
	      dp[i][0] = 1;
	   }
	   for(int i=1;i<=n;i++){
	       for(int j=0;j<=sum;j++){
	          if(arr[i-1]<=j){
	              dp[i][j] = (dp[i-1][j] +  dp[i-1][j-arr[i-1]])%mod;
	          }else{
	              dp[i][j] = (dp[i-1][j])%mod;
	          }
	       }
	   }

	   return dp[n][sum]%mod;
	} 


}