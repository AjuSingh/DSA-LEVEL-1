package StackAndQueue.stacksquestion;

import java.util.*;

public class ReversePolishNotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.next();
		}
		System.out.println(evalRPN(arr));
	}
	
	
//	Input: tokens = ["2","1","+","3","*"]
//	Output: 9
//	Explanation: ((2 + 1) * 3) = 9

	 public static int evalRPN(String[] tokens) {
	        Stack<Integer> stack = new Stack<>();
	        for(String str:tokens){
	            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
	                int val1 = stack.pop();
	                int val2 = stack.pop();
	                stack.push(res(str,val1,val2));
	            }else{
	                stack.push(Integer.parseInt(str));
	            }
	        }
	        return stack.peek();
	    }
	    
	    
	    public static int res(String ch ,int val1,int val2){
	        if(ch.equals("+")) return val2+val1;
	        else if(ch.equals("-")) return val2-val1;
	        else if(ch.equals("*")) return val2*val1;
	        else return val2/val1;
	    }
}
