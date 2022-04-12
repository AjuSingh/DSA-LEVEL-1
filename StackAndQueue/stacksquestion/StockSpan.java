package StackAndQueue.stacksquestion;
import java.util.*;
public class StockSpan {
    public static void main(String[] args) {
        
    }

    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<int[]> stack = new Stack<>();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int span = 1;
            while(!stack.empty() && stack.peek()[0]<=price[i]){
                span+=stack.peek()[1];
                stack.pop();
            }
            stack.push(new int[]{price[i],span});
            ans[i]=span;
        }
        return ans;
    }
    
}
