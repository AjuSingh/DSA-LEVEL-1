package Recursion;
import java.util.*;
public class JumpStairCase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<String> ans = new ArrayList<>();
    getStairPath(ans,n,"");
    System.out.println(ans);
    
}

 static void getStairPath(ArrayList<String> ans, int n,String ss) {
	if(n==0) {
		ans.add(ss);
		return;
	}
	if(n<0) {
		return;
	}
	
	
	getStairPath(ans, n-1, ss + 1);
	getStairPath(ans,n-2,ss+2);
	getStairPath(ans,n-3,ss+3);
}
}
