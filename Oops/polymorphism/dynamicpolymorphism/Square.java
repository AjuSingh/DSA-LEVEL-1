package Oops.polymorphism.dynamicpolymorphism;

//to prevent overriding or loading just add final and overriding is prevented
public class Square extends Shapes {
    void area(){
        System.out.println("Area of square is side*side");
    }
    
}
