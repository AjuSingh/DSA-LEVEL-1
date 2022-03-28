package Oops.polymorphism.staticpolymorphism;

public class Calculator {
    //this type of polymorphism is achieved by method overloading
    //only return type does not change the methods 
    //name of only name of method is required to same
    //change parameters return type order of paramerter in the method when they all are different
    //it is also known as compile time polymorphism
    //because at compile time check is that method is present or not

	int add(int a,int b)
    {
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
}
