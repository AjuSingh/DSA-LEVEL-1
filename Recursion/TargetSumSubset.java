package Recursion;

import java.util.*;

public class TargetSumSubset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		tss(arr, 0, "", target,0);
	}

	static void tss(int[] arr, int sum, String str, int target,int ind) {
		if(sum>target) {
			return;
		}
		
		if(sum==target){
			System.out.println(str + ".");
			return;
		}
		
		if(ind==arr.length) {
			return;
		}
		
		tss(arr,sum+arr[ind],str+ arr[ind] + ",  ",target, ind+1);
		tss(arr,sum,str,target,ind+1);
	}
}
