package TwoDimensionArray;

import java.util.*;

public class RingRotate {
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

		int s = sc.nextInt();
		int r = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int rowS = s - 1;
		int colS = s - 1;
		int rowE = n - s;
		int colE = m - s;

		// adding the top row of shell
		for (int j = colS; j <= colE; j++) {
			list.add(arr[rowS][j]);

		}

		// adding the last column
		for (int i = rowS + 1; i <= rowE; i++) {
			list.add(arr[i][colE]);
		}

		// we will add the last row if and only if when the first row and last row is
		// not same
		if (rowS != rowE) {
			for(int j=colE-1;j>=colS;j--) {
				list.add(arr[rowE][j]);
			}
		}
		
		//if first and last column is not same
		if(colS!=colE) {
			for(int i=rowE-1;i>rowS;i--) {
				list.add(arr[i][colS]);
			}
		}
		
		System.out.println(list);
		int len = list.size();
		int lenToRev = r;
	    lenToRev = (r<0) ? lenToRev*-1 : lenToRev;
	    lenToRev%=len;
	    lenToRev = (r<0) ? len - lenToRev : lenToRev;
		rotate(list,0,len-1);
		rotate(list,0,len-r-1);
		rotate(list, len-r, len-1);
		System.out.println(list);
		int index=0;
		for (int j = colS; j <= colE; j++) {
			arr[rowS][j] = list.get(index);
			index++;
		}

		// adding the last column
		for (int i = rowS + 1; i <= rowE; i++) {
			arr[i][colE] = list.get(index);
			index++;
		}

		// we will add the last row if and only if when the first row and last row is
		// not same
		if (rowS != rowE) {
			for(int j=colE-1;j>=colS;j--) {
				arr[rowE][j] = list.get(index);
				index++;
			}
		}
		
		//if first and last column is not same
		if(colS!=colE) {
			for(int i=rowE-1;i>rowS;i--) {
				arr[i][colS] = list.get(index);
				index++;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + "\t"); 
			}
			System.out.println();
		}
		return;
	}
	
	static void rotate(List<Integer> list,int s,int e) {
		while(s<=e) {
		Collections.swap(list, s, e);
		s++;
		e--;
		}
		return;
	}
	
	
//	11 12 13 14 15 16 17
//	21 25 26 36 46 45 27
//	31 24 33 34 35 44 37
//	41 23 22 32 42 43 47
//	51 52 53 54 55 56 57
}
