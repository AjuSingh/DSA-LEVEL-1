package StackAndQueue.stacksquestion.Leetcode;
import java.util.*;
public class MostCompetetitiveSeq {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    System.out.println(Arrays.toString(mostCompetitive(arr,k)));
    sc.close();
    }

// Input: nums = [3,5,2,6], k = 2
// Output: [2,6]
// Explanation: Among the set of every possible subsequence:
//  {[3,5], [3,2], [3,6], [5,2], [5,6], [2,6]}, [2,6] is the most competitive.

    public static int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (!stack.empty() && stack.peek() > nums[i]) {
                while (!stack.empty() && stack.peek() > nums[i] && n - i > k - stack.size()) {
                    stack.pop();
                }
                stack.push(nums[i]);
            } else {
                if (stack.size() < k)
                    stack.push(nums[i]);
            }
        }

        int[] ans = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
