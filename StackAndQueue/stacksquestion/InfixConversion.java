package StackAndQueue.stacksquestion;

import java.util.*;

public class InfixConversion {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	System.out.println(evaluatePost(str));
//	System.out.println(evaluatePre(str));
	}
	
	
//	Sample Input
//	a*(b-c+d)/e
//	Sample Output
//	abc-d+*e/
//	/*a+-bcde
	
//we need to just change the order of the operator and operand 
	
		static String evaluatePre(String str) {
		   Stack<String> ans = new Stack<>();
		   Stack<Character> op = new Stack<>();
		   for(char ch:str.toCharArray()) {
			   if(ch>='a' && ch<='z') {
				   ans.push(ch + "");
			   }else if(ch=='(') {
				   op.push(ch);
			   }else if(ch==')') {
				   while(op.peek()!='(') {
					   String op1 = ans.pop();
					   String op2 = ans.pop();
					   char oper = op.pop();
					   ans.push(oper + op2 + op1);
				   }
				   op.pop();
			   }else {
				   while(!op.empty() && prec(ch)<=prec(op.peek()) && op.peek()!='(') {
					   String op1 = ans.pop();
					   String op2 = ans.pop();
					   char oper = op.pop();
					   ans.push(oper + op2 + op1);
				   }
				   op.push(ch);
			   }
		   }
		   
		   while(!op.empty()) {
			   String op1 = ans.pop();
			   String op2 = ans.pop();
			   char oper = op.pop();
			   ans.push(oper + op2 + op1);
		   }
		   return ans.peek();
		}
		
		
		static String evaluatePost(String str) {
			   Stack<String> ans = new Stack<>();
			   Stack<Character> op = new Stack<>();
			   for(char ch:str.toCharArray()) {
				   if(ch>='a' && ch<='z') {
					   ans.push(ch + "");
				   }else if(ch=='(') {
					   op.push(ch);
				   }else if(ch==')') {
					   while(op.peek()!='(') {
						   String op1 = ans.pop();
						   String op2 = ans.pop();
						   char oper = op.pop();
						   ans.push(op2 + op1 + oper);
					   }
					   op.pop();
				   }else {
					   while(!op.empty() && prec(ch)<=prec(op.peek()) && op.peek()!='(') {
						   String op1 = ans.pop();
						   String op2 = ans.pop();
						   char oper = op.pop();
						   ans.push(op2 + op1 + oper);
					   }
					   op.push(ch);
				   }
			   }
			   
			   while(!op.empty()) {
				   String op1 = ans.pop();
				   String op2 = ans.pop();
				   char oper = op.pop();
				   ans.push(op2 + op1 + oper);
			   }
			   return ans.peek();
			}
		
		 static int prec(char ch){
		     if(ch=='+') return 1;
		     else if(ch=='-') return 1;
		     else if(ch=='*') return 2;
		     else return 2;
		 }
	
	
	
}
