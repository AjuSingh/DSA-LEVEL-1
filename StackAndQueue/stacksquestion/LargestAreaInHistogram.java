package StackAndQueue.stacksquestion;

import java.util.*;

public class LargestAreaInHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(largestRectangleArea(arr));
    }

    public static int largestRectangleArea(int[] height) {
        int n = height.length;
        int[] ngr = new int[n];
        int[] ngl = new int[n];

        // finding the greater index at left
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.empty() && height[stack.peek()] >= height[i]) {
                stack.pop();
            }
            ngl[i] = stack.empty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.empty() && height[stack.peek()] >= height[i]) {
                stack.pop();
            }
            ngr[i] = stack.empty() ? n : stack.peek();
            stack.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int curArea = (ngr[i] - ngl[i] - 1) * height[i];
            maxArea = curArea > maxArea ? curArea : maxArea;
        }
        return maxArea;
    }

}
