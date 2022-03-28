package Oops.polymorphism.dynamicpolymorphism;

public class Circle extends Shapes {
    //we are overrding the area method of parent class ie Shapes area method
    //over riding is simply change in the body of method not in the return type and name
    //only body is changed then over riding 
    void area(){
        System.out.println("Area of circle is pie*r*r");
    }
}
