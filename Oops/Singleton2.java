package Oops;

public class Singleton2 {
  public static void main(String[] args) {
          // Singleton ss = new Singleton(); //if we do this it is not accessable because the constructer is private
    //so we will access the method of Singleton which is static
    Singleton obj1 = Singleton.createInstance();
    Singleton obj2 = Singleton.createInstance();
    Singleton obj3 = Singleton.createInstance();
    // they are reffering to same instance
    System.out.println(obj1); 
    System.out.println(obj2); 
    System.out.println(obj3);
  }

}
