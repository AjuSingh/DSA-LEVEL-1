package Recursion;
import java.util.*;
public class getMazePath {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	ArrayList<String> ans = getMazePath(1,1,n,m);
	System.out.println(ans);
}

static ArrayList<String> getMazePath(int i,int j,int n,int m){
	if(i==n && j==m) {
		ArrayList<String> ans = new ArrayList<>();
		ans.add("");
		return ans;
	}
	
	if(i>n || j>m) {
		ArrayList<String> ans = new ArrayList<>();
		return ans;
	}
	
	ArrayList<String> hp = getMazePath(i, j+1, n, m);
	ArrayList<String> vp = getMazePath(i+1, j, n, m);
	ArrayList<String> ans = new ArrayList<>();
	for(String ss:hp) {
		ans.add('h' + ss);
	}
	
	for(String ss:vp) {
		ans.add('v' + ss);
	}
	
	return ans;
}
}
