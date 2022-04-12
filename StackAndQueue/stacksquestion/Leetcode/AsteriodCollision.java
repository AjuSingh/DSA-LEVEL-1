package StackAndQueue.stacksquestion.Leetcode;
import java.util.*;
public class AsteriodCollision {
    public static void main(String[] args) {
        //-a means if a is positive then make it negative
    }


    public static int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i=0;
        while(i<arr.length){
            if(stack.empty()){
                stack.push(arr[i++]);
            }else if(stack.peek()>0 && arr[i]<0){
                //destroy
                int flag=0;
                while(!stack.empty()&&stack.peek()>0&&arr[i]<0){
                    if(stack.peek()<-(arr[i])){
                        stack.pop();
                        flag=0;
                    }else{
                       if(stack.peek()==(-arr[i])) stack.pop();
                       flag=1;
                        break;
                    }  
                }
                 if(flag==0) stack.push(arr[i]);
                 i++;
            }else{
                stack.push(arr[i++]);
            }
        } 
            int size = stack.size();
            int[] ans = new int[size];
            for(int j=size-1;j>=0;j--){
                ans[j] = stack.pop();
            }
           return ans;
       }
}
