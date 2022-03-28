package Oops.interfaces;


//interfaces are just like abstract classes
//we can't define constructor interfaces
//it only contains abstract methods and variables which are final static
//ie we can only initialize the variables one time
//we dont have constructor because the variables of interface are final 
public interface Engine {
     int value=10000;
    
     //if some class implements the interface it need to override the all methods
     //all things in interface are public
     void start();
     void stop();
     void sound();
}
