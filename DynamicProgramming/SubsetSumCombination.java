package DynamicProgramming;
import java.util.*;
public class SubsetSumCombination {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	
	int target = sc.nextInt();
	System.out.println(getAns(arr, 0, target, new int[n+1][target+1]));
}

static int getAns(int[] arr,int ind,int target,int[][] dp) {	
	if(ind>=arr.length || target<=0) {
		if(target==0) {
			return dp[ind][target] = 1;
		}
		return dp[ind][target] = 0;
	}
	
	if(dp[ind][target]!=0) {
		return dp[ind][target];
	}
	
	int tot=0;
	for(int i=0;i<arr.length;i++) {
		if(target-arr[i]>=0) {			
			tot+=getAns(arr, i, target-arr[i], dp);
		}
	}
	return dp[ind][target] = tot;
}



}
