package DynamicProgramming;
import java.util.*;
public class RodCutting {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	sc.close();
	//we will cut the rode such that total prices of rod is maximum
	//we will cut into one lenght many times
	// so unbounded knap sack
}

static int rodCut(int[] price,int n) {
	int[][] dp = new int[n+1][n+1];
	//we dont have weight arr so i can we used as weight array
	//and price as val array
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i<=j) {
				dp[i][j] = Math.max(price[i-1] + dp[i][j-i], dp[i-1][j]);
			}else {
				dp[i][j] = dp[i-1][j];
			}
		}
	}
	return dp[n][n];
}
}
