package DynamicProgramming;

import java.util.*;

public class Fibbonaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//most optimal approach
		int n = sc.nextInt();
		int prev1 = 0;
		int prev2=  1;
		for(int i=2;i<=n;i++) {
				int cur = prev1 + prev2;
				prev1 = prev2;
				prev2 = cur; 
		}
		
		System.out.println(prev2);
	}
}
