package StackAndQueue.stacksquestion;

import java.util.*;

public class PrefixEvaluationAndConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(evaluate(str));
		System.out.println(expression(str));
		System.out.println(postfixToInfix(str));
	}
	
//	Sample Input 	
//	-+2/*6483
//	Sample Output
//	2
//	((2+((6*4)/8))-3)
//	264*8/+3-
	
	
	 static int evaluate(String str)
	  {
	    Stack<Integer> stack = new Stack<>();
	    for (int i = str.length() - 1; i >= 0; i--) {
	      char ch = str.charAt(i);
	      if (Character.isDigit(ch)) {
	        stack.push(ch - '0');
	      } else {
	        stack.push(calc(stack.pop(), stack.pop(), ch));
	      }
	    }
	    return stack.peek();
	  }


	  static String expression(String str) {
	    Stack<String> stack = new Stack<>();
	    for (int i = str.length() - 1; i >= 0; i--) {
	        char ch = str.charAt(i);
	      if (Character.isDigit(ch)) {
	        stack.push(ch + "");
	      } else {
	        String s1 = stack.pop();
	        String s2  = stack.pop();
	        stack.push("(" + s1 + ch +  s2 + ")");
	      }
	    }
	    return stack.peek();
	  }

	  static String postfixToInfix(String str) {
	    Stack<String> stack = new Stack<>();
	  for (int i = str.length() - 1; i >= 0; i--) {
	        char ch = str.charAt(i);
	      if (Character.isDigit(ch)) {
	        stack.push(ch + "");
	      } else {
	        String s1 = stack.pop();
	        String s2  = stack.pop();
	        stack.push(s1 + s2 + ch);
	      }
	    }
	    return stack.peek();
	  }




	  static int calc(int op2, int op1, char ch) {
	    if (ch == '+') return op1 + op2;
	    else if (ch == '-') return op2 - op1;
	    else if (ch == '*') return op2 * op1;
	    else return op2 / op1;
	  }
}
