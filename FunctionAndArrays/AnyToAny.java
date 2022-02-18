package FunctionAndArrays;
import java.util.*;

public class AnyToAny {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int b = sc.nextInt();
	int db = sc.nextInt();
	int ans = getDecimal(n, b, 0, 0);
	ans = decimalToAny(ans, db, 0, 0);
	System.out.println(ans);
}

//any to any require two functions 
//one is need to convert the any to decimal 
//and when we get the decimal we can connvert to any base

static int decimalToAny(int n,int b,int ans,int i) {
	if(n==0) {
		return ans;
	}

	return decimalToAny(n/b, b, ans + (int)(Math.pow(10, i))*(n%b), i+1);
}


static int getDecimal(int n,int b,int ans,int i) {
	if(n==0) {
		return ans;
	}
	
	return getDecimal(n/10,b,ans + (int)(Math.pow(b, i))*(n%10),i+1);
	
}



}


