package DynamicProgramming;
import java.util.*;
public class GoldMine {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	int[][] arr = new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
//	int max = Integer.MIN_VALUE;
//	for(int i=0;i<n;i++) {
//		max = Math.max(max, goldmine(arr,i,0,new int[n][m]));
//	}
//	System.out.println(max);
	System.out.println(tabulation(arr));
}

static int tabulation(int[][] arr) {
	int n = arr.length;
	int m  = arr[0].length;
	//we need to traverse from last col to first column so outer loop will be from col-1 to 0
	int[][] dp = new int[n][m];
	for(int j=m-1;j>=0;j--) {
		for(int i=n-1;i>=0;i--) {
			int upRight = (j==m-1 || i==0) ? 0 : dp[i-1][j+1];
			int right = (j==m-1) ? 0 : dp[i][j+1];
			int downRight = (i==n-1 || j==m-1) ? 0 : dp[i+1][j+1];
			int max = Math.max(Math.max(upRight,right), downRight);
			dp[i][j] = arr[i][j] + max;
		}
	}
	
	//ans will be in first row so 
	int max = Integer.MIN_VALUE;
	for(int i=0;i<n;i++) {
		max = Math.max(max, dp[i][0]);
	}
	return max;
}

   static int goldmine(int[][] arr,int i,int j,int[][] dp) {
	   if(i<0 || j>=arr[0].length || i>=arr.length ) {
		   return 0;
	   }
	   
	   if(j==arr[0].length-1) {
		   dp[i][j] = arr[i][j];
		   return arr[i][j];
	   }
	   
	   if(dp[i][j]!=0) {
		   return dp[i][j];
	   }
	   
	   int upRight	= goldmine(arr,i-1,j+1,dp);
	   int right = goldmine(arr,i,j+1,dp);
	   int downRight = goldmine(arr,i+1,j+1,dp);
	   int max = Math.max(Math.max(right, downRight),upRight);
       dp[i][j] = arr[i][j] + max;
       return dp[i][j];
   }
}
