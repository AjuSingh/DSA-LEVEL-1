package GettingStarted;
import java.util.*;
public class BenjaminBulbs {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	//perfect square has odd no of factors and thats why perfect square is turned on
	for(int i=1;i*i<=n;i++) {
		System.out.println(i*i);
	}
}
}
