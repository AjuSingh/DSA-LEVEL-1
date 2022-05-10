package slidingWindow;
import java.util.*;
public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(checkInclusion(s1, s2));
	}
	
//	Input: s1 = "ab", s2 = "eidbaooo"
//    Output: true
//	Explanation: s2 contains one permutation of s1 ("ba").
	
	  public static boolean checkInclusion(String s1, String s2) {
	       if(s1.length()>s2.length()) return false;
	       int perCnt[] = new int[26];
	       int ssCnt[] = new int[26];
	       //first window we will move to check if they contain the substring or not
	       for(int i=0;i<s1.length();i++){
	           perCnt[s1.charAt(i)-'a']++;
	           ssCnt[s2.charAt(i)-'a']++;
	       }
	        int len1 = s1.length();
	        if(isMatch(perCnt,ssCnt)) return true;
	        //now remove the leftmost and add rightmost
	       for(int i=len1;i<s2.length();i++){
	           ssCnt[s2.charAt(i)-'a']++;
	           ssCnt[s2.charAt(i-len1)-'a']--;
	           //checking if they both are same
	           if(isMatch(perCnt,ssCnt)) return true;
	       }
	      return false;   
	    }
	    
	    public static boolean isMatch(int[] str1,int[] str2){
	        for(int i=0;i<26;i++){
	            if(str1[i]!=str2[i]) return false;
	        }
	        
	        return true;
	    }

}
