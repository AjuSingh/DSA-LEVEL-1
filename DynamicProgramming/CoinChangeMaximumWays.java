package DynamicProgramming;
import java.util.*;
public class CoinChangeMaximumWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(getAns(arr,target));
    }

    static int getAns(int[] arr,int target){
        int n = arr.length;
        int[][] dp = new int[n+1][target+1];
        for(int i = 0; i <=n; i++){
            dp[i][0] = 1;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j] + dp[i][j-arr[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][target];
    }
}
