package Strings;

import java.util.*;

public class StringCompression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(comp1(str));
		System.out.println(comp2(str));
	}

//we need  to remove the duplicates and then return the string
	static String comp1(String str) {
		String ans = "";
		char pre = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != pre) {
				ans += pre;
				pre = str.charAt(i);
			}
		}

		if (ans.length() == 0 || pre != ans.charAt(ans.length() - 1)) {
			ans += pre;
		}
		return ans;
	}

	static String comp2(String str) {
		String ans = "";
		int cnt = 1;
		char pre = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != pre) {
				ans += pre;
				ans = cnt == 1 ? ans : ans + cnt;
				pre = str.charAt(i);
				cnt = 1;
			} else {
				cnt++;
			}
		}
//		abcdwqrec
//		a7b6c6d4w2q2rec

		if (ans.length() == 0 || pre != ans.charAt(ans.length() - 1)) {
			ans += pre;
			ans = cnt == 1 ? ans : ans + cnt;
		}
		return ans;
	}
}
