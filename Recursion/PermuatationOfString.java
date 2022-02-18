package Recursion;

import java.util.*;

public class PermuatationOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printPermuation(str, "");
	}

	static void printPermuation(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ss = str.substring(0, i) + str.substring(i + 1);
			printPermuation(ss, ans + ch);
		}
	}

}
