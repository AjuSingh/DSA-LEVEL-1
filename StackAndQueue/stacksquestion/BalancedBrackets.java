package StackAndQueue.stacksquestion;
import java.util.*;
public class BalancedBrackets {
    public static void main(String[] args) {
        String str = "(a + b) + ((c + d))";
        System.out.println(isValid(str));
    }

    static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        int i=0;
        int n= str.length();
        while(i<n){
            if(str.charAt(i)!=')'){
                stack.push(str.charAt(i));
                i++;
            }else{
                int cnt=0;
                while(!stack.empty() && stack.peek()!='('){
                    cnt++;
                    stack.pop();
                }
                stack.pop();
                if(cnt==0){
                    return true;
                }
                i++;
                cnt=0;
            }
        }
        return false;
     }

}
