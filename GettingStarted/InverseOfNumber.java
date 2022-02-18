package GettingStarted;
import java.util.*;

public class InverseOfNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(inverse(n,0,1));
}

static int inverse(int n,int ans,int i) {
	if(n==0) {	
		return ans;
	}
	
	return inverse(n/10,ans + ((int)Math.pow(10, (n%10) - 1)*(i)),i+1);
}
}
