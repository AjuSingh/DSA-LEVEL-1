package StackAndQueue.stacksquestion;

public class MinStack2 {
    private Node head;
    public MinStack2() {
    }
    
    public void push(int val) {
        if(head==null){
            head = new Node(val,val,null);
        }else{
            //head always points to the first node
            head = new Node(val,Math.min(val,head.min),head);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}

class Node{
    int val;
    int min;
    Node next;
    
    Node(int val,int min,Node next){
        this.val = val;
        this.min = min;
        this.next = next;
    }

}

