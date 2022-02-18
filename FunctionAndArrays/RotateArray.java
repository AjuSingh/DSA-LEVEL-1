package FunctionAndArrays;

import java.util.*;

public class RotateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int r = k<0 ? k*-1 : k;
		r%=n;
		r = k<0 ? n - r : r;
		rotate(arr,0,n-1); // rotating the whole array
		rotate(arr,0,r-1); // rotate untill r-1
		rotate(arr,r,n-1); // rotate end
		System.out.println(Arrays.toString(arr));
	}
	
	
	static void rotate(int[] arr,int i,int j) {
		while(i<=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return;
	}
}
