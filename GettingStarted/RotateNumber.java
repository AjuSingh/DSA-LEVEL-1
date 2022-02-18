package GettingStarted;

import java.util.*;

public class RotateNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int len = (int) (Math.log10(n) + 1);
		int r = k;
		r = k < 0 ? r * -1 : r;
		r = r % len;
		r = (k < 0) ? len - r : r;
		int pow = (int) (Math.pow(10, r));
		int restPow = (int) (Math.pow(10, len - r));
		int front = n % pow;
		int end = n / pow;
		front *= restPow;
		front += end;
		System.out.println(front);
	}
}
