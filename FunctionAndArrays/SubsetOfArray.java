package FunctionAndArrays;
import java.util.*;
public class SubsetOfArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
//	List<Integer> list = new ArrayList<>();
//	print(arr,0,n,list);
	int tot=(int)(Math.pow(2, n));
	for(int i=0;i<tot;i++) {
		int temp  = i;
		String str = "";
		for(int j=n-1;j>=0;j--) {
			int rem = temp%2;
			temp/=2;
			if(rem==0) {
				str = "-\t" + str;
			}else {
				str = arr[j] + "\t" + str;
			}
		}
		System.out.println(str);
	}
}

static void subset(int[] arr,int i,int n,String str) {
	if(i==n) {
		System.out.println(str);
		return;
	}

	subset(arr,i+1,n,str + "-\t");
	subset(arr,i+1,n,str + arr[i] + "\t");
}

 static void print(int[] arr, int i, int n, List<Integer> list) {
	if(i==n) {
		System.out.println(list);
		return;
	}
	print(arr,i+1,n,list);
	list.add(arr[i]);
	print(arr,i+1,n,list);
	list.remove(Integer.valueOf(arr[i]));
}
}
