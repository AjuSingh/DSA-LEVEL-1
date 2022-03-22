package BinarySearch;
import java.util.*;
public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }


    static int peak(int[] arr){
       int n = arr.length;
       int s=0,e= n - 1;
       while(s<e){
           int mid = s + (e-s)/2;
           if(arr[mid+1]>arr[mid]){
               //we know if next elemet is greater than the next could be answer 
               s=mid+1;
           }else{
               //in this we dont know if the previous element is smaller or greater than that why we are setting the end as mid
               e=mid;
           }
       }

       //we are returning the s or end because the loop breaks when there is only one elment is left
       return s;
    }
}
