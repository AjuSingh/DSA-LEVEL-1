package Oops;
import java.util.*;
public class Classes {
    public static void main(String[] args) {
        // we will create class of our own data type
       final Student s1 = new Student(1,"Ajvinder");
        System.out.println(s1.roll + " " + s1.name);

        //we can assign the value of one object in another if it is not final

        //Integer is wrapper class and the refrence variable refer to it is act as object 
        Integer a = 10;
        //we can access the methods we cant have in the simple primitive data

        //final keyword prevent the reinitialization of that refrence variable
        // if i try to change the value of s1 i wont we able to change it
        // s1 = new Student(2,"Kaman"); it show error

        
    }

}

class Student {
    int roll;// these are the instance variables
    String name;

    // if we dont define arguements in the student constructor then
    Student() {
        this(1, "dummy_value");
    }

    // costructer is special function of same name as class name it is automatically
    // invoked when object is created
    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    //we cant delete the object inside the heap memory
    //garbage collector delete the objects with no refrence variable
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("object is destroyed");
        super.finalize();
    }
}
