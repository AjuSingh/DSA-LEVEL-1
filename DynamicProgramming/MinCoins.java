package DynamicProgramming;
import java.util.*;
public class MinCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i=0;i<n;i++) coins[i] = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(minCoin(coins, coins.length, target));
        sc.close();
    }

    static int minCoin(int[] coins,int M,int V){
        int[] dp = new int[V+1];
	    Arrays.fill(dp,Integer.MAX_VALUE-1);
	    dp[0] = 0;
	    for(int i=1;i<=M;i++){
	       for(int j=1;j<=V;j++){
	           if(coins[i-1]<=j){
	               dp[j] = Math.min(dp[j-coins[i-1]]+1 , dp[j]);
	           }
	       }
	    }
	    
	    if(dp[V]==Integer.MAX_VALUE - 1){
	        return -1;
	    }else{
	        return dp[V];
	    }
    }
}
