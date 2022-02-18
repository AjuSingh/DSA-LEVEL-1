package FunctionAndArrays;
import java.util.*;

public class AnyBaseMul {
	public static void main(String[] args) {
	    Scanner  sc = new Scanner(System.in);
	    int b = sc.nextInt();
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int ans = anyBaseMul(b,x,y);
	    System.out.println(ans);
	}
	
	
	static int anyBaseMul(int b,int x,int y) {
		int ans=0;
		int pow=1;
		while(x>0) {
			int sgm = singleDigMul(b, y, x%10);
			ans = addAny(b, ans, sgm*pow);
			pow*=10;
			x/=10;
		}
		return ans;
	}
	
	
	static int singleDigMul(int b,int x,int y) {
		int ans = 0;
		int pow = 1;
		int carry=0;
		while(x>0 || carry>0) {
			int endX = x%10;
			int mul =  endX*y + carry;
			x/=10;
			carry = mul/b;
			ans+=pow*(mul%b);
			pow*=10;
		}
		return ans;
	}
	
	static int addAny(int b,int x,int y) {
		int ans = 0;
		int pow = 1;
		int carry = 0;
		while(x>0 || y>0 || carry>0) {
			int ldX = x%10;
			int ldY=y%10;
			int sum = ldX + ldY + carry;
			x/=10;
			y/=10;
			carry =  sum/b;
			ans+=pow*(sum%b);
			pow*=10;
		}
		return ans;
	}
}
