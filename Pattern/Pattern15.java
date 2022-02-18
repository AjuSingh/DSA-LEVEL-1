package Pattern;

import java.util.*;

public class Pattern15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int spaces = n / 2;
		int occ = 1;
//		1	
//	2	3	2	
//3	4	5	4	3	
//	2	3	2	
//		1
		int mid = (n + 1) / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print("\t");
			}
			int t = (i <= mid) ? i : n + 1 - i;
			for (int j = 1; j <= occ; j++) {
				System.out.print(t + "\t");
				if (j <= occ / 2) {
					t++;
				} else {
					t--;
				}
			}

			if (i <= n / 2) {
				spaces--;
				occ += 2;
			} else {
				spaces++;
				occ -= 2;
			}
			System.out.println();
		}
	}
}
