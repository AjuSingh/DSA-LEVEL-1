package TimeAndSpace;

import java.util.*;

public class sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //we have given array of length n which consist of 0,1,2
        //we will use dutch national flag algorithm for this 
        sort(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int n){
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,high,mid);
                high--;
            }
        }
    }

    static void swap(int[] arr,int i, int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
