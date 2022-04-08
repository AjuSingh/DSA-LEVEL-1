package StackAndQueue;

public class CircularQueue {
    private int[] data;
    private int size=0;
    private int DEFAULT_SIZE=5;
    private int start =0;
    private int end = 0;
    CircularQueue(){
        data = new int[DEFAULT_SIZE];
    }


    void insert(int val) throws Exception{
        if(size==DEFAULT_SIZE){
            throw new Exception("Queue is full..");
        }
        data[end++] = val;
        end = end%DEFAULT_SIZE;
        size++;
        return;
    }


    int peek() throws Exception{
       if(size==0){
           throw new Exception("Queue is empty..");
       }
       size--;
       int value = data[start++];
       start = start%DEFAULT_SIZE;
       return value;
    }

    int size(){
    return size;
    }


    
}
