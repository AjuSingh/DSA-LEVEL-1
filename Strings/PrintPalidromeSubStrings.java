package Strings;
import java.util.*;
public class PrintPalidromeSubStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				if(isPal(str,i,j)) {
					System.out.println(str.substring(i,j+1));
				}
			}
		}
	}
	
	static boolean isPal(String str,int s,int e) {
		while(s<=e) {
			if(str.charAt(s)!=str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}
