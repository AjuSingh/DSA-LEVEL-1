package Oops.Abstract;

public class Main {
    //if we trying to make object of parent class it shows error
    public static void main(String[] args) {
     Son son = new Son();
     son.aim();
     Daughter daughter = new Daughter();
     daughter.partner();   

     //we can access simple methods too 
     son.greet();
     //because it inherit the properties of parent class
    }
    
}
