package Oops.polymorphism.dynamicpolymorphism;

//here it is achieved by method overrinding in this the signature of method is same only body of method is changes
//and we only make changes in the body of the method we are overriding
public class Main {
  public static void main(String[] args) {
    Shapes shape = new Shapes();
    Circle circle = new Circle();
    Square square = new Square();
    Shapes  square2 = new Square();
// refrence type         object type
//refrence type give the all method and instance variables 
//after overring we have diffrent versions of same method so object type decide which method is choosen at the time of run time
//thats why squre method is callled in line 9
// this is known as compile time polymorphism because to check whether this method exist or not
//only memory allocation and functionality done while run time
// in compile time polymorphism defination of methods are same only body of that function may or may not be changed
    shape.area();
    circle.area();
    square.area();
    // this take the method in object type not in refrence type
    square2.area();
    //now here it polymorphism where method is one and we are overrding that method in child classes of Shapes
    //representing the same thing in different ways

    //overloading is defined as method name is same but change in return type parameters order of paramter of diffrent data types

  }

  void add(int a,int b){

  }
  //this method is same as above so this is not possible
//   void add(int b,int a){

//   }

//but

void print(String str,int b){

}

//now both datatypes are of diffrent types and their order is diffrent
void print(int b,String str){
    
}


}
