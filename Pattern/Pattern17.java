package Pattern;

import java.util.*;

public class Pattern17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int spaces = n / 2;
		int mid = n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			if (i != mid) {
				for (int j = 1; j <= spaces; j++) {
					System.out.print("\t");
				}
			}

			if (i == mid) {
				for (int j = 1; j <= spaces; j++) {
					System.out.print("*\t");
				}
			}

			int star = (i <= mid) ? i : n + 1 - i;
			for (int j = 1; j <= star; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
}
