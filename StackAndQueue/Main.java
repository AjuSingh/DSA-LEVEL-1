package StackAndQueue;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // CustomStack stack = new CustomStack();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);
        
        // while(!stack.isEmpty()){
        //     System.out.println(stack.pop());
        // }
        // Stack<Integer> st = new

        CircularQueue cq  = new CircularQueue();
        cq.insert(1);
        cq.insert(2);
        cq.insert(3);
        cq.insert(4);
        cq.insert(5);
        System.out.println(cq.peek());
        System.out.println(cq.peek());
        cq.insert(6);
        cq.insert(7);
        System.out.println(cq.peek());
        System.out.println(cq.peek());
        System.out.println(cq.peek());
        System.out.println(cq.peek());
        System.out.println(cq.peek());

        //we implemented cicular queue
        
    }
}
