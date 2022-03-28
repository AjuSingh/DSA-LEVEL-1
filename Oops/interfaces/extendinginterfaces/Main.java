package Oops.interfaces.extendinginterfaces;

//here we are implements interface B but B extends A thats why we need ot over ride both
public class Main implements B {

    @Override
    public void start() {
        System.out.println("I am method of interface A");
    }

    @Override
    public void stop() {
        System.out.println("I am method of interface B"); 
    }
    

    public static void main(String[] args) {
        Main obj = new Main();
        obj.start();
        obj.stop();
        //we didn't ovveride it because it has special value
        obj.special();


       C obj2 = new C();
       System.out.println(obj2.isOdd(22));
       
    }
}
