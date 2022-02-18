package Pattern;

import java.util.*;

public class Pattern6 {
	public static void main(String[] args) {
//		*	*	*		*	*	*	
//		*	*				*	*	
//		*						*	
//		*	*				*	*	
//		*	*	*		*	*	*	
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = (n+1)/2;
		int spaces = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*\t");
			}
			
			for(int j=1;j<=spaces;j++) {
				System.out.print("\t");
			}
			
			for(int j=1;j<=star;j++) {
				System.out.print("*\t");
			}
			
			
			if(i<=n/2) {
				star--;
				spaces+=2;
			}else {
				star++;
				spaces-=2;
			}
			
			System.out.println();
		}

	}
}
