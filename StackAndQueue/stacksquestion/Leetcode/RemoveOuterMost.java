package StackAndQueue.stacksquestion.Leetcode;
import java.util.*;
public class RemoveOuterMost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(removeOuterParentheses(str));
    }

// Input: s = "(()())(())(()(()))"
// Output: "()()()()(())"
// Explanation: 
// The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
// After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".

    public static String removeOuterParentheses(String s) {
        String str = "";
        int sum=0;
        //sum is check mark for start and when sum is 1 ) this occurs means only one bracket is there so dont add to it in answer
        
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(') {
                str = (sum>0) ? str+s.charAt(i) : str; 
                sum+=1;
            }else{
                sum-=1;
                str = (sum>0) ? str+s.charAt(i) : str; 
            }
        }
        return str;
       }
}
