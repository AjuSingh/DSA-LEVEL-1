package Oops.Inheritence;
//to prevent the inheritance just add final keyword after public class
// it is the parent class which we used and extends it will box weight
public class Box {
    //l is accessable when super is called because it refers to the third constructor in this class
    private int l;  //it is only accessable by this class only not any one else
    int w;
    int h;
    int weight;

    Box(){
        //parent  class has  super class or parent is Object class
        //all classes which are at top has object class as parent
        // super();
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }

    //when one side is given or for cube
   Box(int side)
   {
       this.l=side;
       this.w=side;
       this.h=side;
   }
   
   //when all sides are given
   Box(int l, int w, int h){
       this.l = l;
       this.w = w;
       this.h = h;
   }

   //when old box is given
   Box(Box old){
       this.l=old.l;
       this.w=old.w;
       this.h=old.h;
   }
}
