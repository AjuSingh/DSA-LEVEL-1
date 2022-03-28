package Oops.comparable;


//to compare two objects we need to use class Comparitor
//Comparable is interface to use compare to and ovveride the method
public class Student implements Comparable<Student> {
   int rollNo;
   int marks;

   Student(int rollNo, int marks) {
       this.rollNo = rollNo;
       this.marks = marks;
   }

   //now this method is used for both sorting and comparing of the student
    @Override
    public int compareTo(Student o) {
        //if -1 other object is greater
        //if 0 both object are equal
        //if 1 current object is greater
        return this.marks-o.marks;
    }
    
}
