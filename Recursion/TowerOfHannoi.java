package Recursion;

import java.util.*;

public class TowerOfHannoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int h = sc.nextInt();
		toh(n,x,y,h);
	}

	 static void toh(int n, int x, int y, int h) {
		if(n==0) {
			return;
		}
		toh(n-1, x, h, y);
		System.out.println(n + "[" + x + " -> " + y + "]");
		toh(n-1,h,y,x);
		
	}
	 
//	 		 1[10 -> 11]
//			 2[10 -> 12]
//			 1[11 -> 12]
//			 3[10 -> 11]
//			 1[12 -> 10]
//			 2[12 -> 11]
//			 1[10 -> 11]
}
