package Oops.interfaces;

//now in abstarct classes we can extends only one classes
//here we can implement two interface
public class Car implements Engine,Brake {
    
    //now here
    @Override
    public void brake() {
        System.out.println("It will use the disc type brakes");
        
    }

    @Override
    public void start() {
        System.out.println("It self started car");
    }

    @Override
    public void stop() {
     System.out.println("It uses the brake to stop");   
    }

    @Override
    public void sound() {
        System.out.println("Its sound is broom broom...");
    }
    
}
