package Oops;
//    class A {
//     String name="Unknown";

//     public A(String name){
//         this.name=name;
//     }
// }
// we can access this A class because it is independ of other classes and it does not depend upon the outer classes which A class doesnt have
//we cant make outer class static because to make it static it needs to be property of some class 
//static means independent of object of that class
public class InnerClass {
    
   static class A {
        String name="Unknown";

        public A(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        A a = new A("Aju"); // can't access the method of class A because it depends upon the class InnerClass and
        //to get class A we need object of InnerClass
        //but if we make class A static it is independent of class InnerClass and we can get the A class
    }

    
}
