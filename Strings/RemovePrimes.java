package Strings;
import java.util.*;
public class RemovePrimes {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<>();
	int n = sc.nextInt();
	for(int i=0;i<n;i++) {
		list.add(sc.nextInt());
	}
	
	for(int i=0;i<list.size();i++) {
		if(isPrime(list.get(i))) {
			list.remove(i);
			i--;
		}
	}
	
	System.out.println(list);
	
}

	static boolean isPrime(int x) {
		for(int i=2;i*i<=x;i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}

}
