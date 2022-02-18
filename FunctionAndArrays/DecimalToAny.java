package FunctionAndArrays;
import java.util.*;


public class DecimalToAny {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int b = sc.nextInt();
	int ans = getAns(n,b,0,0);
	System.out.println(ans);
}
	static int getAns(int n,int b,int ans,int i) {
		if(n==0) {
			return ans;
		}
		return getAns(n/b,b,ans + (int)(Math.pow(10, i))*(n%b),i+1);
	}
}
