package StackAndQueue.stacksquestion;
import java.util.*;

public class NextLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        //we need to return the next greater element for each index
        //[1,3,2, 4]
        // | | |  |
        //[3,4,4,-1]
        System.out.println(Arrays.toString(nextLargerElement(arr, n)));
    }

    public static int[] nextLargerElement(int[] arr, int n)
    { 
        // Your code here
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.empty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            ans[i] = stack.empty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    } 
}
