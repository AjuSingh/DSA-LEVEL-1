package FunctionAndArrays;

import java.util.*;

public class AnyBaseSub {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int b = sc.nextInt();
		int ans = baseSub(b,x,y);
		System.out.println(ans);
	}
	
	static int baseSub(int b,int x,int y) {
		int ans = 0;
		int pow = 1;
		int carry = 0;
		
		while(y>0) {
			int ldX = x%10;
			int ldY = y%10;
			int sub = ldY - ldX + carry;
			x/=10;
			y/=10;
			if(sub<0) {
				sub+=b;
				carry=-1;
			}else {
				carry=0;
			}
			ans+=sub*pow;
			pow*=10;
		}
		return ans;
	}
}
