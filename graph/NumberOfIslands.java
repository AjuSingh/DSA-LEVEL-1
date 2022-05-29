package graph;
import java.util.*;

public class NumberOfIslands {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
//		0 0 1 1 1 1 1 1
//		0 0 1 1 1 1 1 1
//		1 1 1 1 1 1 1 0
//		1 1 0 0 0 1 1 0
//		1 1 1 1 0 1 1 0
//		1 1 1 1 0 1 1 0
//		1 1 1 1 1 1 1 0
//		1 1 1 1 1 1 1 0
		
//		0 represent water and 1 land
		//we need to find where the 0 makes island around it means any shape of zero made an island
		//as we can move in may direction so go through the matrix if the 1 occurs then means land no more water
		//so move backward
		//as we are moving in 4 direction so making one is make them visited as it is land
		
		int[][] arr = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int count = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==0) {
					count++;
					explore(arr,i,j);
				}
			}
		}
		System.out.print(count);
	}
	
	
	static void explore(int[][] arr,int i,int j) {
		if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]==1) {
			return;
		}
		
		arr[i][j] = 1;
		explore(arr,i+1,j);
		explore(arr,i-1,j);
		explore(arr,i,j+1);
		explore(arr,i,j-1);
	}
}
