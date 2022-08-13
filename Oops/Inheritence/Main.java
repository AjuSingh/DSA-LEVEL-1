package Oops.Inheritence;

public class Main {
    public static void main(String[] args) {
        
        // Box box = new Box();
        // box.l; //it is only accessable within the class object cant access it
        // System.out.println(box.h + " " + box.h);

        BoxWeight box2 = new BoxWeight();
        System.out.println(box2.h + " "  + box2.weight); // here we are accessing box parent and child variables

        //child can acess the parent instance varaibls and methods but a parent cant access the child instance variables and methods
        //because the instance created is of only that class
       

        //super is nothing just constructor called in that class to do for which constructor is defined
        //super is constructor of parent class
        //we can access the l which is private because it called constructer inside the parent class where the l is accessable

        //parent class doesn't know what is in bottom of it
        //child class know who is its parent class
        // Box box3 = new BoxWeight(1,2,3,4);
        // System.out.println(box3.h  +  " "  + box3.w); //only two are available l is private and 
        //weight is not there because refrence type is box
        //this box has only properties of refrence variable not boxweight because the refrence type if box
        //we can intialize the values of all refrence variables as there is method but only access the values of Box
        // BoxWeight box4 = new Box(); this show error because box weight access that variable which box doesn't have box
        //basically child obj = new parent() it is not possible due to parent doesnt know who is down there
        // Box box4  = new BoxPrice(); 
        BoxPrice box5 = new BoxPrice();
        //we ge properties of both parent classes
        System.out.println(box5.h + " " + box5.price + "  " + box5.w +  " "  + box5.weight);
        
//        BoxWeight bx = new BoxWeight();
//        System.out.println(bx.);
    }
}
