package Oops.Abstract;

public class Son extends Parent {
    
    //if we don't want to implement this methods make class abstarct
    @Override
    void aim() {
        System.out.println("I want to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love wonder woman");
    }
    
}
