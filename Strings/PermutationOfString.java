package Strings;
import java.util.*;
public class PermutationOfString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	int n = str.length();
	long tot = fact(n);
    for(long i=0;i<tot;i++){
    	StringBuilder temp = new StringBuilder(str);
    	long num = i;
    	int den = n;
    	while(den>0) {
    		int ind = (int)num%den;
    		System.out.print(temp.charAt(ind));
    		temp.deleteCharAt(ind);
    		num/=den;
    		den--;
    	}
    	System.out.println();
    }
}

static long fact(int n) {
	long ans =1;
	for(int i=2;i<=n;i++) {
		ans*=i;
	}
	return ans;
}
}
