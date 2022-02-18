package TwoDimensionArray;

import java.util.*;

public class SaddlePoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = Integer.MAX_VALUE;
		int maxInd = -1;
		
		//checking the smallest element in the every row
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]<max) {
					max = arr[i][j];
					maxInd = j;
				}
			}
			
			
			//now check the given number is largest in the column
			if(isMax(arr,n,maxInd,max)) {
				break;
			}else {
				max = Integer.MAX_VALUE;
				maxInd =-1;
			}
		}
		
		if(max==Integer.MAX_VALUE) {
			System.out.println("Invalid Input");
		}else {
			System.out.println(max);
		}
		
	}
	
	static boolean isMax(int[][] arr,int n,int j,int max) {
		for(int i=0;i<n;i++) {
			if(arr[i][j]>max) {
				return false;
			}
		}
		return true;
	}
}
