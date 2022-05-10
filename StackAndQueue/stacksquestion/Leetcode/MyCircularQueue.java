package StackAndQueue.stacksquestion.Leetcode;

public class MyCircularQueue {
   private int[] data;
   private int size,front=-1,rear=-1;
   private int DEFAULT_SIZE=0; 
    public MyCircularQueue(int k) {
        size=0;
        DEFAULT_SIZE=k;
        data = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(isEmpty()){
            front++;
            rear++;
        }else{
            rear = (rear+1)%DEFAULT_SIZE;
        }
        data[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front = (front+1)%DEFAULT_SIZE; 
        size--;
        return true;
    }
    
    public int Front() {
     if(isEmpty()) return -1;
     return data[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return data[rear];
    }
    
    public boolean isEmpty() {
        if(size==0){
            //if our circular queue is 0 means make the front and end -1 to start from the beggining
            front=-1;
            rear=-1;
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(size==DEFAULT_SIZE) return true;
        return false;
    }
}
