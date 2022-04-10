package StackAndQueue.stacksquestion;

public class Main {
    public static void main(String[] args) throws Exception {
        MinStack ms = new MinStack();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);
        ms.push(5);
        ms.push(6);
        System.out.println(ms.size());
    }
}
