package Oops.interfaces.extendinginterfaces;

//default is used and it feature introduced in java 8 such that we dont need to override if dont needed
public interface A {
    void start();

    default void special(){
        System.out.println("I am a special method because I don't need to overriden in another class");
    }
}
