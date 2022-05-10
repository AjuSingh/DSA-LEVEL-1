package StackAndQueue.stacksquestion;
import java.util.*;
public class PostEvaluationAndConversion {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	System.out.println(evaluate(str));
	System.out.println(expression(str));
	System.out.println(postfixToPrefix(str));
	sc.close();
	}

	
//	Sample Input
//	264*8/+3-
//	Sample Output
//	2
//	((2+((6*4)/8))-3)
//	-+2/*6483

	
	
	static String expression(String str){
		  Stack<String> stack = new Stack<>();
		  for(char ch:str.toCharArray()){
		      if(Character.isDigit(ch)){
		          stack.push(ch + "");
		      }else{
		          String s1 = stack.pop();
		          String s2  = stack.pop();
		          stack.push("(" + s2 + ch +  s1 + ")");
		      }
		  }
		  return stack.peek();
		 }
		 
		  static String postfixToPrefix(String str){
		  Stack<String> stack = new Stack<>();
		  for(char ch:str.toCharArray()){
		      if(Character.isDigit(ch)){
		          stack.push(ch + "");
		      }else{
		          String s1 = stack.pop();
		          String s2  = stack.pop();
		          stack.push(ch + s2 + s1);
		      }
		  }
		  return stack.peek();
		 }
		 
		 
		 static int evaluate(String str){
		  Stack<Integer> stack = new Stack<>();
		  for(char ch:str.toCharArray()){
		     if(Character.isDigit(ch)){
		         stack.push(ch-'0');
		     }else{
		         stack.push(calc(stack.pop(),stack.pop(),ch));
		     } 
		  }
		  return stack.peek();
		 }
		 
		 
		  static int calc(int op1,int op2,char ch){
			     if(ch=='+') return op1+op2;
			     else if(ch=='-') return op2-op1;
			     else if(ch=='*') return op2*op1;
			     else return op2/op1;
		}
	
	
	
}
