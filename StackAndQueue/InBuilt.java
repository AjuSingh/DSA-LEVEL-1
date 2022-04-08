package StackAndQueue;
import java.util.*;


public class InBuilt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // //Last In first Out
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);
        // // stack.push();
        // while(!stack.empty()){
        //     System.out.println(stack.pop());
        // }

        //queue inbuilt is interface which is implemented by linked list
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        //now is we want to insert it will be pushed at the end of the queue
        //if we want to remove it will be removed at the front 
        System.out.println(queue.peek()); //it will give the head of the queue
        System.out.println(queue.remove()); //remove the front element
    }
}
