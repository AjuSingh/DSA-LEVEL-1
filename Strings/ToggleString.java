package Strings;
import java.util.*;

public class ToggleString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
//		String ans = "";
//		for (int i = 0; i < str.length(); i++) {
//			if (Character.isUpperCase(str.charAt(i))) {
//				ans += Character.toLowerCase(str.charAt(i));
//			} else {
//				ans+= Character.toUpperCase(str.charAt(i));
//			}
//		}
//		System.out.println(ans);
		System.out.println(toggle(str));
	}
	
	
	static String toggle(String str) {
		String ans = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z') {
				ans+=(char)('A' + ch - 'a');
			}else {
				ans+=(char)('a' + ch - 'A');
			}
		}
		return ans;
	}
}
