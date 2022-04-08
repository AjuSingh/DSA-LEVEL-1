package StackAndQueue;

public class CustomStack {
    private int max = 1000;
    private int[] arr = new int[max];
    private static int index = -1;


    int pop(){
        if(index == -1){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return arr[index--];
        }
    }

    void push(int val){
        if(index>=max){
            System.out.println("Stack is full");
        }else{
            index++;
            arr[index] = val; 
        }
    }

    int size(){
        return index+1;
    }
   
    boolean isEmpty(){
        if(index<0){
            return true;
        }
        return false;
    }

    CustomStack(){
        System.out.println("Stack created");
    }

}
