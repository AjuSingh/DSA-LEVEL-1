package BinarySearch;
import java.util.*;
public class Pivot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(pivot(arr));
    }

    // public static int search(int[] arr,int target){
    //   int pivot = pivot(arr); 
    // }

    public static int pivot(int[] arr){
      int n = arr.length;
      int s=0,e = n - 1;
      while(s<=e){
        int mid = s+(e-s)/2;
        if(mid<n-1 && arr[mid+1]<arr[mid]){
          return mid+1;
        }else if(arr[s]<=arr[mid]){
          s=mid+1;
        }else{
          e=mid-1;
        }
      }
      return -1;
    }


    public static int findPivot(int[] arr) {
        // write your code here
        int n = arr.length;
        int s = 0,e = n-1;
        while(s<=e){
          int mid = s+ (e-s)/2;
          int prev = arr[(mid+n-1)%n];
          int next = arr[(mid+1)%n];
          if(arr[mid]<=next && arr[mid]<=prev){
            return arr[mid];
          }else if(arr[mid]<=arr[e]){
            e = mid-1;
          }else{
            s = mid+1;
          }
        }
    
        return -1;
      }
}
