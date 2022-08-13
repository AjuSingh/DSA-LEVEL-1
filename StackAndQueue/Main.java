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

//        CircularQueue cq  = new CircularQueue();
//        cq.insert(1);
//        cq.insert(2);
//        cq.insert(3);
//        cq.insert(4);
//        cq.insert(5);
//        System.out.println(cq.peek());
//        System.out.println(cq.peek());
//        cq.insert(6);
//        cq.insert(7);
//        System.out.println(cq.peek());
//        System.out.println(cq.peek());
//        System.out.println(cq.peek());
//        System.out.println(cq.peek());
//        System.out.println(cq.peek());
    	
//    	CustomArrayList<Integer> list = new CustomArrayList<>();
//    	list.add(1);
//    	list.add(2);
//    	list.add(3);
//    	list.add(4);
//    	list.add(5);
//    	list.add(6);
//    	System.out.println(list);
    	
    	
    	
    	StackUsingLl<Integer> st = new StackUsingLl<>();
    	st.push(1);
    	st.push(2);
    	st.push(3);
    	st.push(4);
    	while(st.size()>0) {
    		System.out.println(st.remove());
    	}
    
    	

        
    }
}
