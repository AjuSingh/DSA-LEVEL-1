package Oops;

public class staticBlock {
    static int a=10;
    static int b;

    static{
        System.out.println("This block only run once when a first object is created!");
        b = a*3;
    }

    public static void main(String[] args) {
        // staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a  + " " + staticBlock.b); // static block run
        
        staticBlock.b+=5;
        // staticBlock ob2 = new staticBlock();
        // static block run only one time 
        System.out.println(staticBlock.a  + " " + staticBlock.b); //static block run
        }
}
