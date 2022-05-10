package slidingWindow;
import java.util.*;
public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(lengthOfLongestSubstring(str));
		sc.close();
	}
	
	  public static int lengthOfLongestSubstring(String s) {
	        if(s.length()==0) return 0;
	        HashMap<Character,Integer> hp = new HashMap<>();
	        int max = 0,n=s.length();
	        for(int i=0,j=0;j<n;j++){
	            if(hp.containsKey(s.charAt(j))){
	                while(s.charAt(i)!=s.charAt(j)) hp.remove(s.charAt(i++));
	           }else{
	                hp.put(s.charAt(j),1);
	            }
	          max=Math.max(max,hp.size());
	        }
	     return max;
	    }

}
