package Recursion;

import java.util.*;

public class PowerInLog {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(pow(x,n));
	}
	
	
	static int pow(int x,int n) {
		if(n==1) {
			return x;
		}
		
		int half = pow(x,n/2);
		int ans = (n%2==0) ? half*half : x*half*half;
		return ans;
	}
}
