package StackAndQueue.stacksquestion.Leetcode;
import java.util.*;
public class DecideString {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    String str = sc.next();
     System.out.println(decodeString(str));
     sc.close();
 } 
 
// Input: s = "3[a]2[bc]"
// Output: "aaabcbc"
// Example 2:

// Input: s = "3[a2[c]]"
// Output: "accaccacc"
// Example 3:

// Input: s = "2[abc]3[cd]ef"
// Output: "abcabccdcdcdef"

 public static String decodeString2(String s) {
    String ans = "";
    Stack<String> stack = new Stack<>();
    Stack<Integer> count = new Stack<>();
    String res="";
    for(int i=0;i<s.length();){
        char ch = s.charAt(i);
        if(s.charAt(i)>='0' && s.charAt(i)<='9'){
            int cnt = 0;
            while(s.charAt(i)>='0' && s.charAt(i)<='9'){
                cnt = 10*cnt + (s.charAt(i)-'0');
                i++;
            }
            count.push(cnt);
        }else if(ch=='['){
            stack.push(res);
            res = "";
            i++;
        }else if(ch==']'){
            String temp = stack.pop();
            int repeatTimes=count.pop();
           for(int j=0;j<repeatTimes;j++){
              temp+=res; 
           }
            res = temp;
            i++;
        }else{
            res+=ch;
            i++;
        }
    }
   return res;
}
 
 public static String decodeString(String s) {
     Stack<Integer> num = new Stack<>();
     Stack<String> str= new Stack<>();
     int cnt = 0;
   for(char ch:s.toCharArray()){
     if(Character.isDigit(ch)){
         cnt  = cnt*10 + (ch-'0');
     }else if(ch=='['){
         num.push(cnt);
         cnt = 0;
         str.push(ch+"");
     }else if(ch==']'){
         String cur = "";
         while(!str.empty() && !str.peek().equals("[")){
          cur = str.pop() + cur;   
         }
         //removing the [ this bracket
         str.pop();
         String temp = "";
         for(int j=1;j<=num.peek();j++){
             temp+=cur;
         }
         //adding the new string we made
         str.push(temp);
         //removing the cnt we used to make the upper string
         num.pop();
     }else{
         str.push(ch+"");
     }
 }
   String cur = "";
         while(!str.empty()){
          cur = str.pop() + cur;   
     }
     return cur;   
 }       
 
 
 
}
