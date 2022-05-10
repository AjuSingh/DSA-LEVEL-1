package slidingWindow;

import java.util.*;

public class SlidingWindowMinimum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(minWindow(s,t));
	}

	
//	Input: s = "ADOBECODEBANC", t = "ABC"
//	Output: "BANC"
//	Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

	public static String minWindow(String s, String t) {
		if (t.length() > s.length())
			return "";
		HashMap<Character, Integer> shm = new HashMap<>();
		HashMap<Character, Integer> thm = new HashMap<>();
		for (char ch : t.toCharArray()) {
			thm.put(ch, thm.getOrDefault(ch, 0) + 1);
		}
		int n = s.length();
		//we are starting from the -1 because we need the current index thats why
		//while using -1 we need to point check at the right side because we dont know if we are at last index or not
		int l = -1, r = -1;
		String ans = "";
		int cntMatch = 0;
		while (r < n) {
			if (cntMatch == t.length()) {
				l++;
				ans = ans.equals("") || (r - l + 1 < ans.length()) ? s.substring(l, r + 1) : ans;
				char left = s.charAt(l);
				if (thm.containsKey(left) && shm.getOrDefault(left, 0) <= thm.getOrDefault(left, 0)) {
					cntMatch--;
				}
				shm.put(left, shm.getOrDefault(left, 0) - 1);
			} else {
				//extra condition for the end.....
				if (r + 1 < n) {
					r++;
				} else {
					r++;
					continue;
				}
				char right = s.charAt(r);
				if (thm.containsKey(right) && shm.getOrDefault(right, 0) < thm.getOrDefault(right, 0)) {
					cntMatch++;
				}
				shm.put(right, shm.getOrDefault(right, 0) + 1);
			}
		}

		return ans;
	}
}
