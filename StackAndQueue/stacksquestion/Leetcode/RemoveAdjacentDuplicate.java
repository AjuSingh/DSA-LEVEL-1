package StackAndQueue.stacksquestion.Leetcode;

import java.util.*;

public class RemoveAdjacentDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(removeDuplicates(str));
    }

// Input: s = "abbaca"
// Output: "ca"
// Explanation: 
// For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, 
// and this is the only possible move.  The result of this move is that the string is "aaca", 
// of which only "aa" is possible, so the final string is "ca".

    public static String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder("");
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (size > 0 && s.charAt(i) == ans.charAt(size - 1)) {
                ans.deleteCharAt(size - 1);
                size--;
            } else {
                ans.append(s.charAt(i));
                size++;
            }
        }
        return ans.toString();
    }
}
