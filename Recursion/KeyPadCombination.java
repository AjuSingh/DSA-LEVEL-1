package Recursion;
import java.util.*;

public class KeyPadCombination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> ans = new ArrayList<>();
//		kpc(str,0,"",ans,arr);
		ans = getKpc(str);
		System.out.println(ans);
	}
	//to declare it globally
	static String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	static void kpc(String str,int i,String ans,ArrayList<String> temp,String[] arr){
		if(i==str.length()) {
			temp.add(ans);
			return;
		}
		
		int ind = str.charAt(i)-'0';
		String ss = arr[ind];
		for(int k=0;k<ss.length();k++) {
			kpc(str,i+1,ans+ss.charAt(k),temp,arr);
		}
	}
	
	static ArrayList<String> getKpc(String str){
		if(str.length()==0) {
			ArrayList<String> ans = new ArrayList<>();
			ans.add("");
			return ans;
		}
		
		char ch = str.charAt(0);
		ArrayList<String> temp = getKpc(str.substring(1));
		int ind = ch - '0';
		String ss = arr[ind];
		ArrayList<String> ans  = new ArrayList<>();
		for(int i=0;i<ss.length();i++){
			for(String sp:temp){
				ans.add(ss.charAt(i) + sp);
			}
		}
		return ans;
	}
	
	
	
}
