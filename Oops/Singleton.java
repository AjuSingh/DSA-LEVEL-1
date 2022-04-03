package Oops;

//it is class which allows to create only one instance of a class
public class Singleton {

private Singleton(){
//it can be accessable with in this class and cant be instantiated  in another class    
}

//making it static because it is not allowed to access constructor
private static Singleton instance; //making private because prevent the change in the value of created object by this class
//here this method is created to get the object of this class but only one time object is created
//after that the created instance is returned
static Singleton createInstance(){
    if(instance==null){
        instance = new Singleton();
    }
    return instance;
}
    
}
