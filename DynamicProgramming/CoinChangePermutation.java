package DynamicProgramming;
import java.util.*;
public class CoinChangePermutation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	int target = sc.nextInt();
	System.out.println(count(arr, 0, target, new int[n+1][target+1]));
}

static int count(int[] arr,int ind,int target,int[][] dp) {
	if(target==0) {
		return 1;
	}

	
	if(ind>=arr.length) {
		return 0;
	}
	
	if(dp[ind][target]!=0) {
		return dp[ind][target];
	}
	
	int tot = 0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<=target) {
			tot+=count(arr,i,target-arr[i],dp);
		}
	}
	return dp[ind][target] = tot;
}
}
