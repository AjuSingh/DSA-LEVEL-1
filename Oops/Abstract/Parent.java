package Oops.Abstract;
public abstract class Parent {
//this methods must be ovverriden by the subclasses

//we can create simple variables and methods
int num;

void greet(){
    System.out.println("Hello to all!");
}


//we can't create constructor of abstract classes because it doesn't allow to make object of abstract class
//it is sense less for having constructor of abstract class becasue it doesn't allow to create object
//we can create static methods of abstract class because it is independent of object
//we can't ovverride static methods because it  doesn't depend on object


abstract void  aim();
//both mehtods must be implemented in the sub classes
abstract void partner();
}
