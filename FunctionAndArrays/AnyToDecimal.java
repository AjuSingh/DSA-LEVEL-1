package FunctionAndArrays;

import java.util.*;

public class AnyToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int ans  = getAns(n,b,0,0);
		System.out.println(ans);
	}

		static int getAns(int n, int b, int ans, int i) {
		if(n==0) {
			return ans;
		}
		return getAns(n/10,b,ans +(int)(Math.pow(b,i)*(n%10)),i+1);
	}

}
