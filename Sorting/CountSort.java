package Sorting;

import java.util.*;

public class CountSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr= new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        countSort(arr,n);
        // System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void countSort(int[] arr,int n){
        //find max and min values to find size of cnt array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

        int[] count = new int[max-min+1];
        //here the index 0 represent the count of minimum element
        for(int i = 0; i < n; i++){
            count[arr[i]-min]++;
        }

        //making prefix array to get range of each element index
        for(int i = 1; i < max-min+1; i++){
            count[i]+=count[i-1];
        }

        //creating new array to get the sorted array
        //count array has index more than one so -1 is needed to get the index of that element
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            ans[count[arr[i]-min]-1]=arr[i];
            count[arr[i]-min]--;
        }
        System.out.println(Arrays.toString(ans));
        return;
    }
}
