package TwoDimensionArray;

import java.util.*;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] left = new int[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				left[i][j] = sc.nextInt();
			}
		}

		int c = sc.nextInt();
		int d = sc.nextInt();
		int[][] right = new int[c][d];

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < d; j++) {
				right[i][j] = sc.nextInt();
			}
		}
		
		//we can multiply if and only if column of first matrix is equal to the row of second matrix
		if(b!=c) {
			System.out.println("Invalid input");
		}else {
			int[][] arr = new int[a][d];
			for(int i=0;i<a;i++) {
				for(int j=0;j<d;j++) {
					int sum = 0;
					for(int k=0;k<c;k++) {
						sum+=left[i][k]*right[k][j];
					} 
					arr[i][j] = sum;
				}
			}
			
			for(int[] x:arr) {
				for(int y:x) {
					System.out.print(y + " ");
				}
				System.out.println();
			}
		}
	}
}
