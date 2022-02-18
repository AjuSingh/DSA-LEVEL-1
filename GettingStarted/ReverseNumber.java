package GettingStarted;
import java.util.*;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		long k = sc.nextLong();
		long len = (long) (Math.log10(number) + 1);
		if (k >= 0) {
			k = (k >= len) ? k%len : k;
			while (k > 0) {
				long rem = number % 10;
				number /= 10;
				long temp = (long) Math.pow(10, len - 1);
				number += temp * rem;
				k--;
			}
		} else {
			k *= -1;
			k = (k >= len) ? k%len : k;
			while (k > 0) {
				number = remNum(number, 0, 0,len-1);
				k--;
			}
		}
		System.out.println(number);
	}

	static long remNum(long n, long i, long ans,long len) {
		if (i==len) {
			return ans * 10 + n % 10;
		}
		long rem = (n%10==0) ? 1 : n%10; 
		return remNum(n / 10, i + 1, ans + (rem * (long) Math.pow(10, i)),len);
	}

}
