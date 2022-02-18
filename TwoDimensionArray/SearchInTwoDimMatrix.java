package TwoDimensionArray;

import java.util.*;

public class SearchInTwoDimMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int target = sc.nextInt();
		int i=0,j=n-1;
		boolean flag = true;
		while(i<n && j>=0) {
			if(arr[i][j]==target) {
				System.out.println(i + " \n" + j);
				flag=false;
				break;
			}else if(arr[i][j]<target) {
				i++;
			}else {
				j--;
			}
		}
		
		
		if(flag) {
			System.out.println("Not found");
		}
	}
}
