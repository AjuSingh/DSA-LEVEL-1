package lambda;


//now if there is only one method in the interface then it is know as functional interface
//other example of the functional interface are comparable and comparator
interface Test {
	void method1();

//	void method2();
}

//we have many ways to use the methods of this interface
// create a class and implements the methods of this class
// use with the help of anonymous class and implements the methods


//method1
//class Imp implements Test {
//	public void method1() {
//		System.out.println("I am method 1");
//	}
//
//	public void method2() {
//		System.out.println("I am method 2");
//	}
//}

public class Main {
	public static void main(String[] args) {
		//method 2 using the anonymous class
//		Test obj = new Test() {
//		   public void method1() {
//			   System.out.println("I am method1");
//		   }
//		   
//		   
//		   public void method2() {
//			   System.out.println("I am method2");
//		   }
//		};
//		
//		
//		obj.method1();
	
		
		//now how to implement the functional interface using lambda expression
//		Test obj = ()->{
//			System.out.println("I am the only method of the functional interface");
//		};
//		obj.method1();
		
	}
}
