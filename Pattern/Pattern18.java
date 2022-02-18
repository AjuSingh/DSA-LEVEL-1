package Pattern;

import java.util.*;

public class Pattern18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	*	*	*	*	*	*	*	*	1
//		*				*			2
//			*		*				3
//				*					4
//			*	*	*				5
//		*	*	*	*	*			6
//	*	*	*	*	*	*	*		7
		int n = sc.nextInt();
		int star=n;
		int spaces=0;
		for (int i = 1; i <= n; i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print("\t");
			}
			
			for(int s=1;s<=star;s++) {
				if(i>1 && i<=n/2 && s>1 && s<star) {
					System.out.print("\t");
				}else {					
					System.out.print("*\t");
				}
			}
			
			
			if(i<=n/2) {
				spaces++;
				star-=2;
			}else {
				spaces--;
				star+=2;
			}
			System.out.println();
		}
	}
}
