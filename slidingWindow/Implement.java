package slidingWindow;
import java.util.*;
public class Implement {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt(); 
    //    ArrayList<Integer> list = new ArrayList<Integer>();
    //    for(int i = 0; i < n; i++) {
    //        list.add(sc.nextInt());
    //    }
    //    System.out.println(list);
    System.out.println(maxSub(3,new int[]{3,5,2,7,4}));
       sc.close();
    }

    static int maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
        // code here
        int max = 0;
        for(int i=0;i<k;i++){
            max+=arr.get(i);
        }
        int curSum=max;
        for(int i=1;i+k-1<n;i++){
            curSum -= arr.get(i-1);
            curSum+=arr.get(i+k-1);
            max = curSum>max ? curSum : max;
        }
        return max;
    }

    static int maxSub(int k,int[] arr){
        int max = 0,cur=0,i=0,j=0;
        //j-i+1 represent the current window size 
        while(j<arr.length){
            cur = cur + arr[j];
            if(j-i+1<k) j++;
            else {
                max = Math.max(cur,max);
                cur-=arr[i];
                i++;
                j++; 
            }
        }
        return max;
    }


}
