package BinarySearch;
import java.util.*;
public class SplitLargestSumArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]  = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(splitArray(arr,m));
    }

    public static int splitArray(int[] arr, int m) {
        int sum=0,max=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max = Math.max(arr[i],max);
        }
        
        //now setting the range of starting and ending
        int s=max,e=sum;
        while(s<e){
        int mid = s+ (e-s)/2;
        int curSum=0;
        int cnt=1;
        for(int x:arr){
            if(x+curSum>mid){
                curSum=x;
                cnt++;
            }else{
                curSum+=x;
            }
        }
        
        //if the cnt is greater than m that means the individual sum is less so we will 
        // increase the range of its individual subarray sum
        if(cnt<=m){
            e=mid;
        }else{
            s=mid+1;
        }      
        }
        //return s or e because the both are same;
        return s;
    }
}
