package Recursion;

import java.util.*;

public class NQueens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		nQueen(arr, 0, "");
		// for(int[] temp : arr) {
		// 	System.out.println(Arrays.toString(temp));
		// }
	}
	
	static void nQueen(int[][] arr,int row,String str) {
		if(row==arr.length) {
			System.out.println(str + ".");
			return;
		}
		
		
		for(int col=0;col<arr.length;col++) {
			if(isDiagClear(arr, row, col) && isRCClear(arr, row, col)) {
				arr[row][col]=1;
				nQueen(arr, row+1, str + row + "-" + col + ", ");
				arr[row][col]=0;
			}
		}
	}

	static boolean isDiagClear(int[][] arr, int r, int c) {
		// diagnol 1
		int n= arr.length;
		int min = r < c ? r : c;
		for (int i = r - min, j = c - min; i < n && j < n; i++, j++) {
			if (arr[i][j] == 1) {
				return false;
			}
		}
		// diagnol 2;
		// special case when column is zero
		if (c == 0) {
			for (int i = 0, j = r; i < n && j >= 0; i++, j--) {
				if (arr[i][j] == 1) {
					return false;
				}
			}
		} else {
			//we know row increases and column decreases so 
			int mini = Math.min(r, n-1-c);
			for(int i=r-mini,j=c+mini;i<n&&j>=0;i++,j--) {
				if(arr[i][j]==1) {
					return false;
				}
			}
		}
		return true;
	}
	
	static boolean isRCClear(int[][] arr,int r,int c) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i][c]==1) {
				return false;
			}
		}
		
		for(int j=0;j<arr.length;j++) {
			if(arr[r][j]==1) {
				return false;
			}
		}
		return true;		
	}

}
