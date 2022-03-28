package Oops.Inheritence;

//extends means using the properties of the parent class
        //  {ChildClass}   {ParentClass}
public class BoxWeight extends Box {
    int weight;
    BoxWeight(){
        this.weight = -1;
    }
    

    BoxWeight(int weight) {
        this.weight = weight;
    }
   
    //all three properties of Box is accessable by the class BoxWeight
    BoxWeight(int l,int w,int h,int weight){
        //super class is used to access the parent class properties or variables and methods
        //super class always be on top of the block in which we used super
        super(l,w,h);
        //if we want to access he parent class variable which has same name as child class 
        //in that case we use super class 
        // super.weight this way  parent class variable is accessable if it is public 
        this.weight = weight;
    }
}
