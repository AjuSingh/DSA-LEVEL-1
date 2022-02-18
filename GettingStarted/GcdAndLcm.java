package GettingStarted;
import java.util.*;

public class GcdAndLcm {
	public static void main(String[] args) {
		System.out.println(gcd(24,36));
	
	}
	
	static int gcd(int a,int b) {
		if(b%a==0) {
			return a;
		}
		
		return gcd(b,a%b);
	}
}
