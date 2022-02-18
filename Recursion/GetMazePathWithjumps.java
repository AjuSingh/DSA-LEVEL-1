package Recursion;
import java.util.*;
public class GetMazePathWithjumps {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	ArrayList<String> ans = getPath(1,1,n,m);
	System.out.println(ans);
}

 static ArrayList<String> getPath(int i, int j, int n, int m) {
	if(i==n && j==m) {
		ArrayList<String> ans = new ArrayList<>();
		ans.add("");
		return ans;
	}
	
	if(i>n || j>m) {
		ArrayList<String> ans = new ArrayList<>();
		return ans;
	}
	//horizontal move
	ArrayList<String> ans = new ArrayList<>();
	for(int h=1;h<=m;h++) {
		ArrayList<String> hp = getPath(i,j+h,n,m);
		for(String ss:hp) {
			ans.add("h" + h + ss);
		}
	}
	
	//vertical move
	for(int v=1;v<=n;v++) {
		ArrayList<String> vp = getPath(i+v,j,n,m);
		for(String ss:vp) {
			ans.add("v" + v + ss);
		}
	}
	//diagonal move
	int min = n<m ? n : m; 
	for(int d=1;d<=min;d++) {
		ArrayList<String> dp = getPath(i+d,j+d,n,m);
		for(String ss:dp) {
			ans.add("d" + d + ss);
		}
	}
	
	return ans;
}
}
