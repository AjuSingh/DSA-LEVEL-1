package FunctionAndArrays;
import java.util.*;
public class SubArrays {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	//i and j will change the range to print
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			for(int k=i;k<=j;k++) {
				System.out.print(arr[k] + "\t");
			}
			System.out.println();
		}
	}
}
}
