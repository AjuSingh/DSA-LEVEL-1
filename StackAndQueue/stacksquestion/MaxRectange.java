package StackAndQueue.stacksquestion;
import java.util.*;

public class MaxRectange {
    public static void main(String[] args) {
        
    }

    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        if(n==1 && m==1){
            return matrix[n-1][m-1] - '0';
        }
        int max = 0;
        int[] height = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                height[j] = (matrix[i][j]=='0') ? 0 : height[j] + 1;
            }
            int res = largestRectangleArea(height);
            max=max<res ? res : max;
        }
        return max;
    }
    
    
    public int largestRectangleArea(int[] height) {
    int n = height.length;
    int[] ngr = new int[n];
    int[] ngl = new int[n];
        
    //finding the greater index at left
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<n;i++){
        while(!stack.empty() && height[stack.peek()]>=height[i]){
            stack.pop();
        }
       ngl[i] = stack.empty() ? -1 : stack.peek();
       stack.push(i);
    }
        
       stack = new Stack<>(); 
    for(int i=n-1;i>=0;i--){
        while(!stack.empty() && height[stack.peek()]>=height[i]){
            stack.pop();
        }
       ngr[i] = stack.empty() ? n : stack.peek();
       stack.push(i);
    }
        
    int maxArea=0;
    for(int i=0;i<n;i++){
        int curArea = (ngr[i]-ngl[i]-1)*height[i];
        maxArea = curArea>maxArea ? curArea : maxArea;
    }
    return maxArea; 
    }
    
    
}
