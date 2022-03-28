package Oops.interfaces.extendinginterfaces;

//means all the methods of A are available in the interface B
//now if someone implements B it need to implements the methods of A and B both
public interface B extends A {
    void stop();
}
