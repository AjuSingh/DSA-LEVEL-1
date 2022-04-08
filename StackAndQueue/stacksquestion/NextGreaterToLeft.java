package StackAndQueue.stacksquestion;
import java.util.*;
public class NextGreaterToLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int[] arr = {3,1,5,4,2};
        int[] ans = ngl(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] ngl(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!stack.empty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            ans[i] = stack.empty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    }
}
