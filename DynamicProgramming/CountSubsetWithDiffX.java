package DynamicProgramming;

import java.util.*;
public class CountSubsetWithDiffX{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int diff = sc.nextInt();
        System.out.println(getMinDiffCount(arr,n,diff));
        sc.close();
    }
    
    //we cant get diff+range as odd value because it contradicts each other
    static int getMinDiffCount(int[] arr,int n,int diff){
     int range = 0;
     for(int i=0; i < n; i++){
         range+=arr[i];
     }
     int sum = (diff+range)/2;
     int[][] dp = new int[n+1][sum+1];
     for(int i=0;i<=n;i++){
         dp[i][0] = 1;
     }

     for(int i=1;i<=n;i++){
         for(int j=1;j<=sum;j++){
             if(arr[i-1]<=j){
                 dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
             }else{
                 dp[i][j] = dp[i-1][j];
             }
         }
     }
    return dp[n][sum];
    }
}