package FunctionAndArrays;

import java.util.*;

public class AnyBaseAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int ans = getAns(n,b,x);
		System.out.println(ans);
	}

	static int getAns(int n,int b,int x) {
	int ans =0;
	int carry=0;
	int pow=1;
		while(n>0 || x>0) {
			int endA = n%10;
			int endB = x%10;
			int add = endA + endB + carry;
			carry = add/b;
			ans+=pow*(add%b);
			pow*=10;
			n/=10;
			x/=10;
		}
	 ans = (carry!=0) ? ans + pow*carry : ans;
     return ans; 
	}
}
