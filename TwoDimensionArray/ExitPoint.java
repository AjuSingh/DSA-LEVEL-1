package TwoDimensionArray;

import java.util.*;

public class ExitPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		printPath(arr, n, m);
	}

	static void printPath(int[][] arr, int n, int m) {
//	directions
//	    North
//	West     East
//	    South
//0->East
//1->South
//2->West
//3->North
		int i = 0, j = 0;
		int dir = 0;
		while (true) {
			dir = (dir + arr[i][j]) % 4;
			if (dir == 0) {
				j++;
			} else if (dir == 1) {
				i++;
			} else if (dir == 2) {
				j--;
			} else {
				i--;
			}

			if (i < 0 || i == n) {
				i = i < 0 ? i + 1 : i - 1;
				break;
			}
			if (j < 0 || j == m) {
				j = j < 0 ? j + 1 : j - 1;
				break;
			}
		}
		System.out.println(i);
		System.out.println(j);
	}

}
