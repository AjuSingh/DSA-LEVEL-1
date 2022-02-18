package Recursion;
import java.util.*;
public class KnightTours {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		//we have to print all paths of knight where it cant visit one place more than once
		//knight can take 2 and half steps at once;
		knight(new int[n][n], r, c, 1);
	}
	
	static void knight(int[][] arr,int r,int c,int move) {
		if(r<0 || c<0 || r>=arr.length || c>=arr.length || arr[r][c]!=0) {
			return;
		}
		
		if(move==arr.length*arr.length) {
			arr[r][c] = move;
			display(arr);
			arr[r][c] = 0;
			return;
		}
		
		arr[r][c] = move;
		knight(arr, r-2, c+1, move+1);
		knight(arr, r-2, c+1, move+1);
		knight(arr, r-1, c+2, move+1);
		knight(arr, r+1, c+2, move+1);
		knight(arr, r+2, c+1, move+1);
		knight(arr, r+2, c-1, move+1);
		knight(arr, r+1, c-2, move+1);
		knight(arr, r-1, c-2, move+1);
		knight(arr, r-2, c-1, move+1);
		arr[r][c] = 0;
	}
	
	
	static void display(int[][] arr) {
		for(int[] sa:arr) {
			for(int x:sa) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
