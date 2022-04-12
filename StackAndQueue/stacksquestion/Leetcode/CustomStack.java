package StackAndQueue.stacksquestion.Leetcode;
import java.util.*;
public  class CustomStack {
        private Stack<Integer> stack;
        public CustomStack(int maxSize) {
            stack = new Stack<>();
            stack.setSize(maxSize);
        }
        
        public void push(int x) {
            if(stack.size()!=stack.capacity()){
               stack.push(x);       
            }
        }
        
        public int pop() {
            if(stack.empty()){
                return -1;
            }
            return stack.pop();
        }
        
        public void increment(int k, int val) {
            Stack<Integer> temp = new Stack<>();
            while(!stack.empty()){
                 temp.push(stack.pop());
            }
            
            while(!temp.empty() && k>0){
                stack.push(temp.pop());
                k--;
            }
        }
    }
