package slidingWindow;

import java.util.*;

public class FindAllAnagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s2 = sc.next();
		String s1 = sc.next();
		System.out.println(findAnagrams(s2, s1));
		sc.close();
	}
		
//	Input: s = "cbaebabacd", p = "abc"
//	Output: [0,6]
//	Explanation:
//	The substring with start index = 0 is "cba", which is an anagram of "abc".
//	The substring with start index = 6 is "bac", which is an anagram of "abc".
//nothing changed only we need to put the index of each anagram we find in the string
//time complexity O(n) 
//Space complexity O(n)
	  public static List<Integer> findAnagrams(String s2, String s1) {
	       int perCnt[] = new int[26];
	       int ssCnt[] = new int[26];
	       List<Integer> list = new ArrayList<>();
	       if(s1.length()>s2.length()) return list;
	       for(int i=0;i<s1.length();i++){
	           perCnt[s1.charAt(i)-'a']++;
	           ssCnt[s2.charAt(i)-'a']++;
	       }
	        int len1 = s1.length();
	       if(isMatch(perCnt,ssCnt)) list.add(0);
	       for(int i=len1;i<s2.length();i++){
	           ssCnt[s2.charAt(i)-'a']++;
	           ssCnt[s2.charAt(i-len1)-'a']--;
	           if(isMatch(perCnt,ssCnt)) list.add(i-len1+1);
	       }
	      return list;  
	    }
	    
	      public static boolean isMatch(int[] str1,int[] str2){
	        for(int i=0;i<26;i++){
	            if(str1[i]!=str2[i]) return false;
	        }
	        return true;
	    }
}
