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
    
    
    
    public static int[] asteroidCollision2(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(!stack.empty() && stack.peek()>=0 && arr[i]<0){
                int flag=0;
                //we will run our loop untill one is positive and other is negative
                while(!stack.empty() && stack.peek()>=0 && arr[i]<0 && flag!=1){
                    if(stack.peek()>-arr[i]){
                        flag=1;
                    }else if(stack.peek()==-arr[i]){
                        stack.pop();
                        flag=1;
                    }else{
                      flag=2;
                      stack.pop();   
                    }
                }
                //this condition because if the arr[i] abs is greater than we need to put it into the array;
                if(flag==2) stack.push(arr[i]);
            }else{
                stack.push(arr[i]);
            }
        }
        int[] ans = new int[stack.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i] = stack.pop();
        }
       return ans;
       }
       
}
