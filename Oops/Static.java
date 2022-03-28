package Oops;

public class Static {
    //static varaible is used to access the property of the class without create an instance of that class
    //main function is static because we are accessing the method of main class without creating instance of the class main
    //also it is entry point of the program so main is required
    public static void main(String[] args) {
        // Human kunal = new Human("kunal",22,10000);
        // Human ramesh = new Human("ramesh",20,8000);
        // Human kamlesh = new Human("kamlesh",21,6000);
        // System.out.println(kunal.population); it show warning because we will access with the help of class name
        //now we created 3 human objects and it will directly effect the population
        //if we simply ceate population without static then it wont possible to access population without create objects
        //to access static property we need classname.propertyName
        // System.out.println(Human.population);
        
        // greeting() we won't be able to access because to access we need to create object of main object and then 
        //with the help of instance of that object we can acess
        Static obj = new Static();
        obj.greeting(); // way to access non static in static method
    }
    //we can access the non static in non static method
    //because we will be able to acess the method only when new object is created
    void func(){
        //at the end func need an object to acces it
        //greeting will use that object to access greeting method
        greeting();
    }


    //created another method in main class which is not static
    void greeting(){
        System.out.println("Hello I am here for greeting you!");
        // accessable(); static will be available every where in the class but non static will be only available after creating instance of the class
    }

    static void accessable(){
        System.out.println("I am accessable in static and non static as well :)");
    }
}


class Human{
    String name;
    int age;
    int salary;
    static int population;

    static void hello(){
        System.out.println("Hello!");
        // System.out.println(this.age);  cant use because it is independent of class objects
    }
    
    Human(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        //here we are accssing the value of class human and it will be changed when new object is created
        //because whenever instance of class created then constructor is called
        Human.population+=1;
    }

}
