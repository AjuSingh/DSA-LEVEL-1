package StackAndQueue.stacksquestion;
import java.util.*;
public class InfixEvaluation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(evaluate(str));
		sc.close();
	}
	//we have three main conditions
	//1.If we get the digit then we will just push into operand stack
	//2.We will ignore spaces and if we encounter ( we will push because it decide untill how much we need to pop the element from the operand stack
	//3.we will pop from operator when we get the operator of greater precidence or equal precidence 
	
	
	static int evaluate(String exp) {
		 Stack<Integer> num = new Stack<>();
		   Stack<Character> oper = new Stack<>();
		   for(char ch:exp.toCharArray()){
		       if(Character.isDigit(ch)){
		           num.push(ch- '0');
		       }else if(ch=='('){
		           oper.push(ch);
		       }else if(ch==')'){
		           while(oper.peek()!='('){
		               int op1 = num.pop();
		               int op2 = num.pop();
		               char op = oper.pop();
		               num.push(calc(op1,op2,op));
		           }
		           oper.pop();
		           //else if because we have spaces also present in the string
		       }else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
		           while(!oper.empty() && prec(ch)<=prec(oper.peek()) && oper.peek()!='('){
		               int op1 = num.pop();
		               int op2 = num.pop();
		               char op = oper.pop();
		               num.push(calc(op1,op2,op));
		           }
		           oper.push(ch);
		       }
		   }
		   
		   while(!oper.empty()){
		         int op1 = num.pop();
		         int op2 = num.pop();
		         char op = oper.pop();
		         num.push(calc(op1,op2,op));
		   }
		   return num.peek();
	}
	
	 static int prec(char ch){
	     if(ch=='+') return 1;
	     else if(ch=='-') return 1;
	     else if(ch=='*') return 2;
	     else return 2;
	 }
	 
	 
	 static int calc(int op1,int op2,char ch){
	     if(ch=='+') return op1+op2;
	     else if(ch=='-') return op2-op1;
	     else if(ch=='*') return op2*op1;
	     else return op2/op1;
	 }

}
