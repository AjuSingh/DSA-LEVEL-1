package StackAndQueue.stacksquestion.Leetcode;
import java.util.*;
public class MinAddToMakeParenThesisValid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        System.out.println(minAddToMakeValid(str));
        sc.close();
    }

    public static int minAddToMakeValid(String s) {
        int not_opened = 0,not_closed=0;
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='('){
              not_closed++;
          }else if(not_closed>0){
              not_closed--;
          }else{
              not_opened++;
          }
        }
        return not_closed+not_opened;
    }
}
