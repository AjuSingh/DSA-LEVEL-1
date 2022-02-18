package Recursion;
import java.util.*;

public class PrintEncoding {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		print(str,"");
	}
	
	static void print(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}else if(str.length()==1) {
			char ch = str.charAt(0);
			if(ch=='0') {
				return;
			}else {
				int chVal = str.charAt(0) - '0';
				char alph = (char)('a' + chVal - 1);
				System.out.println(ans + alph);
				return; 
			}
		}else {
			if(str.charAt(0)=='0') {
				return;
			}else {
				int chVal = str.charAt(0) - '0';
				char alph = (char)('a' + chVal - 1);
				print(str.substring(1), ans + alph);
			}
			
			
			String ss = str.substring(0,2);
			int chVal = Integer.parseInt(ss);
			if(chVal<=26) {
				char alph = (char)('a' + chVal -1);
				print(str.substring(2),ans + alph);
			}
		}
	}
}
