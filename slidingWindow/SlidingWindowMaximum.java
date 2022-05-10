package slidingWindow;
import java.util.*;
public class SlidingWindowMaximum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}		
		int k = sc.nextInt();
		System.out.println(Arrays.toString(maxSlidingWindow(arr,k)));
	}
//	[-7,-8,7,5,7,1,6,0]
//	4
	
	 public static int[] maxSlidingWindow(int[] nums, int k) {
	        Deque<Integer> dq = new LinkedList<>();
	        int i=0,j=0,n=nums.length,t=0;
	        int[] ans = new int[n-k+1];
	        while(j<n) {
	        while(dq.size()>0 && dq.getLast()<nums[j]) {
	        	dq.removeLast();
	        }
	        
	        dq.addLast(nums[j]);
	        if(j-i+1<k) {
	        	j++;
	        	continue;
	        }
   
	        ans[t++] = dq.getFirst();
	        if(nums[i]==dq.getFirst()) dq.removeFirst();
	        i++;
	        j++;
	        }
	        return ans;
	    }
}
