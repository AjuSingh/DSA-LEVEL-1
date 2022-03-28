package Oops.comparable;
import java.util.*;
public class Main {
 public static void main(String[] args) {
    Student s1 = new Student(1,80);
    Student s2 = new Student(2,82);
    Student s3 = new Student(3,84);
    Student s4 = new Student(4,78);
   Student[] students = {s1, s2, s3, s4};
//    now if negative value then s2 has more marks
   if(s3.compareTo(s4)<0){
        System.out.println("s2 has more marks");
   }else{
       System.out.println("s1 has more marks");
   }
   //it will use the ovveride method in student class for comparision
   Arrays.sort(students);
 }
}
