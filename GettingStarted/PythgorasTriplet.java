package GettingStarted;

import java.util.*;

public class PythgorasTriplet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = a;
		max = (b>max) ? b : max;
		max = (c>max) ? c : max;
		
		if(a==max){
		 System.out.println((c*c + b*b)==(a*a));
		}else if(b==max) {
			System.out.println((c*c + a*a)==(b*b));
		}else {
			System.out.println((a*a + b*b)==(c*c));
		}
	}
}
