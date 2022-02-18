package Pattern;

import java.util.*;

public class Pattern13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(comb(i, j) + "\t");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<n;i++) {
			int val = 1;
			for(int j=0;j<=i;j++) {
				System.out.print(val + "\t");
				val = val*(i-j)/(j+1);
			}
			System.out.println();
		}
	}

	static int comb(int n, int r) {
		int ans = 1;
		int temp=r;
		while(temp>0) {
			ans*=n;
			n--;
			temp--;
		}
		
		while(r>0) {
			ans/=r;
			r--;
		}
		return ans;
	}
}
