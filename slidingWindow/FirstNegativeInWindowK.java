package slidingWindow;

import java.util.*;
public class FirstNegativeInWindowK {
// Input : 
// N = 8
// A[] = {12, -1, -7, 8, -15, 30, 16, 28}
// K = 3
// Output :
// -1 -1 -7 -15 -15 0 
    
    public static void main(String[] args) {
    System.out.println("hello with");
    }


    public static long[] printFirstNegativeInteger(long arr[], int n, int k)
    {
        ArrayList<Long> list = new ArrayList<>();
        Queue<Long> queue = new LinkedList<>();
        int i=0,j=0;
        //logic is we push the negative number in the queue 
        //we know if some element is negative and our window starting is equal to queue front means
        // that element is out of window now and cant be used in next window
        while(j<n){
            if(arr[j]<0) queue.add(arr[j]);
            //we will move out window untill we get the window of size k
            if(j-i+1<k) j++;
            else{
                if(queue.isEmpty()) list.add((long)0);
                else list.add(queue.peek());
                //means that the we exclude the prev starting negative element if there was
                if(!queue.isEmpty() && arr[i]==queue.peek()) queue.remove();
                i++;
                j++;
            }
        }
        long[] ans = new long[n-k+1];
        for(i=0;i<list.size();i++){
         ans[i] = list.get(i);   
        }
        return ans;
    }
}
