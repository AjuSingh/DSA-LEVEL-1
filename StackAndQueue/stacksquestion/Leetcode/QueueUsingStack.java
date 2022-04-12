package StackAndQueue.stacksquestion.Leetcode;
import java.util.*;
public class QueueUsingStack {
    Stack<Integer> front,tail;
    public QueueUsingStack() {
        front = new Stack<>();
        tail = new Stack<>();
    }
    
    public void push(int x) {
        front.push(x);
    }
    
    public int pop() {
      peek();
      return tail.pop();
    }
    
    public int peek() {
        //we will only insert elements if and only if the tail is empty means the stack which has peek element
        if(tail.empty()){
          while(!front.empty()){
              tail.push(front.pop());
          }  
        }
        return tail.peek();
    }
    
    public boolean empty() {
        //we have two array thats why is both of them are empty only then we will push
        return front.empty() && tail.empty();
    }
}
