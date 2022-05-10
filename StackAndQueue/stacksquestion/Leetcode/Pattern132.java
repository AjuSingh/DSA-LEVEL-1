package StackAndQueue.stacksquestion.Leetcode;

import java.util.*;

public class Pattern132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(find132pattern(arr));
        sc.close();
    }

    public static boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int right = Integer.MIN_VALUE;
        //right means the second largest value 
        //at stack top we have the largest element
        //nums[i] represent the smallest value among the pattern 1[nums[i]]|3[stack.peek()]|2[right]
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < right)
                return true;

            // the greater one is in the stack and the smaller one is we iterating and right
            // is the second largest element in this..
            while (!stack.empty() && stack.peek() < nums[i]) {
                right = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }

    public static boolean find132pattern2(int[] nums) {
        for (int j = 0, min = Integer.MAX_VALUE; j < nums.length; j++) {
             min = Math.min(nums[j], min);
             if (min == nums[j]) continue;
             
             for (int k = nums.length - 1; k > j; k--) {
                 if (min < nums[k] && nums[k] < nums[j]) return true;
             }
         }
         
         return false;
    }
}
