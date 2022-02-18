package Pattern;

import java.util.*;

public class Pattern16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int spaces = 2 * (n - 1) - 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "\t");
			}
			for (int s = 0; s <= spaces; s++) {
				System.out.print("\t");
			}

			for (int j = i; j >= 1; j--) {
				if (j != n) {
					System.out.print(j + "\t");
				}
			}
			spaces -= 2;
			System.out.println();
		}
	}
}
